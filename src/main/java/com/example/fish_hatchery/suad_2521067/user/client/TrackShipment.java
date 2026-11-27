package com.example.fish_hatchery.suad_2521067.user.client;

import java.time.LocalDate;

public class TrackShipment {
    private String shipmentId;
    private String orderId;
    private String buyerId;
    private String speciesName;
    private String vehicleNumber;
    private String driverPhone;
    private String currentLocation;
    private LocalDate ArrivalDate;

    public TrackShipment(String shipmentId, String orderId, String buyerId, String speciesName, String vehicleNumber, String driverPhone, String currentLocation, LocalDate arrivalDate) {
        this.shipmentId = shipmentId;
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.speciesName = speciesName;
        this.vehicleNumber = vehicleNumber;
        this.driverPhone = driverPhone;
        this.currentLocation = currentLocation;
        ArrivalDate = arrivalDate;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public LocalDate getArrivalDate() {
        return ArrivalDate;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    @Override
    public String toString() {
        return "TrackShipment{" +
                "shipmentId='" + shipmentId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", speciesName='" + speciesName + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", driverPhone='" + driverPhone + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", ArrivalDate=" + ArrivalDate +
                '}';
    }
}
