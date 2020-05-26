package com.interviewdot.ILoveJavaProgramming;

/*
    Sum Of Digits = 1 + 2 + 3 + 4 = 10
 */
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits = " + sumOfDigitsUsingRecursive(1234));
        System.out.println("Sum of digits = " + sumOfDigitsUsingStreams(1234));
    }
/*
    1234 = 4
    123  = 3
    12   = 2
    1    = 1 */
    private static long sumOfDigitsUsingRecursive(long input) {
        return input == 0 ? 0 : input % 10 +
                sumOfDigitsUsingRecursive(input / 10);
    }

    private static long sumOfDigitsUsingStreams(long input) {
        return String.valueOf(input)
                .chars() // '1' '2' '3' '4'
                .map(Character::getNumericValue)
                .sum();
    }
}
