package com.jcore.lambda.basic.custom;

@FunctionalInterface
public interface Calculateur {
    int operation(int a, int b);
    default void afficherAide() {
        System.out.println("Aide : Cette interface effectue un calcul simple entre deux nombres.");
    }
}
