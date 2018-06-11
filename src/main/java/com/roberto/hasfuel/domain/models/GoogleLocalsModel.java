package com.roberto.hasfuel.domain.models;

public class GoogleLocalsModel {
    private String id;
    private String icon;
    private String name;
    private Double latitude;
    private Double longitude;

    public GoogleLocalsModel() {
        setId("");
        setIcon("");
        setName("");
        setLatitude(0.0);
        setLongitude(0.0);
    }

    public GoogleLocalsModel(String id, String icon, String name, Double latitude, Double longitude) {
        setId(id);
        setIcon(icon);
        setName(name);
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
