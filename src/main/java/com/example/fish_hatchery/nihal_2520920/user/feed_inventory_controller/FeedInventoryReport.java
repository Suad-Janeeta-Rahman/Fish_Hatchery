
package com.example.fish_hatchery.nihal_2520920.user.feed_inventory_controller;

import java.time.LocalDate;

public class FeedInventoryReport {

    private String reportId;
    private String reportType;
    private String reportingPeriod;
    private int totalFeedItems;
    private double totalQuantity;
    private int lowStockItems;
    private LocalDate reportDate;
    private String remarks;

    public FeedInventoryReport(String reportId, String reportType,
                               String reportingPeriod, int totalFeedItems,
                               double totalQuantity, int lowStockItems,
                               LocalDate reportDate, String remarks) {

        this.reportId = reportId;
        this.reportType = reportType;
        this.reportingPeriod = reportingPeriod;
        this.totalFeedItems = totalFeedItems;
        this.totalQuantity = totalQuantity;
        this.lowStockItems = lowStockItems;
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

    public int getTotalFeedItems() {
        return totalFeedItems;
    }

    public void setTotalFeedItems(int totalFeedItems) {
        this.totalFeedItems = totalFeedItems;
    }

    public double getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(double totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getLowStockItems() {
        return lowStockItems;
    }

    public void setLowStockItems(int lowStockItems) {
        this.lowStockItems = lowStockItems;
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

    @Override
    public String toString() {
        return "FeedInventoryReport{" +"reportId='" + reportId + ", reportType='" + reportType + ", reportingPeriod='" + reportingPeriod + ", totalFeedItems=" + totalFeedItems +
                ", totalQuantity=" + totalQuantity +", lowStockItems=" + lowStockItems +
                ", reportDate=" + reportDate + ", remarks='" + remarks + '}';
    }
}
