
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import java.time.LocalDate;

public class FeedSupplyRequest {

    private String requestId;
    private String feedName;
    private String requesterName;
    private double requestedQuantity;
    private String unit;
    private LocalDate requestDate;
    private String priority;
    private String status;
    private String remarks;

    public FeedSupplyRequest(String requestId, String feedName,
                             String requesterName, double requestedQuantity,
                             String unit, LocalDate requestDate,
                             String priority, String status,
                             String remarks) {

        this.requestId = requestId;
        this.feedName = feedName;
        this.requesterName = requesterName;
        this.requestedQuantity = requestedQuantity;
        this.unit = unit;
        this.requestDate = requestDate;
        this.priority = priority;
        this.status = status;
        this.remarks = remarks;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getFeedName() {
        return feedName;
    }

    public void setFeedName(String feedName) {
        this.feedName = feedName;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public double getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(double requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "FeedSupplyRequest{" +   "requestId='" + requestId +
                ", feedName='" + feedName +  ", requesterName='" + requesterName +
                ", requestedQuantity=" + requestedQuantity + ", unit='" + unit +
                ", requestDate=" + requestDate + ", priority='" + priority +
                ", status='" + status + ", remarks='" + remarks + '}';
    }
}
