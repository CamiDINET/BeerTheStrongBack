package com.myProject.beerTheStrong.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Yeast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String style;
    private String brand;
    private Integer temperatureMinimum;
    private Integer temperatureMaximum;
    private String sediment;
    private Double pitchingRateMinimum;
    private Double pitchingRateMaximum;
    private String aromas;
    private String type;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brandt) {
        this.brand = brandt;
    }
    public Integer getTemperatureMinimum() {
        return temperatureMinimum;
    }
    public void setTemperatureMinimum(Integer temperatureMinimum) {
        this.temperatureMinimum = temperatureMinimum;
    }
    public Integer getTemperatureMaximum() {
        return temperatureMaximum;
    }
    public void setTemperatureMaximum(Integer temperatureMaximum) {
        this.temperatureMaximum = temperatureMaximum;
    }
    public String getSediment() {
        return sediment;
    }
    public void setSediment(String sediment) {
        this.sediment = sediment;
    }
    public Double getPitchingRateMinimum() {
        return pitchingRateMinimum;
    }
    public void setPitchingRateMinimum(Double pitchingRateMinimum) {
        this.pitchingRateMinimum = pitchingRateMinimum;
    }
    public Double getPitchingRateMaximum() {
        return pitchingRateMaximum;
    }
    public void setPitchingRateMaximum(Double pitchingRateMaximum) {
        this.pitchingRateMaximum = pitchingRateMaximum;
    }
    public String getAromas() {
        return aromas;
    }
    public void setAromas(String aromas) {
        this.aromas = aromas;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
