package com.interviewdot.ILoveJavaProgramming;

import java.util.regex.Pattern;

public class CountSubstrings {
    public static void main(String[] args) {
        String substring = "Kotlin";
        String source = "I Love Java Java Java Java And Java Programming";
        //String source = "I Love ; ; ; ; And ; Programming";

        countNumberOfSubstrings(source, substring);
    }

    private static void countNumberOfSubstrings(String source, String substring) {
        String[] substrings = source.split(Pattern.quote(substring), -1);
        int result = substrings.length - 1;

        int numberOfSubstrings = result < 0 ? 0 : result;

        System.out.println(substring + " appeared " + numberOfSubstrings + " times in " + "'" + source + "'");
    }
}
