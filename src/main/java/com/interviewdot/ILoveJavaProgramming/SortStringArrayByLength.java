package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayByLength {
    public static void main(String[] args) {
        String[] words = new String[]{
                "I",
                "Love",
                "Java",
                "Programming",
        };

        sortArray(words, "desc");
    }

    private static void sortArray(String[] words, String order) {
        String[] results;
        if ("asc".equals(order)) {
            results = Arrays.stream(words)
                    .sorted(Comparator.comparingInt(String::length))
                    .toArray(String[]::new);
        } else {
            results = Arrays.stream(words)
                    .sorted(Comparator.comparingInt(String::length).reversed())
                    .toArray(String[]::new);
        }

        Arrays.stream(results)
                .forEach(System.out::println);
    }
}
