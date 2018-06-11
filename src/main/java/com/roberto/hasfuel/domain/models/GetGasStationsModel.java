package com.roberto.hasfuel.domain.models;

public class GetGasStationsModel {
    private String key;
    private Double latitude;
    private Double longitude;
    private int radius;

    public GetGasStationsModel() {
        setKey("");
        setLatitude(0.0);
        setLongitude(0.0);
        setRadius(50000);
    }

    public GetGasStationsModel(String key, Double latitude, Double longitude, int radius) {
        setKey(key);
        setLatitude(latitude);
        setLongitude(longitude);
        setRadius(radius);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
