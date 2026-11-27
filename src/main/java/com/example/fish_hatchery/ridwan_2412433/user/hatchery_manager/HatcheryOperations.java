package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;

import java.time.LocalDate;

public class HatcheryOperations {
    private int operationId;
    private String operationName;
    private String operationType;
    private String pondId;
    private String batchId;
    private String assignedStaff;
    private LocalDate startDate;
    private LocalDate endDate;
    private String operationStatus;

    public HatcheryOperations(int operationId, String operationName, String operationType, String pondId, String batchId, String assignedStaff, LocalDate startDate, LocalDate endDate, String operationStatus) {
        this.operationId = operationId;
        this.operationName = operationName;
        this.operationType = operationType;
        this.pondId = pondId;
        this.batchId = batchId;
        this.assignedStaff = assignedStaff;
        this.startDate = startDate;
        this.endDate = endDate;
        this.operationStatus = operationStatus;
    }

    public int getOperationId() {
        return operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public String getOperationType() {
        return operationType;
    }

    public String getPondId() {
        return pondId;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getAssignedStaff() {
        return assignedStaff;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setAssignedStaff(String assignedStaff) {
        this.assignedStaff = assignedStaff;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }
}
