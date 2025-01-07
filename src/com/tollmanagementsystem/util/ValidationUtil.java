/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tollmanagementsystem.util;

import java.util.regex.Pattern;
/**
 *
 * @author samiryadav
 * LMUID: 23048505
 */
public class ValidationUtil {
    
    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern CITIZEN_ID_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern VEHICLE_NUMBER_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern VEHICLE_CATEGORY = Pattern.compile("^[A-Za-z ]+$");
    private static final Pattern LICENSE_NUMBER_PATTERN = Pattern.compile("^[A-Z0-9]{9}$");
    private static final Pattern ADDRESS_PATTERN = Pattern.compile("^.+$");
    private static final Pattern STATE_PATTERN = Pattern.compile("^[A-Za-z\\s]{2,50}$");
    private static final Pattern TOLL_PLAZA_NAME_PATTERN = Pattern.compile("^[A-Za-z0-9\\s&.-]{2,100}$");
    private static final Pattern TOLL_PLAZA_LOCATION_PATTERN = Pattern.compile("^[A-Za-z0-9\\s&.-]{2,100}$");
    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
    
    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param name the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }
    
    /**
     * Validates if the CITIZEN ID is exactly 7 digits.
     *
     * @param citizenshipNumber the CITIZEN ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidCitizenshipNumber(String citizenshipNumber) {
        return !isNullOrEmpty(citizenshipNumber) && CITIZEN_ID_PATTERN.matcher(citizenshipNumber).matches();
    }
    
    /**
     * Validates if the vehicle number contains only uppercase letters and digits.
     *
     * @param vehicleNumber the vehicle number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidVehicleNumber(String vehicleNumber) {
        return !isNullOrEmpty(vehicleNumber) && VEHICLE_NUMBER_PATTERN.matcher(vehicleNumber).matches();
    }
    
    /**
     * Validates if the vehicle category contains only uppercase and lowercase letters and spaces.
     *
     * @param vehicleCategory the vehicle category to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidVehicleCategory(String vehicleCategory) {
        return !isNullOrEmpty(vehicleCategory) && VEHICLE_CATEGORY.matcher(vehicleCategory).matches();
    }

    
    /**
     * Validates if the license number contains only uppercase letters and digits.
     *
     * @param licenseNumber the license number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidLicenseNumber(String licenseNumber) {
        return !isNullOrEmpty(licenseNumber) && LICENSE_NUMBER_PATTERN.matcher(licenseNumber).matches();
    }
    
    /**
     * Validates if the address is not empty.
     *
     * @param address the address to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAddress(String address) {
        return !isNullOrEmpty(address) && ADDRESS_PATTERN.matcher(address).matches();
    }
    
    /**
     * Validates if the state name contains only letters and spaces.
     *
     * @param state the state name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidState(String state) {
        return !isNullOrEmpty(state) && STATE_PATTERN.matcher(state).matches();
    }
    
    /**
     * Validates if the toll plaza name contains valid characters.
     *
     * @param tollPlazaName the toll plaza name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTollPlazaName(String tollPlazaName) {
        return !isNullOrEmpty(tollPlazaName) && TOLL_PLAZA_NAME_PATTERN.matcher(tollPlazaName).matches();
    }
    
    /**
     * Validates if the toll plaza location contains valid characters.
     *
     * @param tollPlazaLocation the toll plaza location to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTollPlazaLocation(String tollPlazaLocation) {
        return !isNullOrEmpty(tollPlazaLocation) && TOLL_PLAZA_LOCATION_PATTERN.matcher(tollPlazaLocation).matches();
    }
    
}
