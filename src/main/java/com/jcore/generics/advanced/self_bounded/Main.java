package com.jcore.generics.advanced.self_bounded;

public class Main {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        userBuilder
                .withId(1)
                .withName("John Doe");

    }
}
