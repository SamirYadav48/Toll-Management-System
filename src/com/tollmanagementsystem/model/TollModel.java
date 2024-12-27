/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tollmanagementsystem.model;

/**
 *
 * @author samiryadav
 */
public class TollModel {
    private int licenseNumber;
    private String customerName;
    private int citizenshipNumber;
    private int vehicleNumber;
    private String tollPlazaName;
    private String tollPlazaLocation;
    private String address;
    private String state;
    
    public TollModel(){
        
    }
    //Constructor

    public TollModel(int licenseNumber, String customerName, int citizenshipNumber, int vehicleNumber, 
            String tollPlazaName, String tollPlazaLocation, String address, String state) {
        this.licenseNumber = licenseNumber;
        this.customerName = customerName;
        this.citizenshipNumber = citizenshipNumber;
        this.vehicleNumber = vehicleNumber;
        this.tollPlazaName = tollPlazaName;
        this.tollPlazaLocation = tollPlazaLocation;
        this.address = address;
        this.state = state;
    }

    
    
    //Getter and Setter methods

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
  
    
    public int getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(int citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getTollPlazaName() {
        return tollPlazaName;
    }

    public void setTollPlazaName(String tollPlazaName) {
        this.tollPlazaName = tollPlazaName;
    }

    public String getTollPlazaLocation() {
        return tollPlazaLocation;
    }

    public void setTollPlazaLocation(String tollPlazaLocation) {
        this.tollPlazaLocation = tollPlazaLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}

