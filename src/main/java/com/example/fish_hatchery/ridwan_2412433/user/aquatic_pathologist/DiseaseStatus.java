package com.example.fish_hatchery.ridwan_2412433.user.aquatic_pathologist;

import java.time.LocalDate;

public class DiseaseStatus {
    private int statusId;
    private int caseId;
    private String diseaseName;
    private String previousStatus;
    private String currentStatus;
    private LocalDate updatedDate;
    private String remarks;

    public DiseaseStatus(int statusId, int caseId, String diseaseName, String previousStatus, String currentStatus, LocalDate updatedDate, String remarks) {
        this.statusId = statusId;
        this.caseId = caseId;
        this.diseaseName = diseaseName;
        this.previousStatus = previousStatus;
        this.currentStatus = currentStatus;
        this.updatedDate = updatedDate;
        this.remarks = remarks;
    }

    public int getStatusId() {
        return statusId;
    }

    public int getCaseId() {
        return caseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getPreviousStatus() {
        return previousStatus;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
