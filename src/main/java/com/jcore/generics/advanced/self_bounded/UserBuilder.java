package com.jcore.generics.advanced.self_bounded;

abstract class Builder<T extends Builder<T>> {

    protected abstract T self();

    public T withId(int id) {
        System.out.println("id = " + id);
        return self();
    }
}

public class UserBuilder  extends Builder<UserBuilder> {

    @Override
    protected UserBuilder self() {
        return this;
    }

    public UserBuilder withName(String name) {
        System.out.println("name = " + name);
        return this;
    }
}