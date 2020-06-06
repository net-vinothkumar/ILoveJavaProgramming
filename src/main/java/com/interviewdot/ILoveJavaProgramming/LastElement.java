package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.List;

public class LastElement {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "I", "Love", "Java", "Programming", "It's", "Cool"
        );
        findTheLastElementUsingReduce(words);
        findTheLastElementUsingSkip(words);
    }

    private static void findTheLastElementUsingReduce(List<String> words) {
        String lastElement = words.stream()
                .reduce((first, second) -> second)
                .orElse("No last element");

        System.out.println("Last element using reduce...");
        System.out.println(lastElement);
    }

    private static void findTheLastElementUsingSkip(List<String> words) {
        String lastElement = words.stream()
                .skip(words.size() - 1)
                .findFirst()
                .orElse("No last element");

        System.out.println("Last element using skip");
        System.out.println(lastElement);
    }
}
