/*
 * Exercice "Le juste prix" : 
 * calcul du prix d'un panier contenant divers articles
 */
package lejusteprix;

/**
 * Une boîte est un conteneur dans lequel on peut mettre un article
 * @author Adrien Savoretti
 */
public class Boite extends Conteneur implements Contenu {
    
    private boolean isInContainer = false;
    private int numeroBoite;
    private boolean isEmpty = true;
    
    /**
     * Permet de créer une boîte
     * @param numeroBoite 
     */
    public Boite(int numeroBoite) {
        this.numeroBoite = numeroBoite;
    }
    
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
        return "boîte " + numeroBoite;
    }
    
    @Override
    public boolean isInContainer() {
        return this.isInContainer;
    }

    @Override
    public void setInContainer() {
        this.isInContainer = true;
    }
    
}
