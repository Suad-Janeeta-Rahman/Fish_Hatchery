package com.example.fish_hatchery.suad_2521067.user.client;

import java.time.LocalDate;

public class Order {
    private String orderId;
    private String buyerId;
    private  String batchId;
    private String speciesName;
    private int orderQuantity;
    private float totalPrice;
    private String deliveryAddress;
    private LocalDate requestedDeliveryDate;

    public Order(String orderId, String buyerId, String batchId, String speciesName, int orderQuantity, float totalPrice, String deliveryAddress, LocalDate requestedDeliveryDate) {
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.batchId = batchId;
        this.speciesName = speciesName;
        this.orderQuantity = orderQuantity;
        this.totalPrice = totalPrice;
        this.deliveryAddress = deliveryAddress;
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public String getBatchId() {
        return batchId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public LocalDate getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setRequestedDeliveryDate(LocalDate requestedDeliveryDate) {
        this.requestedDeliveryDate = requestedDeliveryDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", batchId='" + batchId + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", orderQuantity=" + orderQuantity +
                ", totalPrice=" + totalPrice +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", requestedDeliveryDate=" + requestedDeliveryDate +
                '}';
    }
}
