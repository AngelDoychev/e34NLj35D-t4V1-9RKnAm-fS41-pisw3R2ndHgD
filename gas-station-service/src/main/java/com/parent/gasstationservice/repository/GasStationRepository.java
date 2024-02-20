package com.parent.gasstationservice.repository;

import com.parent.gasstationservice.model.dto.SaveGasStationDto;
import com.parent.gasstationservice.model.entity.GasStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface GasStationRepository extends JpaRepository<GasStation, String> {
    GasStation findByName(String name);

    GasStation findTopByOrderByDieselDesc();
@Query("SELECT Min(g.diesel) from GasStation g")
    BigDecimal findTopByOrderByDieselAsc();

    GasStation findTopByOrderByE5Desc();

    GasStation findTopByOrderByE5Asc();

    GasStation findTopByOrderByE10Desc();

    GasStation findTopByOrderByE10Asc();

    @Query("SELECT AVG(g.diesel) FROM GasStation g")
    BigDecimal findAverageDiesel();
    @Query(value = "SELECT AVG(g.e5) FROM GasStation g")
    BigDecimal findAverageE5();
    @Query(value = "SELECT AVG(g.e10) FROM GasStation g")
    BigDecimal findAverageE10();
}
