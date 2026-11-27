package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;

import java.time.LocalDate;

public class WaterQuality {
    private int waterQualityId;
    private String pondId;
    private double temperature;
    private double pHLevel;
    private LocalDate recordedDate;
    private String waterStatus;

    public WaterQuality(int waterQualityId, String pondId, double temperature, double pHLevel, LocalDate recordedDate, String waterStatus) {
        this.waterQualityId = waterQualityId;
        this.pondId = pondId;
        this.temperature = temperature;
        this.pHLevel = pHLevel;
        this.recordedDate = recordedDate;
        this.waterStatus = waterStatus;
    }

    public int getWaterQualityId() {
        return waterQualityId;
    }

    public String getPondId() {
        return pondId;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getpHLevel() {
        return pHLevel;
    }

    public LocalDate getRecordedDate() {
        return recordedDate;
    }

    public String getWaterStatus() {
        return waterStatus;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setpHLevel(double pHLevel) {
        this.pHLevel = pHLevel;
    }

    public void setWaterStatus(String waterStatus) {
        this.waterStatus = waterStatus;
    }
}
