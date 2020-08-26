package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mumbling {
    public static void main(String[] args) {
        String word = "abcd";
        mumble(word);
    }

    private static void mumble(String word) {
        String result = IntStream.range(0, word.length())
                .mapToObj(i-> accumCharacter(word, i))     // EACH INDEX
                .collect(Collectors.joining("-"));

        System.out.println("mumble for 'abcd' = " + result);
    }

    private static String accumCharacter(String word, int index) {
        return IntStream.range(0, index + 1) // [0, 1] [0, 2] [0, 3] [0, 4]
                .mapToObj(i -> i == 0 ? Character.toUpperCase(word.charAt(index)) : Character.toLowerCase(word.charAt(index)))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
