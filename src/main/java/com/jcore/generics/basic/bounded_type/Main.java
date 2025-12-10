    package com.jcore.generics.basic.bounded_type;

    public class Main {

        /**
         * Méthode générique simple pour afficher n'importe quel type de valeur.
         * Le compilateur Java détermine automatiquement le type T (Inférence de Type).
         *
         * @param value La valeur à afficher, de type générique T.
         * @param <T> Le type générique T.
         */
        public static <T> void afficher(T value) {
            // Cette méthode fonctionne pour Integer, String, Double, et tout objet personnalisé.
            System.out.println(value);
        }

        /**
         * Méthode générique pour trouver le plus grand de deux éléments.
         *
         * IMPORTANT : Elle utilise une CONTRAINTE DE TYPE (<T extends Comparable<T>>).
         * Ceci assure que seuls les objets pouvant être comparés (qui implémentent l'interface Comparable)
         * peuvent être passés à cette fonction, garantissant ainsi la sécurité et la validité de l'opération 'compareTo'.
         *
         * @param a Le premier élément.
         * @param b Le deuxième élément.
         * @param <T> Le type générique T, limité par l'interface Comparable.
         * @return L'élément le plus grand (a ou b).
         */
        public static <T extends Comparable<T>> T obtenirPlusGrand(T a, T b) {
            return a.compareTo(b) > 0 ?a:b;
        }
        public static void main(String[] args) {
            System.out.println("--- 1. Démonstration de la méthode afficher (Réutilisabilité) ---");

            // La méthode afficher s'adapte automatiquement à chaque type de donnée.
            afficher(123);        // T devient Integer
            afficher("This Generics");    // T devient String
            afficher(10.33);      // T devient Double

            System.out.println("\n--- 2. Démonstration de obtenirPlusGrand (Contraintes de Type) ---");

            // Test avec des entiers
            Integer numberA = 123;
            Integer numberB = 125;
            Integer maxInt = obtenirPlusGrand(numberA, numberB);
            System.out.println("Le plus grand entre " + numberA + " et " + numberB + " est : " + maxInt);

            // Test avec des chaînes de caractères (comparaison alphabétique)
            String motA = "Pomme";
            String motB = "Banana"; // "Banana" est plus petit que "Pomme" car B < P
            String motGrand = obtenirPlusGrand(motA, motB);
            System.out.println("Le plus grand (alphabétique) entre \"" + motA + "\" et \"" + motB + "\" est : " + motGrand);

        }
    }
