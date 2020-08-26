package com.interviewdot.ILoveJavaProgramming;

public class SimpleStringCharacters {
    public static void main(String[] args) {
        String word = "*'&$ABCDEabcde1234578";
        displayWordCounts(word);
    }

    private static void displayWordCounts(String word) {
        int upperCaseCount = (int) word
                .chars()
                .filter(Character::isUpperCase)
                .count();

        int lowerCaseCount = (int) word
                .chars()
                .filter(Character::isLowerCase)
                .count();

        int numbers = (int) word
                .chars()
                .filter(Character::isDigit)
                .count();

        int specialCharsCount = word.length() - (upperCaseCount + lowerCaseCount + numbers);

        System.out.println("Upper Case = " + upperCaseCount);
        System.out.println("Lower Case = " + lowerCaseCount);
        System.out.println("numbers = " + numbers);
        System.out.println("Special Characters = " + specialCharsCount);
    }
}
