package com.interviewdot.ILoveJavaProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class UnModifiableCollection {
    public static void main(String[] args) {
        Set<String> programmingLanguages = new HashSet<>(Arrays.asList(
                "Java",
                "Scala",
                "Python",
                "Rust",
                "Kotlin",
                "C",
                "C++",
                "C#"
        ));

        Set<String> result = programmingLanguages.stream()
                .filter(language -> language.length() > 4)
                .collect(Collectors.toSet());

        Set<String> unmodifiableSet = Collections.unmodifiableSet(result);

        methodB(unmodifiableSet);
    }

    private static void methodB(Set<String> unmodifiableSet) {
        unmodifiableSet.add("Javascript");
    }
}
