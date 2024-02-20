package com.parent.gasstationservice.controller;

import com.parent.gasstationservice.model.entity.GasStation;
import com.parent.gasstationservice.service.GasStationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/gas-station")
public class GasStationController {
    private final GasStationService gasStationService;

    public GasStationController(GasStationService gasStationService) {
        this.gasStationService = gasStationService;
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<GasStation> findGasStationByName(@PathVariable("name") String name) {
        GasStation gasStation = this.gasStationService.findByName(name);
        return new ResponseEntity<>(gasStation, HttpStatus.OK);
    }

    @GetMapping("/gas-price/{stat-type}/{gas-type}")
    public ResponseEntity<BigDecimal> getGasPrice(@PathVariable("stat-type") String statType, @PathVariable("gas-type") String gasType) {
        BigDecimal price = this.gasStationService.getPrice(statType, gasType);
        if (null == price) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(price, HttpStatus.OK);
    }

}
