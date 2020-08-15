package com.interviewdot.ILoveJavaProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendNewElement {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 3, 6, 5, 4, 3, 9, 3, 1};
        List<Integer> result = new ArrayList<>();
        Arrays.stream(numbers).forEach(number -> {
            result.add(number);
            if (number == 3) {
                result.add(7);
            }
        });
        result.forEach(System.out::println);
    }
}
