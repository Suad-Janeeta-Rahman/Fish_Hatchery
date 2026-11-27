
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import java.time.LocalDate;

public class FeedDistribution {

    private String distributionId;
    private String feedName;
    private String recipientName;
    private double quantity;
    private String unit;
    private LocalDate distributionDate;
    private String purpose;
    private String remarks;

    public FeedDistribution(String distributionId, String feedName,
                            String recipientName, double quantity,
                            String unit, LocalDate distributionDate,
                            String purpose, String remarks) {

        this.distributionId = distributionId;
        this.feedName = feedName;
        this.recipientName = recipientName;
        this.quantity = quantity;
        this.unit = unit;
        this.distributionDate = distributionDate;
        this.purpose = purpose;
        this.remarks = remarks;
    }

    public String getDistributionId() {
        return distributionId;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
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

    public LocalDate getDistributionDate() {
        return distributionDate;
    }

    public void setDistributionDate(LocalDate distributionDate) {
        this.distributionDate = distributionDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "FeedDistribution{" + "distributionId='" + distributionId + ", feedName='" + feedName +
                ", recipientName='" + recipientName + ", quantity=" + quantity +
                ", unit='" + unit + ", distributionDate=" + distributionDate +
                ", purpose='" + purpose + ", remarks='" + remarks + '}';
    }
}
