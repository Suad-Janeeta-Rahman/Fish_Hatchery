package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import java.time.LocalDate;

public class DeadEggRecord {
    private String batchId ;
    private int deadEggCount ;
    private LocalDate recordDate ;
    private int liveEggCount ;
    private double mortalityRate ;

    public DeadEggRecord(String batchId, int deadEggCount, LocalDate recordDate, int liveEggCount, double mortalityRate) {
        this.batchId = batchId;
        this.deadEggCount = deadEggCount;
        this.recordDate = recordDate;
        this.liveEggCount = liveEggCount;
        this.mortalityRate = mortalityRate;

    }

    public String getBatchId() {
        return batchId;
    }

    public int getDeadEggCount() {
        return deadEggCount;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public int getLiveEggCount() {
        return liveEggCount;
    }

    public double getMortalityRate() {
        return mortalityRate;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setDeadEggCount(int deadEggCount) {
        this.deadEggCount = deadEggCount;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public void setLiveEggCount(int liveEggCount) {
        this.liveEggCount = liveEggCount;
    }

    public void setMortalityRate(double mortalityRate) {
        this.mortalityRate = mortalityRate;
    }
}
