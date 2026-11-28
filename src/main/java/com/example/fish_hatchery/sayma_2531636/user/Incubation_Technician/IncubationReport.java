package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import java.time.LocalDate;

public class IncubationReport {
    private String reportType ;
    private LocalDate startDate ;
    private LocalDate endDate ;
    private int totalBatchRegistrations;
    private double averageTemperature ;
    private double averageOxygenLevel ;
    private int totalMortality ;
    private double hatchSuccessRatio ;
    private int totalLarvaeTransfer ;

    public IncubationReport(String reportType, LocalDate startDate, LocalDate endDate, int totalBatchRegistrations, double averageTemperature, double averageOxygenLevel, int totalMortality, double hatchSuccessRatio, int totalLarvaeTransfer) {
        this.reportType = reportType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalBatchRegistrations = totalBatchRegistrations;
        this.averageTemperature = averageTemperature;
        this.averageOxygenLevel = averageOxygenLevel;
        this.totalMortality = totalMortality;
        this.hatchSuccessRatio = hatchSuccessRatio;
        this.totalLarvaeTransfer = totalLarvaeTransfer;
    }

    public String getReportType() {
        return reportType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getTotalBatchRegistrations() {
        return totalBatchRegistrations;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public double getAverageOxygenLevel() {
        return averageOxygenLevel;
    }

    public int getTotalMortality() {
        return totalMortality;
    }

    public double getHatchSuccessRatio() {
        return hatchSuccessRatio;
    }

    public int getTotalLarvaeTransfer() {
        return totalLarvaeTransfer;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setTotalBatchRegistrations(int totalBatchRegistrations) {
        this.totalBatchRegistrations = totalBatchRegistrations;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public void setAverageOxygenLevel(double averageOxygenLevel) {
        this.averageOxygenLevel = averageOxygenLevel;
    }

    public void setTotalMortality(int totalMortality) {
        this.totalMortality = totalMortality;
    }

    public void setHatchSuccessRatio(double hatchSuccessRatio) {
        this.hatchSuccessRatio = hatchSuccessRatio;
    }

    public void setTotalLarvaeTransfer(int totalLarvaeTransfer) {
        this.totalLarvaeTransfer = totalLarvaeTransfer;
    }
}
