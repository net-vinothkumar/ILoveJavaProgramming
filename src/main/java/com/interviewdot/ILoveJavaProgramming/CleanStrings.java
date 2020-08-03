package com.interviewdot.ILoveJavaProgramming;

public class CleanStrings {
    public static void main(String[] args) {
        String untrimmedWord =  "\n \n \n Hello Friends \t \n \r \n";

        System.out.println(untrimmedWord);
        System.out.println("trim = "+untrimmedWord.trim());

        System.out.println("strip = " + untrimmedWord.strip());
        System.out.println("stripLeading = " + untrimmedWord.stripLeading());
        System.out.println("stripTrailing = " + untrimmedWord.stripTrailing());
    }
}
