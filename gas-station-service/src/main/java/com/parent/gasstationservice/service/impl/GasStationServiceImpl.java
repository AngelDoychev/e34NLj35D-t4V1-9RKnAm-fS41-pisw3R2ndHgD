package com.parent.gasstationservice.service.impl;

import com.google.gson.Gson;
import com.parent.gasstationservice.model.dto.AllSavedGasStationsDto;
import com.parent.gasstationservice.model.dto.SaveGasStationDto;
import com.parent.gasstationservice.model.entity.GasStation;
import com.parent.gasstationservice.repository.GasStationRepository;
import com.parent.gasstationservice.service.GasStationService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;


@Service
public class GasStationServiceImpl implements GasStationService {
    private final GasStationRepository gasStationRepository;
    private final ModelMapper modelMapper;
    private final Gson gson;
    private static final String GAS_STATION_JSON_URL = "https://wejago.de/assets/data/gas-stations-data.json";

    public GasStationServiceImpl(GasStationRepository gasStationRepository, ModelMapper modelMapper, Gson gson) {
        this.gasStationRepository = gasStationRepository;
        this.modelMapper = modelMapper;
        this.gson = gson;
    }

    @Override
    public void init() throws IOException {
        InputStreamReader reader = new InputStreamReader(new URL(GAS_STATION_JSON_URL).openStream());
        AllSavedGasStationsDto allSavedGasStationsDto = this.gson.fromJson(reader, AllSavedGasStationsDto.class);
        allSavedGasStationsDto
                .getStations()
                .stream()
                .filter(SaveGasStationDto::isOpen)
                .map(saveGasStationDto -> this.modelMapper.map(saveGasStationDto, GasStation.class))
                .forEach(this.gasStationRepository::save);
    }

    @Override
    public boolean isEmpty() {
        return this.gasStationRepository.count() == 0;
    }

    @Override
    public GasStation findByName(String name) {
        return this.gasStationRepository.findByName(name);
    }

    @Override
    public BigDecimal getPrice(String statType, String gasType) {
        switch (gasType) {
            case "diesel" -> {
                if (statType.equals("median")) {
                    return this.gasStationRepository.findAverageDiesel();
                } else if (statType.equals("maximum")) {
                    return this.gasStationRepository.findTopByOrderByDieselDesc().getDiesel();
                } else if (statType.equals("minimum")) {
                    return this.gasStationRepository.findTopByOrderByDieselAsc();
                } else {
                    return null;
                }

            }
            case "e5" -> {
                if (statType.equals("median")) {
                    return this.gasStationRepository.findAverageE5();
                } else if (statType.equals("maximum")) {
                    return this.gasStationRepository.findTopByOrderByE5Desc().getDiesel();
                } else if (statType.equals("minimum")) {
                    return this.gasStationRepository.findTopByOrderByE5Asc().getDiesel();
                } else {
                    return null;
                }
            }
            case "e10" -> {
                if (statType.equals("median")) {
                    return this.gasStationRepository.findAverageE10();
                } else if (statType.equals("maximum")) {
                    return this.gasStationRepository.findTopByOrderByE10Desc().getDiesel();
                } else if (statType.equals("minimum")) {
                    return this.gasStationRepository.findTopByOrderByE10Asc().getDiesel();
                } else {
                    return null;
                }
            }
            default -> {
                return null;
            }
        }
    }
}
