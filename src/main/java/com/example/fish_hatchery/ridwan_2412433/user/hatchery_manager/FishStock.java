package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;

public class FishStock {
    private int stockId;
    private String fishSpecies;
    private int quantity;
    private double averageWeight;
    private String pondId;
    private String batchId;
    private int mortalityCount;
    private String stockStatus;

    public FishStock(int stockId, String fishSpecies, int quantity, double averageWeight, String pondId, String batchId, int mortalityCount, String stockStatus) {
        this.stockId = stockId;
        this.fishSpecies = fishSpecies;
        this.quantity = quantity;
        this.averageWeight = averageWeight;
        this.pondId = pondId;
        this.batchId = batchId;
        this.mortalityCount = mortalityCount;
        this.stockStatus = stockStatus;
    }

    public int getStockId() {
        return stockId;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public String getPondId() {
        return pondId;
    }

    public String getBatchId() {
        return batchId;
    }

    public int getMortalityCount() {
        return mortalityCount;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }
}
