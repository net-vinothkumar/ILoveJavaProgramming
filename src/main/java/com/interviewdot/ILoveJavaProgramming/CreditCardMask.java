package com.interviewdot.ILoveJavaProgramming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreditCardMask {
    public static void main(String[] args) {
        String creditCard = "4556364607935616";

        maskifyUsingIntStream(creditCard);
        maskifyUsingStreamGenerate(creditCard);
    }

    private static void maskifyUsingIntStream(String creditCard) {
        String lastCharacters = creditCard.substring(creditCard.length() - 4);//5616

        StringBuilder sb = new StringBuilder();
        IntStream   // 0 1 2 3 4 5 6 7 8 9 10 11
                .rangeClosed(0, creditCard.length() - lastCharacters.length() - 1)
                .forEach(num -> sb.append('#'));//############
        sb.append(lastCharacters);

        System.out.println(sb.toString());
    }

    private static void maskifyUsingStreamGenerate(String creditCard) {
        final int firstNonMaskedIndex = Math.max(0, creditCard.length() - 4); //12

        String maskedCard = Stream.generate(() -> "#")
                .limit(firstNonMaskedIndex)//############
                .collect(
                        Collectors.joining()
                ).concat(                   // 12 - 16 => "5616"
                        creditCard.substring(firstNonMaskedIndex, creditCard.length())
                );

        System.out.println(maskedCard);
    }
}
