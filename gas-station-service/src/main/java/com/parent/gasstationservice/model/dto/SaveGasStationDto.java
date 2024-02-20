package com.parent.gasstationservice.model.dto;


import com.google.gson.annotations.Expose;

import java.math.BigDecimal;

public class SaveGasStationDto {
    @Expose
    public String id;
    @Expose
    public String name;
    @Expose
    public String brand;
    @Expose
    public String street;
    @Expose
    public String place;
    @Expose
    public BigDecimal lat;
    @Expose
    public BigDecimal lng;
    @Expose
    public BigDecimal dist;
    @Expose
    public BigDecimal diesel;
    @Expose
    public BigDecimal e5;
    @Expose
    public BigDecimal e10;
    @Expose
    public boolean isOpen;
    @Expose
    public String houseNumber;
    @Expose
    public Integer postCode;

    public SaveGasStationDto() {
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
