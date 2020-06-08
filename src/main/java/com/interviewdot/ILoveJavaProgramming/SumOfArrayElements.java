package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.List;

public class SumOfArrayElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                1, 5, 8, 13, 17, 10, 25, 32, 27
        );

        sumOfArrayElements(numbers);
        sumOfArrayElementsUsingReduce(numbers);
        sumOfArrayElementsUsingMap(numbers);
    }

    private static void sumOfArrayElements(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements using traditional loop = " + sum);
    }

    private static void sumOfArrayElementsUsingReduce(List<Integer> numbers) {

        Integer result = numbers.stream()
                .reduce((a, b) -> a + b)
                .orElse(0);

        System.out.println("Sum of array elements using reduce = " + result);
    }

    private static void sumOfArrayElementsUsingMap(List<Integer> numbers) {
        Integer result = numbers.stream()
                .mapToInt(Integer::intValue)// Stream<Integer> -> IntStream
                .sum();

        System.out.println("Sum of array elements using sum() = " + result);
    }
}
