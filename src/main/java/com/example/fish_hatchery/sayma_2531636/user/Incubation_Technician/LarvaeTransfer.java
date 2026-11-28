package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

import java.time.LocalDate;

public class LarvaeTransfer {
    private String transferId ;
    private String batchId ;
    private int larvaeQuantity ;
    private String destinationTank ;
    private LocalDate transferDate ;
    private int remainingLarvae ;

    public LarvaeTransfer(String transferId, String batchId, int larvaeQuantity, String destinationTank, LocalDate transferDate, int remainingLarvae) {
        this.transferId = transferId;
        this.batchId = batchId;
        this.larvaeQuantity = larvaeQuantity;
        this.destinationTank = destinationTank;
        this.transferDate = transferDate;
        this.remainingLarvae = remainingLarvae;
    }

    public String getTransferId() {
        return transferId;
    }

    public String getBatchId() {
        return batchId;
    }

    public int getLarvaeQuantity() {
        return larvaeQuantity;
    }

    public String getDestinationTank() {
        return destinationTank;
    }

    public LocalDate getTransferDate() {
        return transferDate;
    }

    public int getRemainingLarvae() {
        return remainingLarvae;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setLarvaeQuantity(int larvaeQuantity) {
        this.larvaeQuantity = larvaeQuantity;
    }

    public void setDestinationTank(String destinationTank) {
        this.destinationTank = destinationTank;
    }

    public void setTransferDate(LocalDate transferDate) {
        this.transferDate = transferDate;
    }

    public void setRemainingLarvae(int remainingLarvae) {
        this.remainingLarvae = remainingLarvae;
    }
}
