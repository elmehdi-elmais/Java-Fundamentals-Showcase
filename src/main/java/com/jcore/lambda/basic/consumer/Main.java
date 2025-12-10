package com.jcore.lambda.basic.consumer;

// Importe l'interface fonctionnelle Consumer, qui prend un seul argument
// et ne retourne rien (void).
import java.util.function.Consumer;

// Importe l'interface fonctionnelle BiConsumer, qui prend deux arguments
// et ne retourne rien (void).
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        // --- 1. Utilisation de Consumer<T> ---

        // Déclare une variable de type Consumer qui accepte un String.
        // L'expression Lambda 's -> System.out.println(s)' implémente la méthode accept(String s).
        // 's' est le paramètre d'entrée, et le corps de la Lambda l'affiche.
        Consumer<String> stringConsumer = s -> System.out.println(s);

        // Appelle la méthode accept() du Consumer, exécutant ainsi le code Lambda défini
        // (qui est d'imprimer la chaîne "Hello, World!").
        stringConsumer.accept("Hello, World!");


        // --- 2. Utilisation de BiConsumer<T, U> ---

        // Déclare une variable de type BiConsumer qui accepte deux Integer (i et j).
        // La Lambda '(i, j) -> { ... }' implémente la méthode accept(Integer i, Integer j).
        BiConsumer<Integer, Integer> integerBiConsumer = (i, j) -> {
            // Le corps de la Lambda est entre accolades {} car il contient plusieurs instructions.
            // Il calcule la somme des deux arguments.
            int sum = i + j;
            // Puis il affiche le résultat.
            System.out.println("Sum: " + sum);
        };

        // Exécute le BiConsumer avec 5 et 10. La Lambda calcule 5 + 10 et affiche "Sum: 15".
        integerBiConsumer.accept(5, 10);

        // Exécute le BiConsumer une deuxième fois avec 77 et 23.
        // La Lambda calcule 77 + 23 et affiche "Sum: 100".
        integerBiConsumer.accept(77, 23);

    }
}