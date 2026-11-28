package com.example.fish_hatchery.sayma_2531636.user.Incubation_Technician;

public class JarAssignment {
    private String batchId ;
    private String jarId ;
    private int eggCount ;
    private String status ;

    public JarAssignment(String batchId, String jarId, int eggCount, String status) {
        this.batchId = batchId;
        this.jarId = jarId;
        this.eggCount = eggCount;
        this.status = status;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getJarId() {
        return jarId;
    }

    public int getEggCount() {
        return eggCount;
    }

    public String getStatus() {
        return status;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setJarId(String jarId) {
        this.jarId = jarId;
    }

    public void setEggCount(int eggCount) {
        this.eggCount = eggCount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
