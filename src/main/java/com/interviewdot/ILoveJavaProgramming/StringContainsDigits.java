package com.interviewdot.ILoveJavaProgramming;

public class StringContainsDigits {
    public static void main(String[] args) {
        String word = "12345";
        containsOnlyDigits(word);
        containsOnlyDigitsUsingAllMatch(word);
    }

    private static void containsOnlyDigits(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isDigit(word.charAt(i))) { // 'L' 'o' 'v' 'e' 'J' 'a' 'v' 'a'
                System.out.println("Given string does not contains digits.");
                return;
            }
        }
        System.out.println("Given string contains only digits.");
    }

    private static void containsOnlyDigitsUsingAllMatch(String word) {
        boolean isOnlyDigit;

        isOnlyDigit = word
                .chars() // 'L' 'o' 'v' 'e' 'J' 'a' 'v' 'a'
                .allMatch(Character::isDigit);

        if (isOnlyDigit) {
            System.out.println("Given string contains only digits.");
        } else {
            System.out.println("Given string does not contains digits.");
        }
    }
}
