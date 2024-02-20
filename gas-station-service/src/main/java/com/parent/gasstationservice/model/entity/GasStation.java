package com.parent.gasstationservice.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "gas_station")
public class GasStation {
    @Id
    @Column(nullable = false, unique = true)
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "brand")
    private String brand;
    @Column(name = "street")
    private String street;
    @Column(name = "place")
    private String place;
    @Column(name = "lat")
    private BigDecimal lat;
    @Column(name = "lng")
    private BigDecimal lng;
    @Column(name = "dist")
    private BigDecimal dist;
    @Column(name = "diesel")
    private BigDecimal diesel;
    @Column(name = "e5")
    private BigDecimal e5;
    @Column(name = "e10")
    private BigDecimal e10;
    @Column(name = "is_open")
    private boolean isOpen;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "post_code")
    private Integer postCode;

    public GasStation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getDist() {
        return dist;
    }

    public void setDist(BigDecimal dist) {
        this.dist = dist;
    }

    public BigDecimal getDiesel() {
        return diesel;
    }

    public void setDiesel(BigDecimal diesel) {
        this.diesel = diesel;
    }

    public BigDecimal getE5() {
        return e5;
    }

    public void setE5(BigDecimal e5) {
        this.e5 = e5;
    }

    public BigDecimal getE10() {
        return e10;
    }

    public void setE10(BigDecimal e10) {
        this.e10 = e10;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
}
