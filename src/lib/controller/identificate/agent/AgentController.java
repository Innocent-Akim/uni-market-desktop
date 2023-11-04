/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.identificate.agent;

import com.jfoenix.controls.JFXListView;
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
public class AgentController implements Initializable {

    @FXML
    private JFXListView<?> listeAgent;
    @FXML
    private Button b_nouveau_agent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        b_nouveau_agent.setStyle("-fx-background-color: teal; -fx-text-fill: #fff; -fx-cursor: HAND;");
        b_nouveau_agent.setFont(References.fontApp);
        isAction();
    }

    void isAction() {
        b_nouveau_agent.setOnAction((e) -> {
            App.instance().setDialog(App.ADD_AGENT);
        });
    }

}
