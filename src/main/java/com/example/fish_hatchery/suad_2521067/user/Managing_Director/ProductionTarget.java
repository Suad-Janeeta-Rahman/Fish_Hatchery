package com.example.fish_hatchery.suad_2521067.user.Managing_Director;

public class ProductionTarget {
    private String month;
    private String speciesName;
    private int quantity;
    private float revenue;

    public ProductionTarget(String month, String speciesName, int quantity, float revenue) {
        this.month = month;
        this.speciesName = speciesName;
        this.quantity = quantity;
        this.revenue = revenue;
    }

    public String getMonth() {
        return month;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public int getQuantity() {
        return quantity;
    }

    public float isRevenue() {
        return revenue;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "ProductionTarget{" +
                "month='" + month + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", quantity=" + quantity +
                ", revenue=" + revenue +
                '}';
    }
}
