package com.interviewdot.ILoveJavaProgramming.billiondollarmistake.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //ofNullable
        SoundCard soundCard = new SoundCard();
        Optional<SoundCard> nullableSoundCard = Optional.ofNullable(null);
        printSoundCard(nullableSoundCard);
    }

    private static void printSoundCard(Optional<SoundCard> nullableSoundCard) {
        if (nullableSoundCard.isPresent()) {
            System.out.println(nullableSoundCard.get().getName());
        } else {
            System.out.println("No value present..please fill it..");
        }
    }
}
