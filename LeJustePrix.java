/*
 * Exercice "Le juste prix" : 
 * calcul du prix d'un panier contenant divers articles
 */
package lejusteprix;

/**
 *
 * @author Adrien Savoretti
 */
public class LeJustePrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Panier monPanier = new Panier();
        Panier monAutrePanier = new Panier();
        
        Fruit pomme = new Fruit("pomme", 1);
        Fruit banane = new Fruit("banane", 2.5);
        Fruit melon = new Fruit("melon", 4.5);
        Fruit raisins = new Fruit("raisins", 3.2);
        Fruit mandarine = new Fruit("mandarine", 0.8);
        Boite boite1 = new Boite(1);
        Boite boite2 = new Boite(2); 
        Boite boite3 = new Boite(3); 
        
        monPanier.add(pomme);       // +1
        monPanier.add(banane);      // +2.5
        monPanier.add(boite1);      // +5
        boite1.add(boite2);         // +5
        boite1.add(melon);          // +4.5
        boite2.add(raisins);        // +3.2
        //boite3.add(raisins);
        boite2.add(boite3);         // +5
        boite2.add(melon);

        
        
        System.out.println(monPanier.getPrice());
        System.out.println(monAutrePanier.getPrice());
    }
}
