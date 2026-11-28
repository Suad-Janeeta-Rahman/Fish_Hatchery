package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

public class TemperatureRecord {
    private String jarId ;
    private double temperature ;
    private String readingTime ;
    private String status ;

    public TemperatureRecord(String jarId, double temperature, String readingTime, String status) {
        this.jarId = jarId;
        this.temperature = temperature;
        this.readingTime = readingTime;
        this.status = status;
    }

    public String getJarId() {
        return jarId;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getReadingTime() {
        return readingTime;
    }

    public String getStatus() {
        return status;
    }

    public void setJarId(String jarId) {
        this.jarId = jarId;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setReadingTime(String readingTime) {
        this.readingTime = readingTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
