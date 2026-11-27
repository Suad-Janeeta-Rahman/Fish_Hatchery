package com.example.fish_hatchery.ridwan_2412433.user.aquatic_pathologist;

import java.time.LocalDate;

public class TreatmentDetails {
    private int treatmentId;
    private int prescriptionId;
    private int medicineId;
    private String treatmentMethod;
    private String dosage;
    private LocalDate startDate;
    private LocalDate endDate;
    private String treatmentStatus;

    public TreatmentDetails(int treatmentId, int prescriptionId, int medicineId, String treatmentMethod, String dosage, LocalDate startDate, LocalDate endDate, String treatmentStatus) {
        this.treatmentId = treatmentId;
        this.prescriptionId = prescriptionId;
        this.medicineId = medicineId;
        this.treatmentMethod = treatmentMethod;
        this.dosage = dosage;
        this.startDate = startDate;
        this.endDate = endDate;
        this.treatmentStatus = treatmentStatus;
    }

    public int getTreatmentId() {
        return treatmentId;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public String getTreatmentMethod() {
        return treatmentMethod;
    }

    public String getDosage() {
        return dosage;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getTreatmentStatus() {
        return treatmentStatus;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setTreatmentStatus(String treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }
}
