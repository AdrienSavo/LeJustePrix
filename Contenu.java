/*
 * Exercice "Le juste prix" : 
 * calcul du prix d'un panier contenant divers articles
 */
package lejusteprix;

/**
 * Un contenu est un article qui peut être mis dans un conteneur
 * @author Adrien Savoretti
 */
public interface Contenu extends Article {
    
    /**
     * Vérifie qu'un article n'est pas déjà dans un conteneur
     * @return boolean
     */
    public boolean isInContainer();

    /**
     * Définit qu'un article est dans un conteneur
     */
    public void setInContainer();
}
