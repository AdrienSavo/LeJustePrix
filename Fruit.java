/*
 * Exercice "Le juste prix" : 
 * calcul du prix d'un panier contenant divers articles
 */
package lejusteprix;

/**
 *
 * @author Adrien Savoretti
 */
public class Fruit implements Contenu {
    
    private double prix;
    private String nom;

    public Fruit(String nom, double prix) {
        this.prix = prix;
        this.nom = nom;
    }
    
    @Override
    public double price() {
        return this.prix;
    }
    
    @Override
    public String toString() {
        return this.nom;
    }
    
}
