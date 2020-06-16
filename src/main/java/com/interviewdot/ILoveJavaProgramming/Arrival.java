package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arrival {
    public static void main(String[] args) {
        //frequency();
        //countCharacters();
        palindrome();
    }

    private static void palindrome() {
        String input = "Kayak";
        input = input.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
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

    private static void countCharacters() {
        String word = "Happy Learning";
        Integer characterCount = 0;
        char[] characters = word.toCharArray();
        for (Character character : characters) {
            if (!character.equals("")) {
                characterCount++;
            }
        }
        System.out.println(characterCount);
    }

    private static void frequency() {
        Integer[] numbers = new Integer[]{1, 2, 2, 1, 3, 3, 5};
        Map<Integer, Integer> numberTrack = new HashMap<>();
        Arrays.stream(numbers).forEach(number -> {
            if (numberTrack.containsKey(number)) {
                numberTrack.put(number, numberTrack.get(number) + 1);
            } else {
                numberTrack.put(number, 1);
            }
        });

        for (Map.Entry<Integer, Integer> entry : numberTrack.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
