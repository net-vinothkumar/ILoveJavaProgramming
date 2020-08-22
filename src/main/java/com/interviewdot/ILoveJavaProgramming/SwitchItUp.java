package com.interviewdot.ILoveJavaProgramming;

import java.util.HashMap;

public class SwitchItUp {
    private static final HashMap<Integer, String> digits;
    private static final String ZERO = "ZERO";
    private static final String ONE = "ONE";
    private static final String TWO = "TWO";
    private static final String THREE = "THREE";
    private static final String FOUR = "FOUR";
    private static final String FIVE = "FIVE";
    private static final String SIX = "SIX";

    static {
        digits = new HashMap<>();
        digits.put(0, ZERO);
        digits.put(1, ONE);
        digits.put(2, TWO);
        digits.put(3, THREE);
        digits.put(4, FOUR);
        digits.put(5, FIVE);
        digits.put(6, SIX);
    }

    public static void main(String[] args) {
        int number = 4;
        switchMeUsingArray(number);
        switchMeUsingMap(number);
    }

    private static void switchMeUsingArray(int number) {
        String[] numberInWords = new String[]{
                ZERO,
                ONE,
                TWO,
                THREE,
                FOUR,
                FIVE,
                SIX,
        };
        String result = numberInWords[number];
        System.out.println("Number in words [Array] = " + result);
    }

    private static void switchMeUsingMap(int number) {
        String result = digits.get(number);
        System.out.println("Number in words [Map] = " + result);
    }
}
