package com.jcore.lambda.intermediare.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Données d'exemple : Une liste de noms de villes
        List<String> villes = Arrays.asList("Casa", "Settat", "Rabat", "Berrechid");
        // =========================================================
        // 1. Predicate<String> (Tester une condition de longueur)
        // =========================================================
        // Predicate : Implémente 'boolean test(String s)'.
        // Teste si la longueur de la chaîne est supérieure à 5 caractères.
        Predicate<String> predicate = s -> s.length() > 5;
        // Utilisation : Affiche les villes dont le nom est long.
        villes.stream()
                .filter(predicate)
               // .forEach( s -> System.out.println(s))
                .forEach( System.out::println)

        ;
        System.out.println();
            //        System.out.println(villes);
    }
}
