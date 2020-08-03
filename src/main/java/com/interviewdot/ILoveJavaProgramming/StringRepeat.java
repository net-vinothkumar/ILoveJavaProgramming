package com.interviewdot.ILoveJavaProgramming;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringRepeat {
    public static void main(String[] args) {
        String word = " Apple ";
        int times = 10;

        repeatString(word, times);
        repeatUsingCollection(word, times);
        repeatUsingGenerate(word, times);
    }

    private static void repeatString(String word, int times) {
        String result = times > 0 ? word.repeat(times) : "";
        System.out.println(result);
    }

    private static void repeatUsingCollection(String word, int times) {
        String result = times < 0 ? "" : String.join("", Collections.nCopies(times, word));
        System.out.println(result);
    }

    private static void repeatUsingGenerate(String word, int times) {
        String result = Stream.generate(word::toString).limit(times).collect(Collectors.joining());
        System.out.println(result);
    }
}
