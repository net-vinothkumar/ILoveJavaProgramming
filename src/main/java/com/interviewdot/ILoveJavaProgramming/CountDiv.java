package com.interviewdot.ILoveJavaProgramming;

public class CountDiv {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;
        int k = 2;
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                count++;
            }
        }
        System.out.println("count div result = " + count);
    }
}
