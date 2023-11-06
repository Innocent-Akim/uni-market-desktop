/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.entree;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import lib.app.App;
import lib.utils.Utils;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class EntreeController implements Initializable {

    @FXML
    private Label b_liste_entree;
    @FXML
    private Label b_approvisionnement;
    @FXML
    private StackPane screen_entree;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        isAction();
        Utils.getInstance().isMenu(b_liste_entree, b_approvisionnement);
        App.instance().setContaint(screen_entree, App.LISTE_ENTREE);

    }

    void isAction() {
        b_liste_entree.setOnMouseClicked((e) -> {
            Utils.getInstance().isMenu(b_liste_entree, b_approvisionnement);
            App.instance().setContaint(screen_entree, App.LISTE_ENTREE);

        });
        b_approvisionnement.setOnMouseClicked((e) -> {
            Utils.getInstance().isMenu(b_approvisionnement, b_liste_entree);
            App.instance().setContaint(screen_entree, App.APPROVISIONNEMENT);

        });
    }

}
