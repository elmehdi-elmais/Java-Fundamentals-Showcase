package com.jcore.lambda.intermediare.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // =========================================================
        // 3. Comparator<String> (Comparer des chaînes)
        // =========================================================
        List<String> villes = Arrays.asList("Paris", "Londres", "Berlin", "Rome", "Tokyo", "Madrid");

        // Comparator : Implémente 'int compare(String a, String b)'.
        // Compare les chaînes en ordre alphabétique inverse.
        Comparator<String> ordreInverse = (s1, s2) -> s2.compareTo(s1);

        System.out.println("\n--- 3. Comparator (Tri alphabétique inverse) ---");
        // Utilisation : Trie la liste des villes de Z à A.
        villes.stream()
                .sorted(ordreInverse)
                .forEach(s -> System.out.print(s + " "));
        System.out.println(); // Affiche : Tokyo Rome Paris Madrid Londres Berlin
    }
}
