package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

public class HatchSuccessRecord {
    private String batchId ;
    private int hatchCount ;
    private int totalEggs ;
    private double hatchSuccessRatio ;

    public HatchSuccessRecord(String batchId, int hatchCount, int totalEggs, double hatchSuccessRatio) {
        this.batchId = batchId;
        this.hatchCount = hatchCount;
        this.totalEggs = totalEggs;
        this.hatchSuccessRatio = hatchSuccessRatio;
    }

    public String getBatchId() {
        return batchId;
    }

    public int getHatchCount() {
        return hatchCount;
    }

    public int getTotalEggs() {
        return totalEggs;
    }

    public double getHatchSuccessRatio() {
        return hatchSuccessRatio;
    }

    public void setHatchSuccessRatio(double hatchSuccessRatio) {
        this.hatchSuccessRatio = hatchSuccessRatio;
    }
}
