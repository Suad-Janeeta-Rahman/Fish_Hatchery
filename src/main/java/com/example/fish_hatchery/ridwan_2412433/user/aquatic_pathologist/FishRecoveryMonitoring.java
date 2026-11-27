package com.example.fish_hatchery.ridwan_2412433.user.aquatic_pathologist;

import java.time.LocalDate;

public class FishRecoveryMonitoring {
    private int monitoringId;
    private int caseId;
    private String fishId;
    private String recoveryCondition;
    private String observedSymptoms;
    private LocalDate monitoringDate;
    private String recoveryStatus;
    private String remarks;

    public FishRecoveryMonitoring(int monitoringId, int caseId, String fishId, String recoveryCondition, String observedSymptoms, LocalDate monitoringDate, String recoveryStatus, String remarks) {
        this.monitoringId = monitoringId;
        this.caseId = caseId;
        this.fishId = fishId;
        this.recoveryCondition = recoveryCondition;
        this.observedSymptoms = observedSymptoms;
        this.monitoringDate = monitoringDate;
        this.recoveryStatus = recoveryStatus;
        this.remarks = remarks;
    }

    public int getMonitoringId() {
        return monitoringId;
    }

    public int getCaseId() {
        return caseId;
    }

    public String getFishId() {
        return fishId;
    }

    public String getRecoveryCondition() {
        return recoveryCondition;
    }

    public String getObservedSymptoms() {
        return observedSymptoms;
    }

    public LocalDate getMonitoringDate() {
        return monitoringDate;
    }

    public String getRecoveryStatus() {
        return recoveryStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRecoveryCondition(String recoveryCondition) {
        this.recoveryCondition = recoveryCondition;
    }

    public void setObservedSymptoms(String observedSymptoms) {
        this.observedSymptoms = observedSymptoms;
    }

    public void setRecoveryStatus(String recoveryStatus) {
        this.recoveryStatus = recoveryStatus;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
