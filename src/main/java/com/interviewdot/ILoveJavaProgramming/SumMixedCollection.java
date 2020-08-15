package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.List;

public class SumMixedCollection {
    public static void main(String[] args) {
        List<?> mixedNumbers = Arrays.asList("12", 24, 45, "30", 11, "10");
        sumUsingStream(mixedNumbers);
        sumUsingReduce(mixedNumbers);
    }
    private static void sumUsingStream(List<?> mixedNumbers) {
        int sum = mixedNumbers.stream()
                .map(n -> n instanceof String ? Integer.valueOf((String) n) : (Integer) n)
                .mapToInt(i -> i)
                .sum();

        System.out.println("Sum of mixed numbers [Stream] = " + sum);
    }

    private static void sumUsingReduce(List<?> mixedNumbers) {
        int sum = mixedNumbers.stream()
                .map(Object::toString)
                .map(Integer::valueOf) // 12, 24, 45, 30, 11, 10
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of mixed numbers [reduce] = " + sum);
    }
}
