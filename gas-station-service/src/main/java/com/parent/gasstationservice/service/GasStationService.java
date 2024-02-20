package com.parent.gasstationservice.service;

import com.parent.gasstationservice.model.entity.GasStation;

import java.io.IOException;
import java.math.BigDecimal;

public interface GasStationService {
    void init() throws IOException;

    boolean isEmpty();

    GasStation findByName(String name);

    BigDecimal getPrice(String statType, String gasType);
}
