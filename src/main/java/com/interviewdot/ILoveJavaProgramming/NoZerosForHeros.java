package com.interviewdot.ILoveJavaProgramming;

public class NoZerosForHeros {
    public static void main(String[] args) {
        int number = 1050000;

        noBoringZeros(number);
        noBoringZerosUsingReplace(number);
    }

    private static void noBoringZeros(int number) {
        if (number == 0) {
            System.out.println("No Zero For Hero's = " + number);
        }

        while (number % 10 == 0) { // 980000
            number /= 10; // 98000 9800 980 98
        }

        System.out.println("No Zero For Hero's = " + number);
    }

    private static void noBoringZerosUsingReplace(int number) {
        String result = String.valueOf(number) // 980000 => 98
                .replaceAll("0+$", "");

        int noZeros = result.equals("") ? 0 : Integer.parseInt(result);
        System.out.println("No Zero For Hero's = " + noZeros);
    }
}
