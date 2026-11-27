package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import java.time.LocalDate;

public class FinancialTransaction {

    private String transactionId;
    private String transactionType;
    private double amount;
    private LocalDate date;
    private String description;

    public FinancialTransaction(String transactionId,String transactionType,
                                double amount,  LocalDate date, String description ){

        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
        this.description = description;

    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
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
        return "FinancialTransaction{" +
                "transactionId=" + transactionId +
                ", transactionType=" +  transactionType +
                ", amount=" + amount +  ", date=" + date +
                ", description=" + description + "}";
    }
}
