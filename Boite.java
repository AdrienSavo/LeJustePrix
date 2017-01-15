/*
 * Exercice "Le juste prix" : 
 * calcul du prix d'un panier contenant divers articles
 */
package lejusteprix;

/**
 *
 * @author Adrien Savoretti
 */
public class Boite extends Conteneur implements Contenu {
    
    @Override
    public double price() {
        
        // Prix de base de la boîte
        double prix = 5;
        
        // Récupère le prix total du contenu de la boîte
        prix += super.getPrice();
        
        return prix;
    }
    
    @Override
    public String toString() {
        return "boîte";
    }
    
}
