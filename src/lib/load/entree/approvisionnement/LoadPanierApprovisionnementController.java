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

/**
 * FXML Controller class
 *
 * @author PC
 */
public class LoadPanierApprovisionnementController implements Initializable {

    @FXML
    private MaterialDesignIconView annuler;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
