package com.interviewdot.ILoveJavaProgramming;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        String word = "Programming";

        removeFirstLastCharacter(word);
        removeFirstLastCharacterStringBuilder(word);
        removeFirstLastCharacterStringBuffer(word);
    }

        // P rogrammin g
        // 0 123456789 10
    private static void removeFirstLastCharacter(String word) {
        String result = word.substring(1, word.length() - 1);
        System.out.println("Removed first and last character = " + result);
    }

        // P rogrammin g
        // 0 123456789 10
    private static void removeFirstLastCharacterStringBuilder(String word) {
        StringBuilder builder = new StringBuilder(word);
        builder.deleteCharAt(word.length() - 1);
        builder.deleteCharAt(0);

        System.out.println("Removed first and last character = " + builder.toString());
    }

        // P rogrammin g
        // 0 123456789 10
    private static void removeFirstLastCharacterStringBuffer(String word) {
        StringBuffer buffer = new StringBuffer(word);
        buffer.delete(word.length() - 1, word.length());
        buffer.delete(0, 1);

        System.out.println("Removed first and last character = " + buffer.toString());
    }
}
