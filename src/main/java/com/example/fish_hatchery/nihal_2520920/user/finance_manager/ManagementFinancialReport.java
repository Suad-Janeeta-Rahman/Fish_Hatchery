package com.example.fish_hatchery.nihal_2520920.user.finance_manager;

import java.time.LocalDate;

    public class ManagementFinancialReport {

        private String reportId;
        private String reportType;
        private String reportingPeriod;
        private double totalIncome;
        private double totalExpenses;
        private double totalSalary;
        private LocalDate reportDate;
        private String remarks;

        public ManagementFinancialReport(String reportId, String reportType,
                                         String reportingPeriod, double totalIncome,
                                         double totalExpenses, double totalSalary,
                                         LocalDate reportDate, String remarks) {
            this.reportId = reportId;
            this.reportType = reportType;
            this.reportingPeriod = reportingPeriod;
            this.totalIncome = totalIncome;
            this.totalExpenses = totalExpenses;
            this.totalSalary = totalSalary;
            this.reportDate = reportDate;
            this.remarks = remarks;
        }

        public String getReportId() {
            return reportId;
        }

        public String getReportType() {
            return reportType;
        }

        public void setReportType(String reportType) {
            this.reportType = reportType;
        }

        public String getReportingPeriod() {
            return reportingPeriod;
        }

        public void setReportingPeriod(String reportingPeriod) {
            this.reportingPeriod = reportingPeriod;
        }

        public double getTotalIncome() {
            return totalIncome;
        }

        public void setTotalIncome(double totalIncome) {
            this.totalIncome = totalIncome;
        }

        public double getTotalExpenses() {
            return totalExpenses;
        }

        public void setTotalExpenses(double totalExpenses) {
            this.totalExpenses = totalExpenses;
        }

        public double getTotalSalary() {
            return totalSalary;
        }

        public void setTotalSalary(double totalSalary) {
            this.totalSalary = totalSalary;
        }

        public LocalDate getReportDate() {
            return reportDate;
        }

        public void setReportDate(LocalDate reportDate) {
            this.reportDate = reportDate;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public double getNetBalance() {
            return totalIncome - (totalExpenses + totalSalary);
        }

        @Override
        public String toString() {
            return "ManagementFinancialReport{" + "reportId='" + reportId +
                    ", reportType='" + reportType + ", reportingPeriod='" + reportingPeriod +
                    ", totalIncome=" + totalIncome + ", totalExpenses=" + totalExpenses +
                    ", totalSalary=" + totalSalary + ", reportDate=" + reportDate +
                    ", netBalance=" + getNetBalance() + ", remarks='" + remarks + '}';
        }

    }


