/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.identificate.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import lib.app.App;
import lib.app.References;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class ClientController implements Initializable {

    @FXML
    private Button b_nouveau_client;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        References.styleButton(b_nouveau_client);
        isAction();
    }

    void isAction() {
        b_nouveau_client.setOnAction((e) -> {
            App.instance().setDialog(App.ADD_CLIENT);
        });
    }

}
