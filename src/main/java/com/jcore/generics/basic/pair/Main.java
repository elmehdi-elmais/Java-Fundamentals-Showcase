package com.jcore.generics.basic.pair;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Démonstration de la Classe Générique Pair ---");

        // Création d'une paire avec Integer et String
        Pair<Integer, String> pair1 = new Pair<>(1, "Un");
        System.out.println("Pair 1 - First: " + pair1.getFirst() + ", Second: " + pair1.getSecond());

        // Création d'une paire avec String et Double
        Pair<String, Double> pair2 = new Pair<>("Pi", 3.14);
        System.out.println("Pair 2 - First: " + pair2.getFirst() + ", Second: " + pair2.getSecond());

        // Modification des valeurs de la paire
        pair1.setFirst(2);
        pair1.setSecond("Deux");
        System.out.println("Après modification, Pair 1 - First: " + pair1.getFirst() + ", Second: " + pair1.getSecond());
    }
}
