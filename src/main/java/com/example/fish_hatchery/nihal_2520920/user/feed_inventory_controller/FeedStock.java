
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

public class FeedStock {

    private String feedId;
    private String feedName;
    private double currentQuantity;
    private double minimumStock;
    private String unit;
    private String status;

    public FeedStock(String feedId, String feedName,
                     double currentQuantity, double minimumStock,
                     String unit) {

        this.feedId = feedId;
        this.feedName = feedName;
        this.currentQuantity = currentQuantity;
        this.minimumStock = minimumStock;
        this.unit = unit;
        updateStatus();
    }

    public void updateStatus() {
        if (currentQuantity <= minimumStock) {
            status = "Low Stock";
        } else {
            status = "Available";
        }
    }

    public String getFeedId() {
        return feedId;
    }

    public String getFeedName() {
        return feedName;
    }

    public double getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(double currentQuantity) {
        this.currentQuantity = currentQuantity;
        updateStatus();
    }

    public double getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(double minimumStock) {
        this.minimumStock = minimumStock;
        updateStatus();
    }

    public String getUnit() {
        return unit;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "FeedStock{" + "feedId='" + feedId + ", feedName='" + feedName +
                ", currentQuantity=" + currentQuantity + ", minimumStock=" + minimumStock +
                ", unit='" + unit + ", status='" + status + '}';
    }
}
