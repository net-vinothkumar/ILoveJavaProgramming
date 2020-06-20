package com.interviewdot.ILoveJavaProgramming;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] words = new String[]{"flowing", "flow", "cat"};
        String prefix = words[0];

        for (String word : words) {
            while (word.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        if (!prefix.equals("")) {
            System.out.println(prefix);

        } else {
            System.out.println("There is no longest common prefix");
        }
    }
}


//"flowing"
//"flowin"
//"flowi"
//"flow"