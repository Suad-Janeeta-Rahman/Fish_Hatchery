package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;
import java.io.Serializable;

public class FarmDashboard implements Serializable {
    private int totalPonds;
    private int totalFish;
    private int totalBatches;
    private int totalMortality;
    private String farmStatus;

    public FarmDashboard(int totalPonds, int totalFish, int totalBatches, int totalMortality, String farmStatus) {
        this.totalPonds = totalPonds;
        this.totalFish = totalFish;
        this.totalBatches = totalBatches;
        this.totalMortality = totalMortality;
        this.farmStatus = farmStatus;
    }

    public int getTotalPonds() {
        return totalPonds;
    }

    public int getTotalFish() {
        return totalFish;
    }

    public int getTotalBatches() {
        return totalBatches;
    }

    public int getTotalMortality() {
        return totalMortality;
    }

    public String getFarmStatus() {
        return farmStatus;
    }
}


