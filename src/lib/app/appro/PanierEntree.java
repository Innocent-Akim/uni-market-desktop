/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.app.appro;

import java.util.ArrayList;
import lib.model.panierAppro.PanierAppro;

/**
 *
 * @author PC
 */
public class PanierEntree {

    private static PanierEntree _instance;

    public static PanierEntree getInstancePanier() {
        if (_instance == null) {
            _instance = new PanierEntree();
        }
        return _instance;
    }
    public ArrayList<PanierAppro> panier;

    public PanierEntree() {
        this.panier = new ArrayList<>();

    }

    public void ajouterPanier(PanierAppro prod) {
        if(this.panier.contains(prod)){
        
        }
        this.panier.add(prod);
        panier();
    }

    public void panier() {
        this.panier.forEach((data) -> {
            System.out.println(data.getDesignation());
        });
    }

}
