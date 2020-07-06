package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.Collectors;

public class RemoveCharacter {
    public static void main(String[] args) {
        String word = "JavaProgramming";
        char character = 'm';

        removeCharacter(word, character);
        removeCharacterUsingStream(word, character);
        removeCharacterUsingCodePoint(word, String.valueOf(character));
    }

    private static void removeCharacter(String word, char remove) {
        StringBuilder sb = new StringBuilder();
        char[] characterArray = word.toCharArray();

        for (char character : characterArray) { //'J' 'a' 'v' 'a' 'P' 'r' 'o' 'g' 'r' 'a' 'm' 'm' 'i' 'n' 'g'
            if (character != remove) {// 'm'
                sb.append(character);
            }
        }

        System.out.println("String after removing the character : " + sb);
    }





    private static void removeCharacterUsingStream(String word, char remove) {
        String result = word.chars()
                .filter(character -> character != remove) // 'm'
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("String after removing the character : " + result);
    }







    private static void removeCharacterUsingCodePoint(String word, String remove) {
        int codePoint = remove.codePointAt(0); // 109 'm'

        String result = word.codePoints()
                .peek(System.out::println)
                .filter(c -> c != codePoint)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("String after removing the character : " + result);
    }
}
