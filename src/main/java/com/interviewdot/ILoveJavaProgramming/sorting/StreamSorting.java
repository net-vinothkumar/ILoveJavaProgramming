package com.interviewdot.ILoveJavaProgramming.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
        sortNumbers();
        sortStrings();
        sortStringsReverse();
    }

    private static void sortNumbers() {
        List<Integer> numbers = Arrays.asList(
                10, 50, 20, 75, 60, 45
        );

        numbers.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void sortStrings() {
        System.out.println("--------------");
        List<String> words = Arrays.asList(
                "I", "Love", "Java", "Programming", "Very", "Much"
        );

        words.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void sortStringsReverse() {
        System.out.println("--------------");
        List<String> words = Arrays.asList(
                "I", "Love", "Java", "Programming", "Very", "Much"
        );

        words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
