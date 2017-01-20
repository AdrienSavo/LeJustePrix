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
        
        // Stream faisant la somme des prix
        double sum = listeArticles.stream().filter(o -> o.price() > 0).mapToDouble(o->o.price()).sum();
        return sum;
    }

}
