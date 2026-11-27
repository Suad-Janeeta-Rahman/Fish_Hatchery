package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

public class FeedAvailability {

    private String feedId;
    private String feedName;
    private double availableQuantity;
    private double minimumStock;
    private String unit;
    private String availabilityStatus;

    public FeedAvailability(String feedId, String feedName,
                            double availableQuantity, double minimumStock,
                            String unit) {

        this.feedId = feedId;
        this.feedName = feedName;
        this.availableQuantity = availableQuantity;
        this.minimumStock = minimumStock;
        this.unit = unit;

        updateAvailabilityStatus();
    }

    public void updateAvailabilityStatus() {
        if (availableQuantity <= 0) {
            availabilityStatus = "Out of Stock";
        } else if (availableQuantity <= minimumStock) {
            availabilityStatus = "Low Stock";
        } else {
            availabilityStatus = "Available";
        }
    }

    public String getFeedId() {
        return feedId;
    }

    public String getFeedName() {
        return feedName;
    }

    public double getAvailableQuantity() {
        return availableQuantity;
    }

    public double getMinimumStock() {
        return minimumStock;
    }

    public String getUnit() {
        return unit;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailableQuantity(double availableQuantity) {
        this.availableQuantity = availableQuantity;
        updateAvailabilityStatus();
    }

    public void setMinimumStock(double minimumStock) {
        this.minimumStock = minimumStock;
        updateAvailabilityStatus();
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "FeedAvailability{" + "feedId='" + feedId + ", feedName='" + feedName +
                ", availableQuantity=" + availableQuantity + ", minimumStock=" + minimumStock + ", unit='" + unit +
                ", availabilityStatus='" + availabilityStatus + '}';
    }
}