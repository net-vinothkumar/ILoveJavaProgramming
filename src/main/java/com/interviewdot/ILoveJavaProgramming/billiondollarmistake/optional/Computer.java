package com.interviewdot.ILoveJavaProgramming.billiondollarmistake.optional;

import com.interviewdot.ILoveJavaProgramming.billiondollarmistake.SoundCard;

import java.util.Optional;

public class Computer {
    public Optional<SoundCard> getSoundcard() {
        return Optional.of(new SoundCard());
    }
}
