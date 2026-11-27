package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import java.time.LocalDate;

public class OperationalExpense {

    private String expenseId;
    private String expenseCategory;
    private double amount;
    private LocalDate date;
    private String description;

    public  OperationalExpense(String expenseId, String expenseCategory,
                               double amount,  LocalDate date, String description) {

        this.expenseId = expenseId;
        this.expenseCategory = expenseCategory;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
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
    public String toString(){
        return "OperationalExpense{" +
                "expenseId=" + expenseId + ", expenseCategory=" + expenseCategory
                + ", amount=" + amount + ", date=" + date + ", description=" + description
                + "}";
    }


}
