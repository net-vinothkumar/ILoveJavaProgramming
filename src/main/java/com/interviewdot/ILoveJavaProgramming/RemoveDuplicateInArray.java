package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};

        int index = 1;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }

        Arrays.stream(nums).forEach(System.out::println);
    }
}
