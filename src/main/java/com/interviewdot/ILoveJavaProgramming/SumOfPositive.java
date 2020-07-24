package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;

public class SumOfPositive {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, -4, 5, 7, 19, 4, -3, 5, -8};

        calculateSumOfPositive(numbers);
        calculateSumOfPositiveUsingReduce(numbers);
        calculateSumOfPositiveUsingFilterAndReduce(numbers);
    }

    private static void calculateSumOfPositive(int[] numbers) {
        int sum = Arrays.stream(numbers)
                .filter(number -> number > 0) // ONLY +ive NUMBERS
                .sum();
        System.out.println("Sum of positive numbers = " + sum);
    }

    private static void calculateSumOfPositiveUsingReduce(int[] numbers) {
        int sum = Arrays.stream(numbers)// 1, 2, -4, 5, 7, 19, 4, -3, 5, -8
                .reduce(0, (total, number) -> (number > 0) ? (total + number) : total);
        System.out.println("Sum of positive numbers = " + sum);
    }

    private static void calculateSumOfPositiveUsingFilterAndReduce(int[] numbers) {
        int sum = Arrays.stream(numbers)
                .filter(number -> number > 0) // ONLY +ive NUMBERS
                .reduce(0, (a, b) -> (a + b)); // 1, 2, 5, 7, 19, 4, 5
        System.out.println("Sum of positive numbers = " + sum);
    }
}
