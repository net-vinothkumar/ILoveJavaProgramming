package com.interviewdot.ILoveJavaProgramming.billiondollarmistake.optional;

import com.interviewdot.ILoveJavaProgramming.billiondollarmistake.USB;

import java.util.Optional;

public class SoundCard {
    public Optional<USB> getUSB() {
        return Optional.of(new USB());
    }

    public String getName(){
        return "Demo Sound Card";
    }
}
