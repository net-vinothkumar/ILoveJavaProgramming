package com.interviewdot.ILoveJavaProgramming;

import java.util.Objects;

public class RequiresNonNull {
    public static void main(String[] args) {
        String userName = null;
        userName = Objects.requireNonNull(userName, "user name cannot be null.");
        userName = Objects.requireNonNull(userName);
        userName = Objects.requireNonNull(userName, RequiresNonNull::errorMessage);

        System.out.println(userName);
    }

    private static String errorMessage() {
        return "user name cannot be null";
    }
}
