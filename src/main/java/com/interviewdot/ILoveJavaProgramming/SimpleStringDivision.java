package com.interviewdot.ILoveJavaProgramming;

import java.util.ArrayList;
import java.util.List;

public class SimpleStringDivision {
    public static void main(String[] args) {
        String numbers = "1234";
        int delimiter = 1;

        findMax(numbers, delimiter);
    }

    private static void findMax(String numbers, int delimiter) {
        List<String> values = new ArrayList<>();

        for (int i = 0; i + numbers.length() - delimiter <= numbers.length(); i++) {
            values.add(numbers.substring(i, i + numbers.length() - delimiter));
        }

        values.forEach(System.out::println);

        long result = values.stream()
                .mapToLong(Long::parseLong)
                .max()
                .getAsLong();

        System.out.println("The max value = " + result);
    }
}
