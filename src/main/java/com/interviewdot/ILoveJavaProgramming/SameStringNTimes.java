package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class SameStringNTimes {
    public static void main(String[] args) {
        String word = "I Love Java ";

        nTimesUsingStringBuilder(word, 5);
        nTimesUsingRepeat(word, 5);
        nTimesUsingGenerate(word, 5);
    }

    private static void nTimesUsingStringBuilder(String word, int times) {
        StringBuilder sb = new StringBuilder(word.length() * times);
        for (int i = 0; i < times; i++) { // 5 times
            sb.append(word);
        }
        System.out.println(sb.toString());
    }

    // JDK 11 - System.arraycopy
    private static void nTimesUsingRepeat(String word, int times) {
        String repeatedString = word.repeat(times);
        System.out.println(repeatedString);
    }

    private static void nTimesUsingGenerate(String word, int times) {
        String result = Stream.generate(() -> word) // Lambda
                .limit(times)
                .collect(joining());

        System.out.println(result);
    }
}
