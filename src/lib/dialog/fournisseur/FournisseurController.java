/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.dialog.fournisseur;

import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class FournisseurController implements Initializable {

    @FXML
    private Text subNom;
    @FXML
    private Text designation;
    @FXML
    private MaterialDesignIconView icon2;
    @FXML
    private Text titre;
    @FXML
    private TextField nomTextField;
    @FXML
    private TextField telephoneTextField;
    @FXML
    private TextField adresseTextField;
    @FXML
    private Button b_enregistrer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
