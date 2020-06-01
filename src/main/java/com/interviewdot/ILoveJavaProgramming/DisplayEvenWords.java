package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;

public class DisplayEvenWords {
    public static void main(String[] args) {
        String input = "I Love Java Programming Very Much";
        displayEvenWords(input);
        displayEvenWordsUsingStreams(input);
    }

    private static void displayEvenWords(String input) {
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    private static void displayEvenWordsUsingStreams(String input) {
        System.out.println("Even words using Java 8 Streams");
        String[] words = input.split("\\s+");
        Arrays.stream(words)
                .filter(word -> word.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
