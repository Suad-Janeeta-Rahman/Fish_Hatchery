package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import java.time.LocalDate;

public class DOReading {
    private String jarId ;
    private double doValue ;
    private LocalDate readingDate ;
    private String status ;

    public DOReading(String jarId, double doValue, LocalDate readingDate, String status) {
        this.jarId = jarId;
        this.doValue = doValue;
        this.readingDate = readingDate;
        this.status = status;
    }

    public String getJarId() {
        return jarId;
    }

    public double getDoValue() {
        return doValue;
    }

    public LocalDate getReadingDate() {
        return readingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setJarId(String jarId) {
        this.jarId = jarId;
    }

    public void setDoValue(double doValue) {
        this.doValue = doValue;
    }

    public void setReadingDate(LocalDate readingDate) {
        this.readingDate = readingDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
