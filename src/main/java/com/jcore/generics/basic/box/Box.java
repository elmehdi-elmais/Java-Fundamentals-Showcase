package com.jcore.generics.basic.box;

/**
 * Classe Générique Box<T>
 * Représente un conteneur qui peut stocker un objet de n'importe quel type.
 * L'utilisation du paramètre de type <T> garantit la sécurité et la réutilisation du code.
 *
 * @param <T> Le type générique de l'élément que la boîte va contenir (ex: String, Integer, Personne).
 */
class Box<T> {

    // Le champ 'item' sera du type T spécifié lors de l'instanciation (ex: String, Integer, etc.)
    private T item;
    /**
     * Définit l'élément de la boîte.
     * Le compilateur assure que l'argument passé est du même type que T.
     * * @param item L'objet à stocker dans la boîte.
     */
    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
