/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.dialog.product;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import lib.app.App;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class AddProductController implements Initializable {

    @FXML
    private Text subNom;
    @FXML
    private Text designation;
    @FXML
    private MaterialDesignIconView icon2;
    @FXML
    private Text titre;
    @FXML
    private Button b_enregistrer;
    @FXML
    private Button b_new_categorie;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        isAction();
    }

    void isAction() {
        b_enregistrer.setOnAction((e) -> {

        });
        b_new_categorie.setOnAction((e) -> {
            showDialog();
        });
    }

    private void showDialog() {
        JFXDialogLayout layout = new JFXDialogLayout();
        TextField text_categorie = new TextField();
        text_categorie.setStyle("-fx-border-color: #C4BEBB;-fx-text-fill: #000000; "
                + "-fx-border-width: 0.5px; "
                + "-fx-background-color: Transparent; "
                + "-fx-border-radius: 5px; ");
        
        text_categorie.setFont(Font.font("Lucida Sans Unicode", FontPosture.REGULAR, 13));
        text_categorie.setPromptText("Entrer la catégorie");
        VBox box = new VBox();
        box.getChildren().add(text_categorie);
        layout.setBody(box);
        JFXDialog dlg = new JFXDialog(App.stackPane, layout, JFXDialog.DialogTransition.CENTER);
        Button btn_add = new Button("Enregistrer une nouvelle catégorie");
        btn_add.setStyle("-fx-background-color: teal; -fx-text-fill: #fff; -fx-cursor: HAND;");
        btn_add.setFont(Font.font("Lucida Sans Unicode", FontPosture.REGULAR, 13));
        btn_add.setOnAction((e) -> {

        });

        Button btn_close = new Button("Close");
        btn_close.setStyle("-fx-background-color: red; -fx-text-fill: #fff; -fx-cursor: HAND;");
        btn_close.setFont(Font.font("Lucida Sans Unicode", FontPosture.REGULAR, 13));
        btn_close.setOnAction((e) -> {
            dlg.close();
        });
        layout.setActions(btn_add, btn_close);
        dlg.show();
    }

}
//      tr.setStyle("-fx-background-color: #C4BEBB;-fx-text-fill: #000000;");
//                tr.setFont(Font.font("System", FontPosture.REGULAR, 13));
