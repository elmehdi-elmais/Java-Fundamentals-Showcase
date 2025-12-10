package com.jcore.lambda.basic.supplier;

// Importe l'interface fonctionnelle Supplier, située dans java.util.function.
// Supplier<T> est utilisé pour "fournir" une valeur de type T sans prendre d'arguments.
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        // --- 1. Utilisation de Supplier<Integer> ---

        // Déclare une variable de type Supplier qui est censée retourner un Integer.
        // L'expression Lambda '() -> 10 * 2' implémente la méthode get().
        // '()' indique qu'il n'y a pas de paramètres d'entrée.
        // La Lambda retourne le résultat du calcul (20).
        Supplier<Integer> intSupplier = () -> 10 * 2;

        // Appelle la méthode get() pour déclencher l'exécution de la Lambda
        // et récupérer la valeur qu'elle fournit.
        Integer value = intSupplier.get();

        // Affiche la valeur récupérée.
        System.out.println("Value from Supplier: " + value);


        // --- 2. Utilisation de Supplier<String> ---

        // Déclare une variable de type Supplier qui est censée retourner un String.
        // La Lambda '() -> "Hello World!"' fournit directement la chaîne de caractères.
        Supplier<String> stringSupplier = () -> "Hello World!";

        // Appelle la méthode get() pour obtenir la chaîne de caractères.
        String message = stringSupplier.get();

        // Affiche le message récupéré.
        System.out.println("Message from Supplier: " + message);


    }
}