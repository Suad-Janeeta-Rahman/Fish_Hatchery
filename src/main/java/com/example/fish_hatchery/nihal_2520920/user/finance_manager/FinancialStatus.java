
package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import java.time.LocalDate;

public class FinancialStatus {

    private String statusId;
    private String financialPeriod;
    private double totalIncome;
    private double totalExpenses;
    private double totalSalary;
    private LocalDate reportDate;
    private String remarks;

    public FinancialStatus(String statusId, String financialPeriod,
                           double totalIncome, double totalExpenses,
                           double totalSalary, LocalDate reportDate,
                           String remarks) {

        this.statusId = statusId;
        this.financialPeriod = financialPeriod;
        this.totalIncome = totalIncome;
        this.totalExpenses = totalExpenses;
        this.totalSalary = totalSalary;
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public String getStatusId() {
        return statusId;
    }

    public String getFinancialPeriod() {
        return financialPeriod;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public double getNetBalance() {
        return totalIncome - (totalExpenses + totalSalary);
    }

    public void setFinancialPeriod(String financialPeriod) {
        this.financialPeriod = financialPeriod;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "FinancialStatus{" + "statusId='" + statusId + ", financialPeriod='" + financialPeriod + ", totalIncome=" + totalIncome +
                ", totalExpenses=" + totalExpenses + ", totalSalary=" + totalSalary +
                ", netBalance=" + getNetBalance() + ", reportDate=" + reportDate + ", remarks='" + remarks + '}';
    }
}
