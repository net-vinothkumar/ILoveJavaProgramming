package com.interviewdot.ILoveJavaProgramming.immutable;

public final class Flight {
    final int id;
    final String name;

    public Flight(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
