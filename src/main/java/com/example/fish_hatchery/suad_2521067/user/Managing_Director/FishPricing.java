package com.example.fish_hatchery.suad_2521067.user.Managing_Director;

import java.time.LocalDate;

public class FishPricing {
    private String speciesName;
    private float price;
    private float discount;
    private LocalDate date;

    public FishPricing(String speciesName, float price, float discount, LocalDate date) {
        this.speciesName = speciesName;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public float getPrice() {
        return price;
    }

    public float getDiscount() {
        return discount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FishPricing{" +
                "speciesName='" + speciesName + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", date=" + date +
                '}';
    }
}
