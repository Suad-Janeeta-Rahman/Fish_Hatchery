
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import java.time.LocalDate;

public class ReceivedFeedSupply {

    private String supplyId;
    private String feedName;
    private String supplierName;
    private double quantity;
    private String unit;
    private double unitPrice;
    private LocalDate receivedDate;
    private LocalDate expiryDate;
    private String remarks;

    public ReceivedFeedSupply(String supplyId, String feedName,
                              String supplierName, double quantity,
                              String unit, double unitPrice,
                              LocalDate receivedDate, LocalDate expiryDate,
                              String remarks) {

        this.supplyId = supplyId;
        this.feedName = feedName;
        this.supplierName = supplierName;
        this.quantity = quantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.receivedDate = receivedDate;
        this.expiryDate = expiryDate;
        this.remarks = remarks;
    }

    public String getSupplyId() {
        return supplyId;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public double getTotalCost() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "ReceivedFeedSupply{" +
                "supplyId='" + supplyId + ", feedName='" + feedName +
                ", supplierName='" + supplierName + ", quantity=" + quantity + ", unit='" + unit +
                ", unitPrice=" + unitPrice + ", totalCost=" + getTotalCost() + ", receivedDate=" + receivedDate +
                ", expiryDate=" + expiryDate + ", remarks='" + remarks + '}';
    }
}
