package com.example.fish_hatchery.sayma_2531636.user.commercial_sales_manager;

public class CustomerRegistration {
    private String customerId;
    private String species;
    private String size;
    private String customerName;
    private String contact;
    private String customerType;

    public CustomerRegistration(String customerId, String species, String size, String customerName, String contact, String customerType) {
        this.customerId = customerId;
        this.species = species;
        this.size = size;
        this.customerName = customerName;
        this.contact = contact;
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getSpecies() {
        return species;
    }

    public String getSize() {
        return size;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getContact() {
        return contact;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}