package com.interviewdot.ILoveJavaProgramming.flatmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {
        Developer john = new Developer("John");
        john.add("clojure");
        john.add("scala");
        john.add("groovy");
        john.add("go");

        Developer david = new Developer("David");
        david.add("java");
        david.add("javascript");

        Developer andrew = new Developer("Andrew");
        andrew.add("java");
        andrew.add("python");

        List<Developer> developerTeam = new ArrayList<>();
        developerTeam.add(john);
        developerTeam.add(david);
        developerTeam.add(andrew);

        System.out.println("Programming languages in the team :");

        developerTeam.stream()
                .map(Developer::getLanguages)
                .flatMap(Collection::stream)//{},{},{}
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
