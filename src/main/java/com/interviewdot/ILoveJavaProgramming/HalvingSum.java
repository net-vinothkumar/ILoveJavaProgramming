package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.IntStream;

public class HalvingSum {
    public static void main(String[] args) {
        int n = 25;
        halvingSumUsingRecursive(n);
        halvingSumUsingStream(n);
        halvingSumUsingWhile(n);
    }

    private static void halvingSumUsingRecursive(int n) {
        System.out.println("Halving Sum Result - Recursive = " + halvingSum(n));
    }

    private static int halvingSum(int n) {
        return n == 1 ? 1 : n + halvingSum(n / 2); // 25 + 12 + 6 + 3 + 1
    }

    private static void halvingSumUsingStream(int n) {
        int result = IntStream
                .iterate(n, i -> i / 2) // 25 + 12 + 6 + 3 + 1
                .limit(n)
                .filter(i -> i > 0)
                .sum();
        System.out.println("Halving Sum Result - Stream = " + result);
    }

    private static void halvingSumUsingWhile(int n) {
        int result = 0;
        while (n > 0) {
            result += n; // 25 + 12 + 6 + 3 + 1
            n = n / 2;
        }

        System.out.println("Halving Sum Result - while = " + result);
    }
}
