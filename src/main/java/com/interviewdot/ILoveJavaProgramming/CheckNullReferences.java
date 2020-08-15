package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/** Java Objects::nonNull, Objects::isNull **/

public class CheckNullReferences {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, null, 20, null, null, 25, 48, null, 15, 89);
        sum(numbers);
        isNullItem(numbers);
        isNonNullItem(numbers);
    }

    private static void sum(List<Integer> numbers) {
        if (Objects.isNull(numbers)) {
            new IllegalArgumentException("Invalid list of numbers.");
        }

        Integer sum = numbers.stream()
                .filter(Objects::nonNull) // USE IT LIKE A PREDICATE
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of given numbers = " + sum);
    }

    private static void isNullItem(List<Integer> numbers) {
        boolean result_isNull = numbers.stream()
                .anyMatch(Objects::isNull);

        if (result_isNull) {
            System.out.println("The number list contains NULL items.");
        }
    }

    private static void isNonNullItem(List<Integer> numbers) {
        boolean result_isNonNull = numbers.stream()
                .anyMatch(Objects::nonNull);

        if (result_isNonNull) {
            System.out.println("The number list contains NON NULL items.");
        }
    }
}
