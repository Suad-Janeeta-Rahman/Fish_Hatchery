package com.example.fish_hatchery.suad_2521067.user.client;

public class BrowseFishSpecies {
    private String speciesId;
    private  String speciesName;
    private String availableSize;
    private float price;
    private boolean isAvailable;

    public BrowseFishSpecies(String speciesId, String speciesName, String availableSize, float price, boolean isAvailable) {
        this.speciesId = speciesId;
        this.speciesName = speciesName;
        this.availableSize = availableSize;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getSpeciesId() {
        return speciesId;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getAvailableSize() {
        return availableSize;
    }

    public float getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setAvailableSize(String availableSize) {
        this.availableSize = availableSize;
    }

    @Override
    public String toString() {
        return "BrowseFishSpecies{" +
                "speciesId='" + speciesId + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", availableSize='" + availableSize + '\'' +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
