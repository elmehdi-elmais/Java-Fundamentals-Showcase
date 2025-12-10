package com.jcore.lambda.intermediare.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // =========================================================
        // 2. Function<String, Integer> (Transformer en longueur)
        // =========================================================

        // Function : Implémente 'Integer apply(String t)'.
        // Prend une chaîne (T) et retourne sa longueur (R).
        List<String> villes = Arrays.asList("Paris", "Londres", "Berlin", "Rome", "Tokyo", "Madrid");
        Function<String, Integer> obtenirLongueur = s -> s.length();

        System.out.println("\n--- 2. Function (Transformer en longueur) ---");
        // Utilisation : Transforme chaque ville en la longueur de son nom.
        villes.stream()
                .map(obtenirLongueur)
                .forEach(n -> System.out.print(n + " "));
        System.out.println(); // Affiche : 5 7 6 4 5 6 (longueurs des noms)
    }
}
