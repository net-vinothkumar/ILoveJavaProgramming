package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.IntStream;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    private static String reverseString(String input) {
        StringBuilder s = new StringBuilder();
        int bound = input.length();
        for (int i = 0; i < bound; i++) {
            int c = input.charAt(input.length() - i - 1);
            s.append((char) c);
        }
        return s.toString();
    }
}
