package com.jcore.generics.advanced.factory;

public class Main {
    public static void main(String[] args) {

        // --- Cas 1 : Création de la Factory pour Voiture ---
        // On passe la référence au constructeur de Voiture (Voiture::new)

        Factory<Voiture> voitureFactory = GenericFactory.createFactory(Voiture::new);
        System.out.println("voitureFactory = " + voitureFactory);
        Voiture v1 = voitureFactory.create();
        Voiture v2 = voitureFactory.create();

        System.out.println("Factory Voiture (T=Voiture) :");
        System.out.println("- Objet 1: " + v1.getDescription());
        System.out.println("- Objet 2: " + v2.getDescription());
        System.out.println("---");


        // --- Cas 2 : Création de la Factory pour Velo ---
        // On passe la référence au constructeur de Velo (Velo::new)
        Factory<Velo> veloFactory = GenericFactory.createFactory(Velo::new);

        Velo b1 = veloFactory.create();

        System.out.println("Factory Vélo (T=Velo) :");
        System.out.println("- Objet 1: " + b1.getDescription());
        System.out.println("---");
    }
}
