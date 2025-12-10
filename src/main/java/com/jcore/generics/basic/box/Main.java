package com.jcore.generics.basic.box;


/**
 * Classe principale pour la démonstration des instances de Box génériques.
 */
public class Main {

    public static void main( String[] args ) {

        // 1. Démonstration avec String : T devient String
        Box<String> box1 = new Box<>();
        box1.setItem("This is Generics!");
        System.out.println("Box1 contains: " + box1.getItem());

        // 2. Démonstration avec Integer : T devient Integer
        Box<Integer> box2 = new Box<>();
        box2.setItem(123);
        // Si nous tentions d'insérer une String ici, le compilateur générerait une erreur.
        System.out.println("Box2 contains: " + box2.getItem());

        // 3. Démonstration avec une classe personnalisée : T devient Personne
        Box<Personne> box3 = new Box<>();
        Personne personne = new Personne("Alice", 30);
        box3.setItem(personne);
        System.out.println("Box3 contains: " + box3.getItem());
    }
}