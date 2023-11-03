/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.sortie;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import lib.utils.Utils;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class SortieController implements Initializable {

    @FXML
    private StackPane screen_ventes;
    @FXML
    private Label b_liste_sortie;
    @FXML
    private Label b_ventes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        isAction();
        Utils.getInstance().isMenu(b_liste_sortie, b_ventes);
    }

    void isAction() {
        b_ventes.setOnMouseClicked((e) -> {
            Utils.getInstance().isMenu(b_ventes, b_liste_sortie);
        });
        b_liste_sortie.setOnMouseClicked((e) -> {
            Utils.getInstance().isMenu(b_liste_sortie, b_ventes);
        });
    }

}
