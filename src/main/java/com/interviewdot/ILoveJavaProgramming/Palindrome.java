package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String input = "Apple";
        isPalindrome(input.toLowerCase());
        isPalindromeUsingStream(input.toLowerCase());
    }

    private static void isPalindrome(String input) {
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) { // SPLIT 'm' 'a' 'd' 'a' 'm'
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Given string is palindrome...");
        } else {
            System.out.println("Given string is not a palindrome...");
        }
    }

    private static void isPalindromeUsingStream(String input) {
        boolean isPalindrome;
        isPalindrome = IntStream
                .range(0, input.length() / 2) // 0 1
                .noneMatch(i -> input.charAt(i) != input.charAt(input.length() - i - 1));

        if (isPalindrome) {
            System.out.println("Given string is palindrome...");
        } else {
            System.out.println("Given string is not a palindrome...");
        }
    }
}
