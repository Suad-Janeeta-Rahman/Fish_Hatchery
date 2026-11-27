package com.example.fish_hatchery.ridwan_2412433.user.hatchery_manager;

import java.time.LocalDate;

public class FarmDecision {
    private int decisionId;
    private String decisionTitle;
    private String decisionDescription;
    private String decisionType;
    private LocalDate decisionDate;
    private String priority;
    private String decisionStatus;

    public FarmDecision(int decisionId, String decisionTitle, String decisionDescription, String decisionType, LocalDate decisionDate, String priority, String decisionStatus) {
        this.decisionId = decisionId;
        this.decisionTitle = decisionTitle;
        this.decisionDescription = decisionDescription;
        this.decisionType = decisionType;
        this.decisionDate = decisionDate;
        this.priority = priority;
        this.decisionStatus = decisionStatus;
    }

    public int getDecisionId() {
        return decisionId;
    }

    public String getDecisionTitle() {
        return decisionTitle;
    }

    public String getDecisionDescription() {
        return decisionDescription;
    }

    public String getDecisionType() {
        return decisionType;
    }

    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getDecisionStatus() {
        return decisionStatus;
    }

    public void setDecisionDescription(String decisionDescription) {
        this.decisionDescription = decisionDescription;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDecisionStatus(String decisionStatus) {
        this.decisionStatus = decisionStatus;
    }
}
