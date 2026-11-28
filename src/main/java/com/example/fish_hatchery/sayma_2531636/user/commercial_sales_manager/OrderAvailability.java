package com.example.fish_hatchery.sayma_2531636.user.commercial_sales_manager;

public class OrderAvailability {
    private String orderId;
    private String product;
    private int requestedQuantity ;
    private int availableStock ;
    private String availabilityStatus ;

    public OrderAvailability(String orderId, String product, int requestedQuantity, int availableStock, String availabilityStatus) {
        this.orderId = orderId;
        this.product = product;
        this.requestedQuantity = requestedQuantity;
        this.availableStock = availableStock;
        this.availabilityStatus = availabilityStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
