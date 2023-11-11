package lib.app;

import java.util.ArrayList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class References {

    public static String APP_TITLE = "UNI-MARKET";
    public static String APP_ICON = "/lib/assets/pharmacien.png";
    public static Font fontApp = Font.font("Lucida Sans Unicode", FontPosture.REGULAR, 14);
    public static String LOAD_PANIER = "/lib/load/entree/approvisionnement/loadPanierApprovisionnement.fxml";

    public static void setFontTextField(Node... node) {
        for (Node field : node) {
            if (field instanceof TextField) {
                TextField text = (TextField) field;
                text.setFont(fontApp);
            }
            if (field instanceof Label) {
                Label label = (Label) field;
                label.setFont(fontApp);
            }
        }
    }

    public static void styleButton(Button... btn) {
        btn[0].setStyle("-fx-background-color: teal; -fx-text-fill: #fff; -fx-cursor: HAND;");
        btn[0].setFont(References.fontApp);
    }

}
