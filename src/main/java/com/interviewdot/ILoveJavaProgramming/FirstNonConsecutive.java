package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class FirstNonConsecutive {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7, 9, 11};
        findNonConsecutive(numbers);
        findNonConsecutiveUsingStream(numbers);
        findNonConsecutiveUsingAtomicInteger(numbers);
    }

    private static void findNonConsecutive(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) { // 1, 2, 3, 4, 6, 7, 9, 11
            int difference = numbers[i + 1] - numbers[i]; // 1
            if (difference != 1) {
                System.out.println("first non consecutive number : " + numbers[i + 1]);
                break;
            }
        }
    }

    private static void findNonConsecutiveUsingStream(int[] numbers) {
        Integer result = IntStream.range(1, numbers.length-1)
                .filter(x -> numbers[x - 1] + 1 != numbers[x]) // 1, 2, 3, 4, 6, 7, 9, 11
                .mapToObj(x -> numbers[x])
                .findFirst()
                .orElse(null);

        System.out.println("first non consecutive number : " + result);
    }

    private static void findNonConsecutiveUsingAtomicInteger(int[] numbers) {
        AtomicInteger a = new AtomicInteger(numbers[0]); // 1

        Integer result = Arrays.stream(numbers) // 1, 2, 3, 4, 6, 7, 9, 11
                .filter(x -> x != a.getAndIncrement())// 1, 2, 3, 4, 5
                .findFirst()
                .getAsInt();

        System.out.println("first non consecutive number : " + result);
    }

}
