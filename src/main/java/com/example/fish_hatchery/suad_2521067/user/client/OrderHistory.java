package com.example.fish_hatchery.suad_2521067.user.client;

import java.time.LocalDate;

public class OrderHistory {
    private String speciesName;
    private int quantity;
    private float amount;
    private LocalDate date;

    public OrderHistory(String speciesName, int quantity, float amount, LocalDate date) {
        this.speciesName = speciesName;
        this.quantity = quantity;
        this.amount = amount;
        this.date = date;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "OrderHistory{" +
                "speciesName='" + speciesName + '\'' +
                ", quantity=" + quantity +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
