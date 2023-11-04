/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.identificate.principale;

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
public class PrincipaleController implements Initializable {

    @FXML
    private Label b_nouveau_agent;
    @FXML
    private Label b_nouveau_forusseur;
    @FXML
    private Label b_nouveau_client;
    @FXML
    private StackPane scree_identif;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        App.instance().setContaint(scree_identif, App.IDENTIFICATE_AGENT);
        Utils.getInstance().isMenu(b_nouveau_agent, b_nouveau_client, b_nouveau_forusseur);
        isAction();
    }

    void isAction() {
        b_nouveau_agent.setOnMouseClicked((e) -> {
            App.instance().setContaint(scree_identif, App.IDENTIFICATE_AGENT);
            Utils.getInstance().isMenu(b_nouveau_agent, b_nouveau_client, b_nouveau_forusseur);

        });
        b_nouveau_client.setOnMouseClicked((e) -> {
            App.instance().setContaint(scree_identif, App.IDENTIFICATE_CLIENT);
            Utils.getInstance().isMenu(b_nouveau_client, b_nouveau_agent, b_nouveau_forusseur);

        });

        b_nouveau_forusseur.setOnMouseClicked((e) -> {
            App.instance().setContaint(scree_identif, App.IDENTIFICATE_FOURNISSEUR);
            Utils.getInstance().isMenu(b_nouveau_forusseur, b_nouveau_client, b_nouveau_agent);

        });

    }

}
