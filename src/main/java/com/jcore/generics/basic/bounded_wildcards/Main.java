package com.jcore.generics.basic.bounded_wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * Classe principale démontrant l'utilisation des Wildcards Bornés Supérieurs (? extends T).
 * Ce concept permet de créer des méthodes flexibles qui acceptent des collections
 * de types spécifiques et de leurs sous-classes (héritiers).
 */
public class Main {

    public static void main(String[] args) {

        // --- Cas de Succès (Acceptés) ---
        // Integer hérite de Number
        List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5);
        // Double hérite de Number
        List<Double> listB = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);

        // --- Cas d'Échec (Refusé par le Compilateur) ---
        // String N'hérite PAS de Number
        List<String> listC = Arrays.asList("a", "b", "c", "d", "e");

        System.out.println("--- Démonstration des Wildcards Bornés Supérieurs (? extends Number) ---");

        System.out.print("Liste d'Integer : ");
        moyeneListe(listA); // OK : Integer est un sous-type de Number

        System.out.print("Liste de Double : ");
        moyeneListe(listB); // OK : Double est un sous-type de Number

        // moyeneListe(listC); // Si décommenté, provoque une ERREUR DE COMPILATION.
        // Raison : String ne satisfait pas la contrainte 'extends Number'.
    }

    /**
     * Calcule et affiche la moyenne arithmétique des éléments d'une liste.
     *
     * Le Wildcard Borné Supérieur (? extends Number) signifie :
     * 1. La méthode accepte une liste de tout type T, T étant soit Number, soit un héritier de Number (Integer, Double, etc.).
     * 2. Sécurité en LECTURE : Nous sommes assurés que chaque élément peut être traité comme un Number (ou une sous-classe),
     * permettant l'appel de méthodes de Number comme doubleValue().
     *
     * @param listA Une liste dont les éléments sont Number ou une sous-classe de Number.
     */
    private static void moyeneListe(List<? extends Number> listA) {
        double sum = 0.0;
        // L'itération est sûre : chaque 'num' est au moins un Number.
        for (Number num : listA) {
            // doubleValue() est une méthode garantie par la classe Number.
            sum += num.doubleValue();
        }
        double average = sum / listA.size();
        System.out.println("Moyenne : " + average);
    }
}