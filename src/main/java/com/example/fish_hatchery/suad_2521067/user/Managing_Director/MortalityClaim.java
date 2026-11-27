package com.example.fish_hatchery.suad_2521067.user.Managing_Director;

public class MortalityClaim {
    private String orderId;
    private int deadCount;
    private String action;
    private boolean approved;

    public MortalityClaim(String orderId, int deadCount, String action, boolean approved) {
        this.orderId = orderId;
        this.deadCount = deadCount;
        this.action = action;
        this.approved = approved;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getDeadCount() {
        return deadCount;
    }

    public String getAction() {
        return action;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "MortalityClaim{" +
                "orderId='" + orderId + '\'' +
                ", deadCount=" + deadCount +
                ", action='" + action + '\'' +
                ", approved=" + approved +
                '}';
    }
}

