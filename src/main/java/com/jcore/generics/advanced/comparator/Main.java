package com.jcore.generics.advanced.comparator;

import java.util.Comparator;

public class Main {
    public static <T> T plusGrand (T a, T b, Comparator<T> comparator) {
        return comparator.compare(a, b) > 0 ? b : a;
    }
    public static void main(String[] args) {
        System.out.println(plusGrand(14, 7, Integer::compareTo));
        System.out.println(plusGrand("apple","banana", String::compareTo));
    }
}
