package com.jcore.generics.basic.pecs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSuper {

    // Utilisation de <? super Chat>
    // La liste CONSOMME des Chats. On peut seulement écrire des Chats.
    public static void ajouterChats(List<? super Chat> liste) {
        System.out.println("\n--- Écriture (SUPER) ---");

        // OK ! On est certain que la liste peut contenir un Chat.
        // (Elle est soit List<Chat>, List<Mammifere>, List<Animal>, ou List<Object>)
        liste.add(new Chat());
        liste.add(new Chat());
        System.out.println("Ajout de 2 Chats effectué.");

        // Tenter de lire un Mammifère => ERREUR DE COMPILATION
        //Mammifere m = liste.get(0); // Pourquoi ? La liste pourrait être List<Object>,
        System.out.println("==================================================");
        System.out.println(liste);
        // et l'élément pourrait ne pas être un Mammifère.
    }

    public static void main(String[] args) {
        List<Animal> listeAnimaux = new ArrayList<>();
        List<Mammifere> listeMammiferes = new ArrayList<>();

        // 1. C'est le cas où 'super' est OBLIGATOIRE :
        // Sans 'super', la méthode n'accepterait que List<Chat>
        // alors qu'elle doit accepter List<Animal> (car Animal est un supertype de Chat).
        ajouterChats(listeAnimaux);
        System.out.println("Taille de la liste d'Animaux : " + listeAnimaux.size());

        // 2. Accepte aussi les supertypes
        ajouterChats(listeMammiferes);
        System.out.println("Taille de la liste de Mammifères : " + listeMammiferes.size());
    }
}