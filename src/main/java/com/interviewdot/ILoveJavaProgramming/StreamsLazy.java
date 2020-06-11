package com.interviewdot.ILoveJavaProgramming;

import java.time.LocalTime;
import java.util.stream.IntStream;

public class StreamsLazy {
    public static void main(String[] args) {

        IntStream stream = IntStream.range(1, 5);

        stream = stream
                .peek(i -> log("starting", i))
                .filter(i -> { log("filtering", i);
                    return i % 2 == 0;});
        log("Invoking terminal method count.");
//        log("The count is", stream.count());
    }

    private static void log(Object... objects) {
        String s = LocalTime.now().toString();
        for (Object object : objects) {
            s += " - " + object.toString();
        }
        System.out.println(s);
    }
}
