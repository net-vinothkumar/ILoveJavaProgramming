package com.interviewdot.ILoveJavaProgramming;

import java.util.HashMap;
import java.util.Map;

public class RestaurantTips {

    private static Map<String, Double> tips = new HashMap<>();

    static {  // Loaded even before the main() method is called..
        tips.put("terrible", 0d);
        tips.put("poor", 0.05);
        tips.put("good", 0.1);
        tips.put("great", 0.15);
        tips.put("excellent", 0.2);
    }

    public static void main(String[] args) {
        String tipRating = "good"; // poor good great excellent
        Double totalAmount = 1500d;

        Integer tipMoney = calculateTipUsingMap(tipRating, totalAmount);

        System.out.println("Please pay the tip amount = " + tipMoney);
    }

    private static Integer calculateTipUsingMap(String tipRating, Double totalAmount) {
        return (int) Math.ceil(tips.get(tipRating) * totalAmount);
    }
}
