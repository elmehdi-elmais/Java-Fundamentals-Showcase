package com.jcore.lambda.basic.runnable;

// Importation de l'interface Runnable (elle est dans java.lang, donc souvent implicite,
// mais elle est l'interface fonctionnelle utilisée ici).
import java.lang.Runnable;

public class Main {
    public static void main(String[] args) {

        // --- 1. Définition de la Tâche (Runnable) ---

        // Déclare une variable de type Runnable.
        // Runnable est une interface fonctionnelle avec une seule méthode abstraite : void run().

        // L'expression Lambda '() -> System.out.println("Hello World!")' implémente la méthode run().
        // '()' : Indique que la méthode run() n'accepte aucun argument.
        // '->' : Le séparateur qui lie les arguments au corps de la méthode.
        // Le corps de la Lambda est la seule instruction à exécuter.
        Runnable runnable = () -> System.out.println("Hello World!");


        // --- 2. Exécution Synchrone de la Tâche ---

        // Appelle la méthode run() de l'objet 'runnable'.
        // Important : Appeler run() directement exécute le code dans le thread principal (synchrone).
        // L'utilisation principale de Runnable est de passer cette tâche à un nouveau Thread
        // ou à un ExecutorService pour une exécution asynchrone (par exemple, new Thread(runnable).start()).
        runnable.run();
    }
}