/*
 * Exercice "Le juste prix" : 
 * calcul du prix d'un panier contenant divers articles
 */
package lejusteprix;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrien Savoretti
 */
public abstract class Conteneur {
    
    private List<Contenu> listeArticles = new ArrayList();
    private double prix;
    
    /**
     * Permet d'ajouter un article dans le conteneur
     * @param contenu 
     */
    public void add(Contenu contenu){
        listeArticles.add(contenu);
        
        // TODO : empêcher l'ajout du même objet plusieurs fois
        
        // TODO : empêcher l'ajout d'un article dans une boîte déjà utilisée
    }
    
    public double getPrice() {
        
        // On parcourt la liste d'articles dans le panier
        for(int i = 0; i<listeArticles.size(); i++) {
            
            // Pour chaque article, on appelle sa méthode price
            prix += listeArticles.get(i).price();            
        }
        
        return prix;
    }
    
}
