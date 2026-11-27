package com.example.fish_hatchery.ridwan_2412433.user.aquatic_pathologist;

import java.time.LocalDate;

public class FishHealthRecords {
    private int recordId;
    private String fishId;
    private String fishSpecies;
    private String pondId;
    private String healthCondition;
    private int affectedQuantity;
    private LocalDate observationDate;

    public FishHealthRecords(int recordId, String fishId, String fishSpecies, String pondId, String healthCondition, int affectedQuantity, LocalDate observationDate) {
        this.recordId = recordId;
        this.fishId = fishId;
        this.fishSpecies = fishSpecies;
        this.pondId = pondId;
        this.healthCondition = healthCondition;
        this.affectedQuantity = affectedQuantity;
        this.observationDate = observationDate;
    }

    public int getRecordId() {
        return recordId;
    }

    public String getFishId() {
        return fishId;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public String getPondId() {
        return pondId;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public int getAffectedQuantity() {
        return affectedQuantity;
    }

    public LocalDate getObservationDate() {
        return observationDate;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }
}
