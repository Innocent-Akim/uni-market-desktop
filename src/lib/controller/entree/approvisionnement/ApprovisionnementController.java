/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.entree.approvisionnement;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lib.app.appro.PanierEntree;
import lib.model.panierAppro.PanierAppro;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ApprovisionnementController implements Initializable {

    @FXML
    private TextField nomTextField;
    @FXML
    private TextField designation;
    @FXML
    private TextField quantite;
    @FXML
    private TextField prixAchat;
    @FXML
    private TextField dateReception;
    @FXML
    private TextField peremption;
    @FXML
    private JFXButton b_panier;
    @FXML
    private Button b_valider_panier;
    @FXML
    private JFXListView<?> lisPanier;
    public static JFXListView<?> public_lisPanier;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        isAction(); 
        public_lisPanier = lisPanier; 
    }

    void isAction() {
        b_panier.setOnAction((e) -> {
            PanierAppro panier = new PanierAppro(nomTextField.getText(), designation.getText(), quantite.getText(), prixAchat.getText(), dateReception.getText(), peremption.getText());
            PanierEntree.getInstancePanier().ajouterPanier(panier);
        });
        b_valider_panier.setOnAction((e) -> {
            System.out.println(PanierEntree.getInstancePanier().panier);
        });
    }

}
