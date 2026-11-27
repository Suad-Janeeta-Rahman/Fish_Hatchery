package com.example.fish_hatchery.ridwan_2412433.user.aquatic_pathologist;

import java.time.LocalDate;

public class DiseaseSymptoms {
    private int symptomId;
    private int caseId;
    private String symptomName;
    private String symptomDescription;
    private String severity;
    private LocalDate observationDate;

    public DiseaseSymptoms(int symptomId, int caseId, String symptomName, String symptomDescription, String severity, LocalDate observationDate) {
        this.symptomId = symptomId;
        this.caseId = caseId;
        this.symptomName = symptomName;
        this.symptomDescription = symptomDescription;
        this.severity = severity;
        this.observationDate = observationDate;
    }

    public int getSymptomId() {
        return symptomId;
    }

    public int getCaseId() {
        return caseId;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public String getSymptomDescription() {
        return symptomDescription;
    }

    public String getSeverity() {
        return severity;
    }

    public LocalDate getObservationDate() {
        return observationDate;
    }

    public void setSymptomDescription(String symptomDescription) {
        this.symptomDescription = symptomDescription;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
