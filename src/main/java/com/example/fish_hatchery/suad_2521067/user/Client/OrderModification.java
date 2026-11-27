package com.example.fish_hatchery.suad_2521067.user.Client;

import java.time.LocalDate;

public class OrderModification {
    private String modificationId;
    private String orderId;
    private String buyerId;
    private String speciesName;
    private String modificationType;
    private int newQuantity;
    private LocalDate newDeliveryDate;
    private String reason;
    private  String approvalStatus;

    public OrderModification(String modificationId, String orderId, String buyerId, String speciesName, String modificationType, int newQuantity, LocalDate newDeliveryDate, String reason, String approvalStatus) {
        this.modificationId = modificationId;
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.speciesName = speciesName;
        this.modificationType = modificationType;
        this.newQuantity = newQuantity;
        this.newDeliveryDate = newDeliveryDate;
        this.reason = reason;
        this.approvalStatus = approvalStatus;
    }

    public String getModificationId() {
        return modificationId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getModificationType() {
        return modificationType;
    }

    public int getNewQuantity() {
        return newQuantity;
    }

    public LocalDate getNewDeliveryDate() {
        return newDeliveryDate;
    }

    public String getReason() {
        return reason;
    }

    public String isApprovalStatus() {
        return approvalStatus;
    }

    public void setModificationType(String modificationType) {
        this.modificationType = modificationType;
    }

    public void setNewQuantity(int newQuantity) {
        this.newQuantity = newQuantity;
    }

    public void setNewDeliveryDate(LocalDate newDeliveryDate) {
        this.newDeliveryDate = newDeliveryDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Override
    public String toString() {
        return "OrderModification{" +
                "modificationId='" + modificationId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", modificationType='" + modificationType + '\'' +
                ", newQuantity=" + newQuantity +
                ", newDeliveryDate=" + newDeliveryDate +
                ", reason='" + reason + '\'' +
                ", approvalStatus=" + approvalStatus +
                '}';
    }
}
