package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;

public class SumWithoutHighestLowest {
    public static void main(String[] args) {
        int[] numbers = new int[]{6, 2, 1, 8, 7, 10, 3};  // 1 and 10
        sumUsingSkip(numbers);
        sumUsingCopy(numbers);
    }

    private static void sumUsingSkip(int[] numbers) {
        int result = Arrays.stream(numbers)
                .sorted()                   //   {1, 2, 3, 6, 7, 8, 10}
                .skip(1)                    //   {2, 3, 6, 7, 8, 10}
                .limit(numbers.length - 2)  //   {2, 3, 6, 7, 8}
                .sum();

        System.out.println("Sum Of Array Without Highest / Lowest Numbers = " + result);
    }

    private static void sumUsingCopy(int[] numbers) {
        Arrays.sort(numbers); //   {1, 2, 3, 6, 7, 8, 10}
                              //    0  1  2  3  4  5  6
        int result = Arrays.stream(
                Arrays.copyOfRange(
                        numbers,
                        1,
                        numbers.length - 1   //   {2, 3, 6, 7, 8}
                )
        ).sum();

        System.out.println("Sum Of Array Without Highest / Lowest Numbers = " + result);
    }
}
