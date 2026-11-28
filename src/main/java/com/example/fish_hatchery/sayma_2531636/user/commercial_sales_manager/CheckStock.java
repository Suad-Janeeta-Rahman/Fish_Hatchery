package com.example.fish_hatchery.sayma_2531636.user.commercial_sales_manager;

public class CheckStock {
    private String species ;
    private int availableQuantity ;
    private String size ;
    private String lastUpdated ;

    public CheckStock(String species, int availableQuantity, String size, String lastUpdated) {
        this.species = species;
        this.availableQuantity = availableQuantity;
        this.size = size;
        this.lastUpdated = lastUpdated;
    }

    public String getSpecies() {
        return species;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public String getSize() {
        return size;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
