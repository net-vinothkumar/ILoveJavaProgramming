package com.interviewdot.ILoveJavaProgramming;

import java.util.Arrays;

public class ExtractHero {
    private static final String NEW_LINE_PATTERN = "\\r?\\n";
    private static final String KYC_DATA_HERO = "kyc_data_hero_";
    private static final String SPACE_REGEX = "\\s+";

    public static void main(String[] args) {
        String payload =
                "[00:11:17.489] kyc_data_hero_snapfire destroys mars\n" +
                "[00:11:20.322] kyc_data_hero_rubick destroys venus\n";

        String[] events = payload.split(NEW_LINE_PATTERN);

        for (String event : events) {
            String[] tokens = event.split(SPACE_REGEX);
            String heroName = tokens[1];
            if (heroName.startsWith(KYC_DATA_HERO)) {
                System.out.println(heroName.substring(KYC_DATA_HERO.length(), heroName.length()));
            }
        }

        System.out.println("Using Java 8 Streams");
        Arrays.stream(events)
                .map(event -> event.split(SPACE_REGEX))
                .map(tokens -> tokens[1])
                .filter(heroName -> heroName.startsWith(KYC_DATA_HERO))
                .map(heroName -> heroName.substring(KYC_DATA_HERO.length(), heroName.length()))
                .forEach(System.out::println);
    }
}
