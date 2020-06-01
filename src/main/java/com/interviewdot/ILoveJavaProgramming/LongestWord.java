package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static void main(String[] args) {
        String input = "I Love Java Programming Very Much";
        displayLongestWord(input);
        displayLongestWordUsingJavaMax(input);
    }

    private static void displayLongestWord(String input) {
        String[] words = input.split("\\s+");
        String longestWord = " ";

        for (String word : words) {
            if (word.length() > longestWord.length())
                longestWord = word;
        }
        System.out.println(longestWord);
    }

    private static void displayLongestWordUsingJavaMax(String input) {
        System.out.println("Longest word using Java 8 Streams");

        String longestWord = Arrays
                .stream(input.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println(longestWord);
    }
}
