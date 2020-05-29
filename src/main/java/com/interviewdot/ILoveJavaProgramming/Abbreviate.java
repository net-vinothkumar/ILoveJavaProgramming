package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
    How to abbreviate a sentance using Java 8 Map ?
    National Aeronautics Space Administration => N.A.S.A
 */
public class Abbreviate {

    public static void main(String[] args) {
        String nasa = "National Aeronautics Space Administration";
        System.out.println(abbreviate(nasa));
        System.out.println(abbreviateUsingJava8Map(nasa));
    }

    private static String abbreviate(String nasa) {
        StringBuilder result = new StringBuilder();
        String[] str = nasa.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (i != (str.length - 1)) {
                result.append(Character.toUpperCase(str[i].charAt(0))).append(".");
            } else {
                result.append(Character.toUpperCase(str[i].charAt(0)));
            }
        }

        return result.toString();
    }

    // Using Java 8 Map
    private static String abbreviateUsingJava8Map(String nasa) {
        return Arrays.stream(nasa.split(" "))
                .map(String::toUpperCase)
                .map(word -> word.substring(0, 1))
                .collect(Collectors.joining("."));
    }
}
