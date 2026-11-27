package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;

import java.time.LocalDate;

public class FeedInventory {
    private int feedId;
    private String feedName;
    private String feedType;
    private double availableQuantity;
    private String unit;
    private double unitPrice;
    private LocalDate expiryDate;

    public FeedInventory(int feedId, String feedName, String feedType, double availableQuantity, String unit, double unitPrice, LocalDate expiryDate) {
        this.feedId = feedId;
        this.feedName = feedName;
        this.feedType = feedType;
        this.availableQuantity = availableQuantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.expiryDate = expiryDate;
    }

    public int getFeedId() {
        return feedId;
    }

    public String getFeedName() {

        return feedName;
    }

    public String getFeedType() {

        return feedType;
    }

    public double getAvailableQuantity() {

        return availableQuantity;
    }

    public String getUnit() {

        return unit;
    }

    public double getUnitPrice() {

        return unitPrice;
    }

    public LocalDate getExpiryDate() {

        return expiryDate;
    }

    public void setAvailableQuantity(double availableQuantity) {

        this.availableQuantity = availableQuantity;
    }

    public void setUnitPrice(double unitPrice) {

        this.unitPrice = unitPrice;
    }

    public void setExpiryDate(LocalDate expiryDate) {

        this.expiryDate = expiryDate;
    }
}
