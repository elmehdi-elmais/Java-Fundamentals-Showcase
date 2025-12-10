package com.jcore.generics.advanced.factory;

import java.util.function.Supplier;

public class GenericFactory{
    public static <T> Factory<T> createFactory(Supplier<T> supplier) {
        return supplier::get;
    }
}
