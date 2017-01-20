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
    public boolean isEmpty = false;

    /**
     * Permet d'ajouter un article dans le conteneur
     * @param contenu
     */
    public void add(Contenu contenu) {

        // Si l'article est dans un container
        if (contenu.isInContainer()) {
            
            System.out.println("Cet article est déjà dans un autre conteneur.");
        } else {
            listeArticles.add(contenu);

            // Flag appartient au container
            contenu.setInContainer();
        }

        //System.out.println(listeArticles);
        // empêcher l'ajout d'un article dans une boîte déjà utilisée
        /*
        // Si l'article est une boîte
            if (Conteneur.class.isInstance(contenu)) {
                if(contenu.isEmpty()) {
                    
                }
                
                System.out.println("C'est une boîte : " + contenu);
                System.out.println("Dans cette boîte : " + listeArticles);
            }
        */
    }

    public double getPrice() {

        //double prix;
        // On parcourt la liste d'articles dans le panier
        for (int i = 0; i < listeArticles.size(); i++) {

            // Pour chaque article, on appelle sa méthode price
            prix += listeArticles.get(i).price();

            System.out.println("Voici : " + listeArticles.get(i) + " au prix de " + prix);

        }

        System.out.println("Test : " + listeArticles);

        return prix;
    }

}
