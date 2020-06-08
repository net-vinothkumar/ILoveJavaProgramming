package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int numberOfElements = 5;
        reverseArray(numberOfElements);
        reverseArrayUsingIterate(numberOfElements);
        reverseArrayUsingRange(numberOfElements);
    }

    private static void reverseArray(int numberOfElements) {
        int[] reverse = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            reverse[i] = numberOfElements - i;
        }
        System.out.println("Reverse using for-loop");

        Arrays.stream(reverse)
                .forEach(System.out::print);
        System.out.println();
    }

    private static void reverseArrayUsingIterate(int numberOfElements) {
        int[] reverse;
        reverse = IntStream.iterate(numberOfElements, i -> i - 1)
                .limit(numberOfElements) // 5
                .toArray();

        System.out.println("Reverse using iterate");

        Arrays.stream(reverse)
                .forEach(System.out::print);
        System.out.println();
    }

    private static void reverseArrayUsingRange(int numberOfElements) {
        int[] reverse = IntStream.range(0, numberOfElements)
                .map(x -> numberOfElements - x)// 5-0, 5-1, 5-2, 5-3, 5-4
                .toArray();

        System.out.println("Reverse using range");

        Arrays.stream(reverse)
                .forEach(System.out::print);
        System.out.println();
    }
}
