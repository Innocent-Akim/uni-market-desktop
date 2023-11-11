/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.login;

import com.gn.GNAvatarView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import lib.main.Main;
import lib.app.App;
import lib.app.References;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class LoginController implements Initializable {

    @FXML
    private StackPane fenetreLogin;
    @FXML
    private GNAvatarView avatar;
    @FXML
    private HBox box_username;
    @FXML
    private TextField usernameTfd;
    @FXML
    private HBox box_password;
    @FXML
    private PasswordField passwordTfd;
    @FXML
    private Button btnConnecter;
    @FXML
    private ImageView loadIcon;
    @FXML
    private Text message;
    @FXML
    private Label rester_essaie;
    @FXML
    private Label lbl_error;
    @FXML
    private Label lbl_username;
    @FXML
    private Label lbl_password;
    @FXML
    private Hyperlink btn_configuration;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        isAction();
        References.styleButton(btnConnecter);
        usernameTfd.setFont(References.fontApp);
        passwordTfd.setFont(References.fontApp);

    }

    @FXML
    private void switchCreate(MouseEvent event) {
    }

    void isAction() {
        btnConnecter.setOnAction((e) -> {
            Main.stage.setContent(App.instance().get(App.HOME));
        });
    }
}
