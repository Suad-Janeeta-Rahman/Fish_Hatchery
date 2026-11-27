package com.example.fish_hatchery.suad_2521067.user.Client;

import java.time.LocalDate;

public class Payment {
    private String paymentId;
    private String orderId;
    private String buyerId;
    private float totalBillAmount;
    private  float amountPaid;
    private  String  paymentMethod;
    private String transactionId;
    private LocalDate paymentDate;

    public Payment(String paymentId, String orderId, String buyerId, float totalBillAmount, float amountPaid, String paymentMethod, String transactionId, LocalDate paymentDate) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.totalBillAmount = totalBillAmount;
        this.amountPaid = amountPaid;
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.paymentDate = paymentDate;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public float getTotalBillAmount() {
        return totalBillAmount;
    }

    public float getAmountPaid() {
        return amountPaid;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }


    public void setAmountPaid(float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", totalBillAmount=" + totalBillAmount +
                ", amountPaid=" + amountPaid +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
