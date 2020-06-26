package com.interviewdot.ILoveJavaProgramming;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Capitalize {
    public static void main(String[] args) {
        String word = "abcdef";
        String[] letters = word.split("");

        String toUpperCase = capitalize(letters, String::toUpperCase, String::toLowerCase);
        String toLowerCase = capitalize(letters, String::toLowerCase, String::toUpperCase);

        System.out.println("UpperCase word = " + toUpperCase);
        System.out.println("LowerCase word = " + toLowerCase);
    }

    private static String capitalize(String[] letters, Function<String, String> modifyOne, Function<String, String> modifyTwo) {
        return IntStream.range(0, letters.length)
                .mapToObj(index -> {
                            if (index % 2 == 0) { // 0 2 4
                                return modifyOne.apply(letters[index]);
                            } else { // 1 3 5
                                return modifyTwo.apply(letters[index]);
                            }
                        }
                ).collect(Collectors.joining());
    }
}
