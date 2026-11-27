package com.example.fish_hatchery.suad_2521067.user.managingDirector;

public class ProfitReport {
    private String month;
    private Float revenue;
    private Float expense;
    private Float profit;

    public ProfitReport(String month, Float revenue, Float expense, Float profit) {
        this.month = month;
        this.revenue = revenue;
        this.expense = expense;
        this.profit = profit;
    }

    public String getMonth() {
        return month;
    }

    public Float getRevenue() {
        return revenue;
    }

    public Float getExpense() {
        return expense;
    }

    public Float getProfit() {
        return profit;
    }

    public void setRevenue(Float revenue) {
        this.revenue = revenue;
    }

    public void setExpense(Float expense) {
        this.expense = expense;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "ProfitReport{" +
                "month='" + month + '\'' +
                ", revenue=" + revenue +
                ", expense=" + expense +
                ", profit=" + profit +
                '}';
    }
}
