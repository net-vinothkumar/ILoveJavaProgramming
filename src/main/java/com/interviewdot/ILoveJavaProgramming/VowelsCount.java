package com.interviewdot.ILoveJavaProgramming;

import java.util.HashSet;
import java.util.Set;

public class VowelsCount {
    private static Set<Character> vowels = new HashSet<>();

    static {
        vowels.add('a');vowels.add('A');
        vowels.add('e');vowels.add('E');
        vowels.add('i');vowels.add('I');
        vowels.add('o');vowels.add('O');
        vowels.add('u');vowels.add('U');
    }

    public static void main(String[] args) {
        String source = "I Love Java Programming";

        long vowelsCount = source.chars()
                .mapToObj(character -> (char) character)
                .filter(character -> vowels.contains(character))
                .count();

        System.out.println("Vowels count = " + vowelsCount);
    }
}
