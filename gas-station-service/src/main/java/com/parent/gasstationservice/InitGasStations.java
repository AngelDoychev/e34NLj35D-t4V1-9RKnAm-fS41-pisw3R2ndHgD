package com.parent.gasstationservice;

import com.parent.gasstationservice.service.GasStationService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitGasStations implements ApplicationRunner {
    private final GasStationService gasStationService;

    public InitGasStations(GasStationService gasStationService) {
        this.gasStationService = gasStationService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (this.gasStationService.isEmpty()){
            this.gasStationService.init();
        }
    }
}
