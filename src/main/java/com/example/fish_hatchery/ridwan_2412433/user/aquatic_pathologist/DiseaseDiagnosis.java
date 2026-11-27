package com.example.fish_hatchery.ridwan_2412433.user.aquatic_pathologist;

import java.time.LocalDate;

public class DiseaseDiagnosis {
    private int diagnosisId;
    private int caseId;
    private String diseaseName;
    private String diagnosisResult;
    private LocalDate diagnosisDate;
    private int labTestId;
    private String remarks;

    public DiseaseDiagnosis(int diagnosisId, int caseId, String diseaseName, String diagnosisResult, LocalDate diagnosisDate, int labTestId, String remarks) {
        this.diagnosisId = diagnosisId;
        this.caseId = caseId;
        this.diseaseName = diseaseName;
        this.diagnosisResult = diagnosisResult;
        this.diagnosisDate = diagnosisDate;
        this.labTestId = labTestId;
        this.remarks = remarks;
    }

    public int getDiagnosisId() {
        return diagnosisId;
    }

    public int getCaseId() {
        return caseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getDiagnosisResult() {
        return diagnosisResult;
    }

    public LocalDate getDiagnosisDate() {
        return diagnosisDate;
    }

    public int getLabTestId() {
        return labTestId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setDiagnosisResult(String diagnosisResult) {
        this.diagnosisResult = diagnosisResult;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
