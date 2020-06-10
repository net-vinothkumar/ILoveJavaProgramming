package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String source = "triangle";
        String target = "integral";

        isAnagramUsingSort(source, target);
        isAnagramUsingStreams(source, target);
    }

    private static void isAnagramUsingSort(String source, String target) {
        char[] sourceChars = source.toLowerCase().toCharArray();
        char[] targetChars = target.toLowerCase().toCharArray();
        Arrays.sort(sourceChars); // a e g i l n r t
        Arrays.sort(targetChars); // a e g i l n r t
        boolean isAnagram = Arrays.equals(sourceChars,targetChars);

        System.out.println("find anagram using sort = " + isAnagram);
    }

    private static void isAnagramUsingStreams(String source, String target) {

        boolean isAnagram = Stream.of(source.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining()) // a e g i l n r t
                .equals(
                        Stream.of(target.toLowerCase()
                                .split(""))
                                .sorted() // a e g i l n r t
                                .collect(Collectors.joining()));

        System.out.println("find anagram using sort = " + isAnagram);
    }
}
