package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HowMuchIsMyScore {
    public static void main(String[] args) {
        int[] classPoints = new int[]{76, 79, 90, 81, 87, 85};
        int myAverage = 85;

        calculateMyScoreUsingStream(classPoints, myAverage);
        calculateMyScoreUsingStreamSum(classPoints, myAverage);
    }

    private static void calculateMyScoreUsingStream(int[] classPoints, int myAverage) {
        double classAverage = Arrays.stream(classPoints)
                .peek(System.out::println)
                .average() // 76 + 79 + 90 + 81 + 87 + 85 / 6
                .orElse(0);

        if (myAverage > classAverage) {
            System.out.println("I am a better student in the class.");
        } else {
            System.out.println("I am an average student in the class.");
        }

    }

    private static void calculateMyScoreUsingStreamSum(int[] classPoints, int myAverage) {
        double classAverage = IntStream.of(classPoints)
                .peek(System.out::println)
                .sum() / classPoints.length; // (76 + 79 + 90 + 81 + 87 + 85) / 6

        if (myAverage > classAverage) {
            System.out.println("I am a better student in the class.");
        } else {
            System.out.println("I am an average student in the class.");
        }
    }
}
