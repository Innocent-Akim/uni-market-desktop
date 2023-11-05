/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.entree.approvisionnement;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
