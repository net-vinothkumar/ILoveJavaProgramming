package com.interviewdot.ILoveJavaProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String source = "I_Love_Java_Programming";
        findDuplicateCharacters(source);
        findDuplicateCharactersUsingStream(source);
    }

    private static void findDuplicateCharacters(String source) {
        char[] characters = source.toCharArray();
        Map<Character, Long> trackCharacterCount = new HashMap<>();
        for (Character character : characters) {
            if (trackCharacterCount.containsKey(character)) {
                trackCharacterCount.put(character, trackCharacterCount.get(character) + 1);
            } else {
                trackCharacterCount.put(character, 1L);
            }
        }

        displayDuplicateCharacters(trackCharacterCount);
    }

    private static void findDuplicateCharactersUsingStream(String source) {
        Map<Character, Long> result = source.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Duplicate characters using Java 8 groupBy");
        displayDuplicateCharacters(result);
    }

    private static void displayDuplicateCharacters(Map<Character, Long> trackCharacterCount) {
        Set<Character> characterSet = trackCharacterCount.keySet();
        for (Character character : characterSet) {
            Long duplicateCount = trackCharacterCount.get(character);
            if (duplicateCount > 1) {
                System.out.println(character + " = " + duplicateCount);
            }
        }
    }
}
