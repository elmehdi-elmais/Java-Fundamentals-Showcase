package com.jcore.generics.utils;

/**
 * Classe utilitaire démontrant l'utilisation des Méthodes Génériques
 * pour manipuler des tableaux de n'importe quel type de manière sûre et réutilisable.
 */
public class Main {

    /**
     * Méthode générique pour afficher le contenu de n'importe quel type de tableau.
     * Cette méthode utilise le type générique <T> pour garantir la réutilisation.
     *
     * @param tableau Le tableau d'éléments de type T à afficher.
     * @param <T> Le type générique du tableau (ex: Integer, String, Double).
     */
    public static <T> void afficherTableau(T[] tableau) {
        System.out.print("[");

        // Itération sur le tableau : T est déterminé par le compilateur (Inférence de Type)
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i]);
            if (i < tableau.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("--- Démonstration de la Méthode Générique sur Tableaux ---");

        // 1. Appel avec un tableau d'Integer (T devient Integer[])
        Integer[] nombres = {1, 2, 3};
        System.out.print("Tableau d'Integer : ");
        afficherTableau(nombres);

        // 2. Appel avec un tableau de String (T devient String[])
        String[] mots = {"a", "b", "c"};
        System.out.print("Tableau de String : ");
        afficherTableau(mots);

        // 3. Appel avec un tableau de Double (T devient Double[])
        Double[] decimaux = {1.1, 2.2, 3.3};
        System.out.print("Tableau de Double : ");
        afficherTableau(decimaux);
    }
}