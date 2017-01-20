/*
 * Exercice "Le juste prix" : 
 * calcul du prix d'un panier contenant divers articles
 */
package lejusteprix;

import java.util.ArrayList;
import java.util.List;

/**
 * Un conteneur permet de contenir des articles
 * @author Adrien Savoretti
 */
public abstract class Conteneur {

    private List<Contenu> listeArticles = new ArrayList();
    public boolean isEmpty = true;

    /**
     * Permet d'ajouter un article dans le conteneur
     * @param contenu
     */
    public void add(Contenu contenu) {
        
        // Si l'article est déjà dans un conteneur
        if (contenu.isInContainer()) System.out.println("Cet article est déjà dans un autre conteneur.");
        
        // Si c'est une boîte qui n'est pas vide
        else if (Boite.class.isInstance(this) && !this.isEmpty) System.out.println(this + " contient déjà un article.");
        
        // Si c'est un article quelconque ou une boîte vide 
        else {
            // Si c'est une boîte
            if (Boite.class.isInstance(this)) {
                this.isEmpty = false;
                System.out.println(this + " est maintenant pleine !");
            }
            
            // Ajoute le contenu à la liste
            listeArticles.add(contenu);

            // Flag appartient au container
            contenu.setInContainer();
        }
    }
    
    /**
     * Récupère le prix total d'un conteneur
     * @return sum (double)
     */
    public double getPrice() {
        
        // Stream faisant la somme des prix
        double sum = listeArticles.stream().mapToDouble(o->o.price()).sum();
        return sum;
    }

}
