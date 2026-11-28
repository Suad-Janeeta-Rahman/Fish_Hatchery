package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import java.time.LocalDate;

public class EggBatch {
    private String batchId ;
    private String eggType ;
    private int eggQuantity ;
    private LocalDate collectionDate ;
    private LocalDate registrationDate ;

    public EggBatch(String batchId, String eggType, int eggQuantity, LocalDate collectionDate, LocalDate registrationDate) {
        this.batchId = batchId;
        this.eggType = eggType;
        this.eggQuantity = eggQuantity;
        this.collectionDate = collectionDate;
        this.registrationDate = registrationDate;
    }


    public String getBatchId() {
        return batchId;
    }

    public String getEggType() {
        return eggType;
    }

    public int getEggQuantity() {
        return eggQuantity;
    }

    public LocalDate getCollectionDate() {
        return collectionDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    public void setEggQuantity(int eggQuantity) {
        this.eggQuantity = eggQuantity;
    }

    public void setCollectionDate(LocalDate collectionDate) {
        this.collectionDate = collectionDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}
