package com.interviewdot.ILoveJavaProgramming.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSorting {
    public static void main(String[] args) {
        sortUsers();
    }
    private static void sortUsers() {
        List<User> users = Arrays.asList(
                new User("Martin", 32),
                new User("Tom", 30),
                new User("Alex", 22),
                new User("Todd", 35),
                new User("George", 28)
        );

        users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
