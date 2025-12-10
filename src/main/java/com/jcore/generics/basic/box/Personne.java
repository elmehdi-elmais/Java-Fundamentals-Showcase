package com.jcore.generics.basic.box;

/**
 * Classe standard représentant un objet simple pour la démonstration.
 */
class Personne {
    private String nom;
    private int age;

    /**
     * Constructeur.
     */
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    /**
     * Surcharge de toString() pour un affichage lisible dans la console.
     */
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}