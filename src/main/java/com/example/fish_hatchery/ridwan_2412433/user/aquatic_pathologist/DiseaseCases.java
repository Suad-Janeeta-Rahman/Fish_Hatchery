package com.example.fish_hatchery.ridwan_2412433.user.aquatic_pathologist;

import java.time.LocalDate;

public class DiseaseCases {
    private int caseId;
    private String fishId;
    private String diseaseName;
    private String diseaseType;
    private int affectedQuantity;
    private String pondId;
    private LocalDate reportedDate;
    private String caseStatus;

    public DiseaseCases(int caseId, String fishId, String diseaseName, String diseaseType, int affectedQuantity, String pondId, LocalDate reportedDate, String caseStatus) {
        this.caseId = caseId;
        this.fishId = fishId;
        this.diseaseName = diseaseName;
        this.diseaseType = diseaseType;
        this.affectedQuantity = affectedQuantity;
        this.pondId = pondId;
        this.reportedDate = reportedDate;
        this.caseStatus = caseStatus;
    }

    public int getCaseId() {
        return caseId;
    }

    public String getFishId() {
        return fishId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getDiseaseType() {
        return diseaseType;
    }

    public int getAffectedQuantity() {
        return affectedQuantity;
    }

    public String getPondId() {
        return pondId;
    }

    public LocalDate getReportedDate() {
        return reportedDate;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }
}
