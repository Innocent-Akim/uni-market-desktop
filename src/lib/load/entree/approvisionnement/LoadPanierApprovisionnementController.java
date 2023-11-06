/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.load.entree.approvisionnement;

import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import lib.app.appro.PanierEntree;
import lib.controller.entree.approvisionnement.ApprovisionnementController;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class LoadPanierApprovisionnementController implements Initializable {

    @FXML
    private MaterialDesignIconView annuler;
    public static MaterialDesignIconView public_annuler;

    @FXML
    private Label designation;
    @FXML
    private Label quantite;
    @FXML
    private Label prixUnitaire;
    @FXML
    private Label fournisseur;
    @FXML
    private Label dateReception;
    @FXML
    private Label datePeremption;
    public static String public_designation;
    public static String public_quantite;
    public static String public_prix_unitaire;
    public static String public_fournisseur;
    public static String public_dateReception;
    public static String public_datePeremption;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        designation.setText(public_designation);
        quantite.setText(public_quantite);
        prixUnitaire.setText(public_prix_unitaire);
        fournisseur.setText(public_fournisseur);
        datePeremption.setText(public_datePeremption);
        dateReception.setText(public_dateReception);
        public_annuler = annuler;
        isAction();
    }

    void isAction() {
        annuler.setOnMouseClicked((e) -> {
            int index = ApprovisionnementController.public_lisPanier.getSelectionModel().getSelectedIndex();
            PanierEntree.getInstancePanier().deleteElementPanier(index);
        });
    }
}
