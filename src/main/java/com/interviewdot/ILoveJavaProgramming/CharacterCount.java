package com.interviewdot.ILoveJavaProgramming;

import java.util.Collections;

import static java.util.Arrays.asList;

public class CharacterCount {
    public static void main(String[] args) {
        String words = "I will learn kotlin programming very fast";
        char character = 'a';

        findCharacterCountUsingFilter(words, character);
        findCharacterCountUsingFrequency(words, character);
        findCharacterCountUsingMap(words, character);
    }

    private static void findCharacterCountUsingFilter(String words, char character) {
        long count = words.chars()
                .filter(x -> x == character)
                .count();
        displayResult(words, character, count);
    }

    private static void findCharacterCountUsingFrequency(String words, char character) {
        int count = Collections.frequency(
                asList(words.split("")),
                "" + character
        );

        displayResult(words, character, count);
    }

    private static void findCharacterCountUsingMap(String words, char character) {
        long count = words.chars()
                .mapToObj(c -> (char) c)
                .filter(x -> x == character)
                .count();
        displayResult(words, character, count);
    }

    private static void displayResult(String words, char character, long count) {
        System.out.println("'" + character + "'" + " appears " + count + " times in '" + words + "'");
    }
}
