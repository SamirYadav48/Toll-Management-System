/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tollmanagementsystem.controller.algorithms;
import com.tollmanagementsystem.model.TollModel;
import java.util.List;
/**
 *
 * @author samiryadav
 * LMUID: 23048505
 */
public class BinarySearch {
    // Method to search for a Citizen by name
    public TollModel searchByName(String searchValue, List<TollModel> tollList, int left, int right) {
        if (right < left) {
            return null; // Not found
        }

        // Find the middle index
        int mid = (left + right) / 2;

        // Compare the search value with the name at the middle index
        if (searchValue.toLowerCase().equals(tollList.get(mid).getCitizenName().toLowerCase())) {
            return tollList.get(mid); // Return the citizen if the name matches
        } else if (searchValue.compareToIgnoreCase(tollList.get(mid).getCitizenName()) < 0) {
            return searchByName(searchValue, tollList, left, mid - 1); // Search in the left half
        } else {
            return searchByName(searchValue, tollList, mid + 1, right); // Search in the right half
        }
    }
}
