package com.jcore.generics.advanced.factory;

@FunctionalInterface
public interface Factory<T> {
    /*
    * Crée et retourne une instance de T
    * */
    T create();
}
