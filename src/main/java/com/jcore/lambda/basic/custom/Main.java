package com.jcore.lambda.basic.custom;

public class Main {
    public static void main(String[] args) {
/*        Calculateur calc = (a, b) ->
        {
            return a + b;
        };

 */
        Calculateur addition = (a, b) -> a + b;
        int optAddition = addition.operation(1, 2);
        System.out.println("--- Test Addition ---");
        System.out.println(optAddition);

        Calculateur multiplication = (a, b) -> a * b;
        int optMultiplication = multiplication.operation(6, 4);
        System.out.println("--- Test Multiplication ---");
        System.out.println(optMultiplication);

        addition.afficherAide();
    }
}
