/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.main;

import com.jfoenix.controls.JFXListView;
import javafx.application.Application;
import javafx.stage.Stage;
import lib.app.App;
import lib.app.References;
import vulembere.vulembereGUI;

/**
 *
 * @author PC
 */
public class Main extends Application{
//    public static Acces acces = null;
    public static vulembereGUI stage = null;
    public static Stage primaryStage_;
    public static JFXListView loadPreview;
  



    @Override
    public void start(Stage primaryStage) {
        stage = new vulembereGUI();
        connect();
        primaryStage_ = primaryStage;
         stage.getStage().getIcons().add(new javafx.scene.image.Image(References.APP_ICON));
        stage.setTitle(References.APP_TITLE);
        stage.setResizable(true);
        stage.setMaximized(true);
        stage.getScene().getStylesheets().add("/lib/css/material-color.css");
        stage.show();

    }

    void connect() {
//        if (Connexion.cnx() != null) {
//            stage.setContent(View.instance().get(View.LOGIN));
//        } else {
            stage.setContent(App.instance().get(App.LOGIN));
//        }

    }

    public static void getMax() {
        Main.stage.setMaximized(true);
        Main.stage.setResizable(true);
    }

    public static void getSize() {
        Main.stage.setMaximized(false);
        Main.stage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
