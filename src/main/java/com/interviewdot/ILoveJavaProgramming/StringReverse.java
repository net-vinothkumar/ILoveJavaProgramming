package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.IntStream;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }
    // H e l l o
    // 0 1 2 3 4
    private static String reverseString(String input) {
        return IntStream.range(0, input.length())
                .map(i -> input.charAt(input.length() - i - 1))
                .collect(StringBuilder::new, (s, c) -> s.append((char) c), StringBuilder::append).toString();
    }
}
