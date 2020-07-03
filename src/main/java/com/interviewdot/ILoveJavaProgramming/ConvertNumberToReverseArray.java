package com.interviewdot.ILoveJavaProgramming;

import java.util.Stack;

public class ConvertNumberToReverseArray {
    public static void main(String[] args) {
        long number = 348597L;
        int[] result = reverseUsingStack(number);
        result = reverseUsingString(number);

        System.out.println(result);
    }

    private static int[] reverseUsingStack(long number) {
        Stack<Integer> digits = new Stack<>();

        while (number > 0) {
            digits.push((int) number % 10); // 348597
            number /= 10; // 348597 34859 3485 348 348597
        }
        return digits
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private static int[] reverseUsingString(long number) {
        return new StringBuilder().append(number)
                .reverse() // 796843
                .chars() // '7' '9' '5' '8' '4' '3
                .map(Character::getNumericValue)
                .toArray();
    }
}
