package com.interviewdot.ILoveJavaProgramming;

import java.util.List;
import java.util.stream.*;

public class BoxedDemo {
    public static void main(String[] args) {
        List<String> words = Stream.of("I", "Love", "Java", "Programming")
                .collect(Collectors.toList());
        words.forEach(System.out::println);

        List<Integer> numbers = IntStream.of(1, 2, 3, 4, 5)
                .boxed() // int primitive => Integer Objects
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);

        longStream();
        doubleStream();
    }

    private static void longStream() {
        List<Long> longNumbers = LongStream.of(1l, 2l, 3l, 4l, 5l)
                .boxed()
                .collect(Collectors.toList());
        longNumbers.forEach(System.out::println);
    }

    private static void doubleStream() {
        List<Double> doubleNumbers = DoubleStream.of(1d, 2d, 3d, 4d, 5d)
                .boxed()
                .collect(Collectors.toList());
        doubleNumbers.forEach(System.out::println);
    }
}
