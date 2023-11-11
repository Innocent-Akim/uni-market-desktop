/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.app.appro;

import com.jfoenix.controls.JFXListView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import lib.app.References;
import static lib.controller.entree.approvisionnement.ApprovisionnementController.public_lisPanier;
import lib.load.entree.approvisionnement.LoadPanierApprovisionnementController;
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
        this.panier.add(prod);
        panier();
    }

    public void remove(JFXListView... node) {
        for (JFXListView items : node) {
            items.getItems().clear();
        }
    }

    public void panier() {
        remove(public_lisPanier);
        this.panier.forEach((data) -> {
            try {
                LoadPanierApprovisionnementController.public_designation = data.getDesignation();
                LoadPanierApprovisionnementController.public_quantite = data.getQuantite();
                LoadPanierApprovisionnementController.public_prix_unitaire = data.getPunitaire();
                LoadPanierApprovisionnementController.public_fournisseur = data.getFournisseur();
                LoadPanierApprovisionnementController.public_dateReception = data.getDateReception();
                LoadPanierApprovisionnementController.public_datePeremption = data.getDatePeremption();
                public_lisPanier.getItems().add(FXMLLoader.load(getClass().getResource(References.LOAD_PANIER)));
            } catch (IOException ex) {
                Logger.getLogger(PanierEntree.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public void deleteElementPanier(int index) {
        this.panier.remove(index);
        panier();
    }

}
