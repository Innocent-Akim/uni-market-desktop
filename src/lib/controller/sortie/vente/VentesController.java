/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.sortie.vente;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class VentesController implements Initializable {

    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button bmultipl;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button bmoins;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button bdivise;
    @FXML
    private Button b0;
    @FXML
    private Button bdelete;
    @FXML
    private Button bplus;
    @FXML
    private Button begal;
    @FXML
    private Label resultat;
    String valeur = "0.0";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        isAction();

        resultat.setText(" " + valeur);

    }

    void isAction() {

        b1.setOnAction((e) -> {
            if (maxResultat()) {
                if (valeur.equals("0.0") || valeur.equals("")) {
                    valeur = "1";
                } else {
                    valeur += "1";
                }
            }
            resultat.setText(" " + valeur);

        });

        b2.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "2";
            } else {
                valeur += "2";
            }

            resultat.setText(" " + valeur);
        });
        b3.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "3";
            } else {
                valeur += "3";
            }
            resultat.setText(" " + valeur);
        });
        b4.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "4";
            } else {
                valeur += "4";
            }
            resultat.setText(" " + valeur);
        });
        b5.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "5";
            } else {
                valeur += "5";
            }
            resultat.setText(" " + valeur);
        });
        b6.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "6";
            } else {
                valeur += "6";
            }
            resultat.setText(" " + valeur);
        });
        b7.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "7";
            } else {
                valeur += "7";
            }
            resultat.setText(" " + valeur);
        });
        b8.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "8";
            } else {
                valeur += "8";
            }
            resultat.setText(" " + valeur);
        });
        b9.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "9";
            } else {
                valeur += "9";
            }
            resultat.setText(" " + valeur);
        });
        b0.setOnAction((e) -> {
            if (valeur.equals("0.0") || valeur.equals("")) {
                valeur = "0";
            } else {
                valeur += "0";
            }
            resultat.setText(" " + valeur);
        });
        bdelete.setOnAction((e) -> {
            initCalculator();
        });

    }

    void initCalculator() {
        valeur = "0.0";
        resultat.setText(" " + valeur);
    }

    boolean maxResultat() {
        return resultat.getText().length() <= 10;
    }

}
