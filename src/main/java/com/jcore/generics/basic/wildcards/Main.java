package com.jcore.generics.basic.wildcards;

import java.util.*;

/**
 * Classe principale pour la démonstration du Wildcard (Joker) non borné en Java.
 * Elle illustre comment le Wildcard permet la flexibilité dans les arguments de méthode.
 */
public class Main {

    /**
     * Méthode utilisant un Wildcard non borné (List<?>) pour afficher le contenu
     * de n'importe quel type de liste.
     * * Le '?' signifie "n'importe quel type". Cela permet à la méthode d'accepter
     * List<Integer>, List<String>, List<Personne>, etc., de manière universelle.
     * * Sécurité : À l'intérieur de cette méthode, les éléments sont traités comme des Object,
     * et l'ajout d'éléments (sauf null) est interdit par le compilateur.
     *
     * @param liste La liste générique à afficher. Le type exact est inconnu.
     */
    public static void afficherListe(List<?> liste){
        // Puisque le type dans la liste est inconnu (?), nous itérons sur des objets de type Object.
        for (Object element : liste) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        // Création d'une liste d'Integer (Méthode compatible Java 8+)
        List<Integer> liste = Arrays.asList(1, 2, 3, 4);

        System.out.println("--- Démonstration des Wildcards en Java ---");
        System.out.println("Affichage de la liste d'entiers :");

        // Le Wildcard List<?> accepte List<Integer>
        afficherListe(liste);

        // Création d'une liste de String
        List<String> liste2 = Arrays.asList("a", "b", "c", "d", "e", "f");
        System.out.println("Affichage de la liste de chaînes :");

        // Le Wildcard List<?> accepte List<String>
        afficherListe(liste2);
    }
}