package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class CountSheeps {
    public static void main(String[] args) {
        Boolean[] arrayOfSheeps = new Boolean[]{
                true, true, true, false,
                true, true, true, true,
                true, false, true, false,     // Sheeps
                true, false, false, true,     // Missing Sheep = FALSE
                true, true, true, true,
                false, false, true, true
        };

        findTotalSheepsUsingFilter(arrayOfSheeps);
        findTotalSheepsUsingFrequency(arrayOfSheeps);
    }

    private static void findTotalSheepsUsingFilter(Boolean[] arrayOfSheeps) {
        int totalSheeps = Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(sheep -> sheep == true)
                .toArray()
                .length;

        System.out.println("Total Sheeps = " + arrayOfSheeps.length
                + " ,current sheeps count= " + totalSheeps);
    }

    private static void findTotalSheepsUsingFrequency(Boolean[] arrayOfSheeps) {
        int totalSheeps = Collections.frequency(Arrays.asList(arrayOfSheeps), true);

        System.out.println("Total Sheeps = " + arrayOfSheeps.length
                + " ,current sheeps count= " + totalSheeps);
    }
}
