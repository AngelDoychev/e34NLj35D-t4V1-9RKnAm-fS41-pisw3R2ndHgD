package com.parent.gasstationservice.model.dto;

import com.google.gson.annotations.Expose;

import java.util.List;

public class AllSavedGasStationsDto {
    @Expose
    public List<SaveGasStationDto> stations;

    public AllSavedGasStationsDto() {
    }

    public List<SaveGasStationDto> getStations() {
        return stations;
    }

    public void setStations(List<SaveGasStationDto> stations) {
        this.stations = stations;
    }
}
