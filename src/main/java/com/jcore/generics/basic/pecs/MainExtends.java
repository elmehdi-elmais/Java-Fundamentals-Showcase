package com.jcore.generics.basic.pecs;

import java.util.Arrays;
import java.util.List;

public class MainExtends {
    public static void main(String[] args) {
        List<Chat> chats = Arrays.asList(new Chat(), new Chat());
        List<Mammifere> mammiferes = Arrays.asList(new Mammifere(), new Mammifere());

        // 1. C'est le cas où 'extends' est OBLIGATOIRE :
        // Sans 'extends', la méthode n'accepterait que List<Mammifere>
        // alors qu'elle doit accepter List<Chat> (car Chat étend Mammifere).
        afficherListe(chats);

        // 2. Accepte aussi le type exact
        afficherListe(mammiferes);
    }
    // Utilisation de <? extends Mammifère>
    // La liste PRODUIT des Mammifères. On peut seulement lire.
    private static void afficherListe(List<? extends Mammifere> lists) {
        for (Animal chat : lists) {
            System.out.println(chat);
        }
        // Tenter d'ajouter un élément => ERREUR DE COMPILATION
        // lists.add(new Chat()); // Pourquoi ? La liste pourrait être une List<Chien>
        //                        // (si Chien hérite de Mammifère), et y ajouter un Chat
        //                        // serait dangereux. Le compilateur l'interdit.
    }
}
