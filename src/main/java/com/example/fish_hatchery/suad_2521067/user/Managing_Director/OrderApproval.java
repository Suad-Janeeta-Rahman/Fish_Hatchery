package com.example.fish_hatchery.suad_2521067.user.Managing_Director;

public class OrderApproval {
    private String orderId;
    private String buyerId;
    private float amount;
    private boolean approve;

    public OrderApproval(String orderId, String buyerId, float amount, boolean approve) {
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.amount = amount;
        this.approve = approve;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public float getAmount() {
        return amount;
    }

    public boolean isApprove() {
        return approve;
    }

    public void setApprove(boolean approve) {
        this.approve = approve;
    }

    @Override
    public String toString() {
        return "OrderApproval{" +
                "orderId='" + orderId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", amount=" + amount +
                ", approve=" + approve +
                '}';
    }
}
