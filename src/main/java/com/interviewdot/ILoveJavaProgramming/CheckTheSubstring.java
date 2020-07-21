package com.interviewdot.ILoveJavaProgramming;

public class CheckTheSubstring {
    public static void main(String[] args) {
        String sentance = "I Love Java Programming";
        String word = "IPhone";

        checkStringUsingContains(sentance, word);
        checkStringUsingIndexOf(sentance, word);
    }

    private static void checkStringUsingContains(String sentance, String word) {
        if (sentance.contains(word)) {
            System.out.println(word + " exist in '" + sentance + "'");
        } else {
            System.out.println(word + " does not exist in '" + sentance + "'");
        }
    }
    // "I Love Java Programming"
    //  0123456789.............
    private static void checkStringUsingIndexOf(String sentance, String word) {
        if (sentance.indexOf(word) == -1) {
            System.out.println(word + " does not exist in '" + sentance + "'");
        } else {
            System.out.println(word + " exist in '" + sentance + "'");
        }
    }
}
