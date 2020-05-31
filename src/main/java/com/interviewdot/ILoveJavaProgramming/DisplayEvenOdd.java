package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DisplayEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        displayEvenNumbers(numbers);
        displayOddNumbers(numbers);
    }

    private static void displayEvenNumbers(List<Integer> numbers) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;

        System.out.println("Even Numbers");

        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println);
    }

    private static void displayOddNumbers(List<Integer> numbers) {
        Predicate<Integer> isOdd = (number) -> number % 2 != 0;
        System.out.println("Odd Numbers");
        numbers.stream()
                .filter(isOdd)
                .forEach(System.out::println);
    }
}
