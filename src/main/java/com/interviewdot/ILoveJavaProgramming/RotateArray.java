package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 8, 9, 10};
                                    // {1, 2, 3, 4, 8, 9,  }; lastElement = 10
        Integer k = 3;
        Integer j;

        while (k > 0) {
            Integer lastElement = numbers[numbers.length - 1];
            for (j = numbers.length - 1; j > 0; j--) {
                numbers[j] = numbers[j - 1];
            }

            numbers[j] = lastElement;
            k--;
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }
}














/**
 * Java Program to right rotate the elements of an array
Exampl

        Input: [1, 2, 3, 4, 8, 9, 10] and k = 3

        Output: [8, 9, 10, 1, 2, 3, 4]

        Explanation:

        rotate 1 steps to the right: [10, 1, 2, 3, 4, 8, 9] lastElement = 10
        rotate 2 steps to the right: [9, 10, 1, 2, 3, 4, 8] lastElement = 9
        rotate 3 steps to the right: [8, 9, 10, 1, 2, 3, 4] lastElement = 8
**/

