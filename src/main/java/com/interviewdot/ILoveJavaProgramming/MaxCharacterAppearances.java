package com.interviewdot.ILoveJavaProgramming;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;

public class MaxCharacterAppearances {
    public static void main(String[] args) {
        String word = "Are You A Programmer";

        findMaxCharacterOccurrences(word);
        findMaxCharacterOccurrencesUsingStream(word);
    }

    private static void findMaxCharacterOccurrences(String word) {
        Map<Character, Integer> counter = new HashMap<>();
        char[] characters = word.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            if (!Character.isWhitespace(currentChar)) { // ignore whitespace
                Integer occurences = counter.get(currentChar);
                if (occurences == null) {
                    counter.put(currentChar, 1);
                } else {
                    counter.put(currentChar, counter.get(currentChar) + 1);
                }
            }
        } // map(character vs occurrences) - prepared

        int maxOccurrences = Collections.max(counter.values()); // 4
        char maxCharacter = Character.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == maxOccurrences) {
                maxCharacter = entry.getKey(); // 'r'
            }
        }

        System.out.println(maxCharacter + " character appeared " + maxOccurrences + " times");
    }

    private static void findMaxCharacterOccurrencesUsingStream(String word) {
        Pair result = word.chars()
                .filter(character -> !Character.isWhitespace(character))
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, counting())) // map (c,o)
                .entrySet()
                .stream()
                .peek(System.out::println)
                .max(comparingByValue())
                .map(p -> new Pair(p.getKey(), p.getValue()))
                .orElse(new Pair(Character.MIN_VALUE, -1L));

        System.out.println(result.character + " character appeared " + result.occurrences + " times");
    }

    static class Pair {
        Character character;
        Long occurrences;

        public Pair(Character character, Long occurrences) {
            this.character = character;
            this.occurrences = occurrences;
        }
    }
}
