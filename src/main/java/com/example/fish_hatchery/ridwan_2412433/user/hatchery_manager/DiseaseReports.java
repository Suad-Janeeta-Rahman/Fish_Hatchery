package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;

import java.time.LocalDate;

public class DiseaseReports {
    private int reportId;
    private String fishSpecies;
    private String pondId;
    private String batchId;
    private int affectedQuantity;
    private String diseaseName;
    private LocalDate reportDate;
    private String severity;
    private String reportStatus;

    public DiseaseReports(int reportId, String fishSpecies, String pondId, String batchId, int affectedQuantity, String diseaseName, LocalDate reportDate, String severity, String reportStatus) {
        this.reportId = reportId;
        this.fishSpecies = fishSpecies;
        this.pondId = pondId;
        this.batchId = batchId;
        this.affectedQuantity = affectedQuantity;
        this.diseaseName = diseaseName;
        this.reportDate = reportDate;
        this.severity = severity;
        this.reportStatus = reportStatus;
    }

    public int getReportId() {
        return reportId;
    }

    public String getFishSpecies() {
        return fishSpecies;
    }

    public String getPondId() {
        return pondId;
    }

    public String getBatchId() {
        return batchId;
    }

    public int getAffectedQuantity() {
        return affectedQuantity;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public String getSeverity() {
        return severity;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }
}
