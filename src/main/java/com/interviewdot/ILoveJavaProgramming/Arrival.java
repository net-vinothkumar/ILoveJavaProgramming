package com.interviewdot.ILoveJavaProgramming;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Arrival {
    public static void main(String[] args) {
        //frequency();
        //countCharacters();
        //palindrome();
        //maxOccuringCharacter();
        //duplicateWordsInAString();
        //longestPrefix();
        //removeDuplicates();
        //removeElement();
        //reverseArray();
        //isNumber();
        //swapTwoNumbers();
        isPalindromeNumber();
    }

    private static void isPalindromeNumber() {
        int a = 121;
        int temp = a;

        int reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        if (a == reverse) {
            System.out.println("Given number is palindrome..");
        } else {
            System.out.println("Given number is not a palindrome..");
        }
    }

    private static void swapTwoNumbers() {
        int a = 5;
        int b = 7;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }

    private static void isNumber() {
        String[] inputs = new String[]{"123", "abc", "232"};
        Pattern pattern = Pattern.compile(".*\\D.*");
        for (String input : inputs) {
            if (!pattern.matcher(input).matches()) {
                System.out.println(input + " is a digit...");
            }
        }
    }

    private static void reverseArray() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7};
        int temp;
        int j = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++, j--) {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        Arrays.stream(numbers).forEach(System.out::println);
    }

    private static void removeElement() {
        int[] numbers = new int[]{1, 1, 2, 2, 3};
        int r = 2;
        int i = 0;

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] != r) {
                numbers[i] = numbers[j];
                i++;
            }
        }
        Arrays.stream(numbers).forEach(System.out::println);
    }

    private static void removeDuplicates() {
        int[] numbers = new int[]{1, 1, 2, 2, 3};
        int i = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] != numbers[i]) {
                i++;
                numbers[i] = numbers[j];
            }
        }
        System.out.println("Number of elements after removing duplicate : " + (i + 1));
    }

    private static void longestPrefix() {
        String[] input = new String[]{"flow", "flowing", "flower"};
        String prefix = input[0];

        for (int i = 0; i < input.length; i++) {
            while (input[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }

    private static void duplicateWordsInAString() {
        String input = "Hello World Hello Subscriber";
        String[] words = input.split("\\s+");

        Map<String, Integer> wordsCount = new HashMap<>();
        Arrays.stream(words).forEach(word -> {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        });

        Set<Map.Entry<String, Integer>> entries = wordsCount.entrySet();
        List<String> duplicates = entries.stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        duplicates.forEach(System.out::println);
    }

    private static void maxOccuringCharacter() {
        String input = "Hello World";
        // char - count
        // count - find max

        Map<Character, Integer> charCount = new HashMap<>();
        for (Character character : input.toCharArray()) {
            if (charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1);
            } else {
                charCount.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charCount.entrySet();
        Integer max = 0;
        Character maxCharacter = null;
        for (Map.Entry entry : entrySet) {
            if ((Integer) entry.getValue() > max) {
                max = (Integer) entry.getValue();
                maxCharacter = (Character) entry.getKey();
            }
        }

        System.out.println("Max character count = " + maxCharacter);
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
