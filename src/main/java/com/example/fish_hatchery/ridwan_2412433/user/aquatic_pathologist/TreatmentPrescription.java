package com.example.fish_hatchery.ridwan_2412433.user.aquatic_pathologist;

import java.time.LocalDate;

public class TreatmentPrescription {
    private int prescriptionId;
    private int caseId;
    private int medicineId;
    private String medicineName;
    private String dosage;
    private String frequency;
    private String duration;
    private LocalDate prescribedDate;

    public TreatmentPrescription(int prescriptionId, int caseId, int medicineId, String medicineName, String dosage, String frequency, String duration, LocalDate prescribedDate) {
        this.prescriptionId = prescriptionId;
        this.caseId = caseId;
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.frequency = frequency;
        this.duration = duration;
        this.prescribedDate = prescribedDate;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public int getCaseId() {
        return caseId;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getDosage() {
        return dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getDuration() {
        return duration;
    }

    public LocalDate getPrescribedDate() {
        return prescribedDate;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
