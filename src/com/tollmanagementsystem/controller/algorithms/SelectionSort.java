/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tollmanagementsystem.controller.algorithms;

import com.tollmanagementsystem.model.TollModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samiryadav
 * LMUID : 23048505
 */
import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    // Sort by citizenshipNumber
    public List<TollModel> sortByCitizenshipNumber(List<TollModel> unsortedData, boolean isDesc) {
        
        List<TollModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            // Find the min/max value based on citizenshipNumber
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    // Descending order: Larger values first
                    if (dataToSort.get(j).getCitizenshipNumber() > dataToSort.get(minIndex).getCitizenshipNumber()) {
                        minIndex = j;
                    }
                } else {
                    // Ascending order: Smaller values first
                    if (dataToSort.get(j).getCitizenshipNumber() < dataToSort.get(minIndex).getCitizenshipNumber()) {
                        minIndex = j;
                    }
                }
            }
            // Swap the elements
            TollModel tempCitizen = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempCitizen);
        }
        return dataToSort;
    }

    // Sort by citizenName
    public List<TollModel> sortByCitizenName(List<TollModel> unsortedData, boolean isDesc) {
        List<TollModel> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            // Find the min/max value based on citizenName
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    // Descending order: Larger names first (alphabetically)
                    if (dataToSort.get(j).getCitizenName().compareToIgnoreCase(dataToSort.get(minIndex).getCitizenName()) > 0) {
                        minIndex = j;
                    }
                } else {
                    // Ascending order: Smaller names first (alphabetically)
                    if (dataToSort.get(j).getCitizenName().compareToIgnoreCase(dataToSort.get(minIndex).getCitizenName()) < 0) {
                        minIndex = j;
                    }
                }
            }
            // Swap the elements
            TollModel tempCitizen = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempCitizen);
        }
        return dataToSort;
    }
}

