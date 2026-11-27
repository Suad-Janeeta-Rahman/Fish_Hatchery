
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import java.time.LocalDate;

public class DamagedFeed {

    private String recordId;
    private String feedName;
    private double quantity;
    private String unit;
    private String damageType;
    private String reason;
    private LocalDate reportDate;
    private String remarks;

    public DamagedFeed(String recordId, String feedName,
                       double quantity, String unit,
                       String damageType, String reason,
                       LocalDate reportDate, String remarks) {

        this.recordId = recordId;
        this.feedName = feedName;
        this.quantity = quantity;
        this.unit = unit;
        this.damageType = damageType;
        this.reason = reason;
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
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

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "DamagedFeed{" + "recordId='" + recordId + ", feedName='" + feedName +
                ", quantity=" + quantity + ", unit='" + unit + ", damageType='" + damageType +
                ", reason='" + reason + ", reportDate=" + reportDate + ", remarks='" + remarks + '}';
    }
}
