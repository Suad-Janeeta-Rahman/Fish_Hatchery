package com.example.fish_hatchery.suad_2521067.user.client;

import java.time.LocalDate;

public class Rating {
    private String ratingId;
    private String orderId;
    private String buyerId;
    private String speciesName;
    private int starRating;
    private String survivalQuality;
    private LocalDate ratingDate;

    public Rating(String ratingId, String orderId, String buyerId, String speciesName, int starRating, String survivalQuality, LocalDate ratingDate) {
        this.ratingId = ratingId;
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.speciesName = speciesName;
        this.starRating = starRating;
        this.survivalQuality = survivalQuality;
        this.ratingDate = ratingDate;
    }

    public String getRatingId() {
        return ratingId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getStarRating() {
        return starRating;
    }

    public String getSurvivalQuality() {
        return survivalQuality;
    }

    public LocalDate getRatingDate() {
        return ratingDate;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public void setSurvivalQuality(String survivalQuality) {
        this.survivalQuality = survivalQuality;
    }

    public void setRatingDate(LocalDate ratingDate) {
        this.ratingDate = ratingDate;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ratingId='" + ratingId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", starRating=" + starRating +
                ", survivalQuality='" + survivalQuality + '\'' +
                ", ratingDate=" + ratingDate +
                '}';
    }
}