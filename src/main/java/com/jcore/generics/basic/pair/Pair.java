package com.jcore.generics.basic.pair;

public class Pair<U, T> {
    private U first;
    private T second;

    public Pair(U first, T second) {
        this.first = first;
        this.second = second;
    }
    public U getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public  void setFirst(U first) {
        this.first = first;
    }
    public   void setSecond(T second) {
        this.second = second;
    }
}
