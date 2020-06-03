package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicateIntegers();
        removeDuplicateStrings();
    }

    private static void removeDuplicateIntegers() {
        List<Integer> numbersWithDuplicates = Arrays.asList(
                10, 10, 20, 20, 30, 30, 40, 50, 50
        );

        List<Integer> numbersWithoutDuplicates = numbersWithDuplicates
                .stream()
                .distinct()
                .collect(Collectors.toList());

        numbersWithoutDuplicates
                .forEach(System.out::println);
    }

    private static void removeDuplicateStrings() {
        List<String> stringsWithDuplicates = Arrays.asList(
                "I", "Like", "Java", "Program", "I", "Java", "Like"
        );

        List<String> stringsWithoutDuplicates = stringsWithDuplicates
                .stream()
                .distinct()
                .collect(Collectors.toList());

        stringsWithoutDuplicates
                .forEach(System.out::println);
    }
}
