package com.example.fish_hatchery.suad_2521067.user.Managing_Director;

import java.time.LocalDate;

public class ExpenseApproval {
    private String expenseCategory;
    private float amountBdt;
    private LocalDate requestDate;
    private boolean isApproved;

    public ExpenseApproval(String expenseCategory, float amountBdt, LocalDate requestDate, boolean isApproved) {
        this.expenseCategory = expenseCategory;
        this.amountBdt = amountBdt;
        this.requestDate = requestDate;
        this.isApproved = isApproved;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public float getAmountBdt() {
        return amountBdt;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setAmountBdt(float amountBdt) {
        this.amountBdt = amountBdt;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    @Override
    public String toString() {
        return "MortalityClaim{" +
                "expenseCategory='" + expenseCategory + '\'' +
                ", amountBdt=" + amountBdt +
                ", requestDate=" + requestDate +
                ", isApproved=" + isApproved +
                '}';
    }
}
