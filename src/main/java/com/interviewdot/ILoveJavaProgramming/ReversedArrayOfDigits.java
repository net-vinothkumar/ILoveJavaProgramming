package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Character.getNumericValue;

/**
 * 732648 => 846237 => {8, 4, 6, 2, 3, 7}  => Reversed Array
 */

public class ReversedArrayOfDigits {
    public static void main(String[] args) {
        long number = 732648;
        reverseArray(number);
        System.out.println("*********************");
        reverseArrayUsingIntStream(number);
    }

    private static void reverseArray(long number) {
        int[] numbers = new StringBuilder()
                .append(number)
                .reverse()
                .chars() // '8' '4' '6' '2' '3' '7'
                .map(Character::getNumericValue)
                .toArray();

        Arrays.stream(numbers).forEach(System.out::println);
    }

    private static void reverseArrayUsingIntStream(long number) {
        String str = String.valueOf(number);

        int[] numbers = IntStream
                .rangeClosed(1, str.length()) // "732648"
                .map(i -> getNumericValue(str.charAt(str.length() - i)))
                .toArray();

        Arrays.stream(numbers).forEach(System.out::println);
    }

}
