package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;

public class FootBallMatchPoints {
    public static void main(String[] args) {
        String[] games = new String[]{
                "3:1",
                "2:2",
                "0:1",
                "3:2",
                "4:3",
                "1:1"
        };

        matchPoints(games);
        matchPointsUsingStream(games);
    }

    private static void matchPoints(String[] games) {
        int totalMatchPoints = 0;
        for (String s : games) { // "3:1","2:2","0:1","3:2","4:3","1:1"

            String[] arr = s.split(":"); // 3:1
            int x = Integer.parseInt(arr[0]); // 3
            int y = Integer.parseInt(arr[1]); // 1

            totalMatchPoints += x == y ? 1 : x > y ? 3 : 0;
        }
        System.out.println("Total match points = " + totalMatchPoints);
    }

    private static void matchPointsUsingStream(String[] games) {
        int totalMatchPoints = Arrays.stream(games)
                .mapToInt(score -> score.charAt(0) - score.charAt(2)) // 3 : 1 = 2, 2 : 2 =0
                .map(match -> match > 0 ? 3 : match == 0 ? 1 : 0)
                .sum();

        System.out.println("Total match points = " + totalMatchPoints);
    }


}
