package com.interviewdot.ILoveJavaProgramming;

import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {
        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;
        String input = "abcabcbb";
                    //  ⇪ ⇪  ⇪ ⇪
                    //  a b pointer

        HashSet<Character> characters = new HashSet<>(); // 'a' 'b' 'c'

        while (b_pointer < input.length()) {
            if (!characters.contains(input.charAt(b_pointer))) {
                characters.add(input.charAt(b_pointer)); // 'a'
                b_pointer++;
                max = Math.max(characters.size(), max); // max(2, 3) -> 3
            } else {
                characters.remove(input.charAt(a_pointer));
                a_pointer++;
            }
        }

        System.out.println("Longest Substring = " + max);
    }
}
