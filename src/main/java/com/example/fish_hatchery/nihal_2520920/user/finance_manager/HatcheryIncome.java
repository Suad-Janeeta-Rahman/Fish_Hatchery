package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import java.time.LocalDate;

public class HatcheryIncome {

    private String incomeId;
    private String incomeSource;
    private double amount;
    private LocalDate date;
    private String description;


    public HatcheryIncome(String incomeId, String incomeSource,
                          double amount, LocalDate date, String description) {

        this.incomeId = incomeId;
        this.incomeSource = incomeSource;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public String getIncomeId() {
        return incomeId;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "HatcheryIncome{" + "incomeId=" + incomeId
                + ", incomeSource=" + incomeSource +
                ", amount=" + amount + ", date=" + date
                + ", description=" + description + "}";
    }


}
