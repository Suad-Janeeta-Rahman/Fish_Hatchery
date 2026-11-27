package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;

import java.time.LocalDate;

public class ProductionStatistics {
    private int productionId;
    private String fishSpecies;
    private int totalProduced;
    private int totalHarvested;
    private int totalMortality;
    private double productionRate;
    private double mortalityRate;
    private LocalDate productionDate;
    private String productionPeriod;

    public ProductionStatistics(int productionId, String fishSpecies, int totalProduced, int totalHarvested, int totalMortality, double productionRate, double mortalityRate, LocalDate productionDate, String productionPeriod) {
        this.productionId = productionId;
        this.fishSpecies = fishSpecies;
        this.totalProduced = totalProduced;
        this.totalHarvested = totalHarvested;
        this.totalMortality = totalMortality;
        this.productionRate = productionRate;
        this.mortalityRate = mortalityRate;
        this.productionDate = productionDate;
        this.productionPeriod = productionPeriod;
    }

    public int getProductionId() {
        return productionId;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public int getTotalProduced() {
        return totalProduced;
    }

    public int getTotalHarvested() {
        return totalHarvested;
    }

    public int getTotalMortality() {
        return totalMortality;
    }

    public double getProductionRate() {
        return productionRate;
    }

    public double getMortalityRate() {
        return mortalityRate;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public String getProductionPeriod() {
        return productionPeriod;
    }

    public void setTotalProduced(int totalProduced) {
        this.totalProduced = totalProduced;
    }

    public void setTotalHarvested(int totalHarvested) {
        this.totalHarvested = totalHarvested;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public void setProductionPeriod(String productionPeriod) {
        this.productionPeriod = productionPeriod;
    }
}
