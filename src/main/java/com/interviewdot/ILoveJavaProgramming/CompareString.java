package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.IntStream;
/*
    How to compare two Strings in java without using built in functions?
    S u b s c r i b e r
    0 1 2 3 4 5 6 7 8 9
    S u b s c r i b e r
 */
public class CompareString {
    public static void main(String[] args) {
        String first  = "Subscriber";
        String second = "Subscriber";
        Boolean stringsAreEqual = false;

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                stringsAreEqual = false;
                break;
            }
            stringsAreEqual = true;
        }
        System.out.println("Two Strings Are Equal = " + stringsAreEqual);

        // Using Java 8 Streams
        char[] characters = first.toCharArray();
        stringsAreEqual = IntStream
                .range(0, characters.length) // Subscriber" -> 1
                .anyMatch(i -> characters[i] != second.charAt(i)) ? false : true;

        System.out.println("(Java 8 anyMatch) Two Strings Are Equal = " + stringsAreEqual);
    }
}
