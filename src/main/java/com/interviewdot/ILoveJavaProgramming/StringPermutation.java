package com.interviewdot.ILoveJavaProgramming;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    public static void main(String[] args) {
        String input = "ABC";
        System.out.println(permutate(input));
    }

    private static Set<String> permutate(String input) { // 'ABC'
        Set<String> permutations = new HashSet<>();

        if (input.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char firstCharacter = input.charAt(0); // 'A'
        String remainingCharacter = input.substring(1);
        Set<String> words = permutate(remainingCharacter); // 'BC' 'CB'

        for (String word : words) { // Generates permutations
            for (int i = 0; i <= word.length(); i++) {
                permutations.add(addCharacters(word, firstCharacter, i));
            }
        }
        return permutations;
    }

    private static String addCharacters(String word, char c, int i) {
        String first = word.substring(0, i);
        String last = word.substring(i);
        return first + c + last;
    }
}

//'ABC'
//'A' 'BC'
//'B' + 'C' => 'BC' 'CB'
//'A' + 'BC' 'CB' => 'ACB','BCA','ABC','CBA','BAC','CAB'