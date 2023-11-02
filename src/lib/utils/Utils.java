/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.utils;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 *
 * @author PC
 */
public class Utils {

    private static Utils _instance;

    public static Utils getInstance() {
        if (_instance == null) {
            _instance = new Utils();
        }
        return _instance;
    }

    public void IsSeleted(Label... lab) {
        try {
            for (Label tr : lab) {
                tr.setTextFill(Color.web("#8b8f98"));
                tr.setFont(Font.font("Century Gothic", FontPosture.REGULAR, 13));
            }
            lab[0].setTextFill(Color.web("#008080"));
            lab[0].setFont(Font.font("Century Gothic", FontWeight.BOLD, 13));
        } catch (Exception ex) {
//            error(ex.getMessage());
        }

    }

    public void isMenu(Label... bt) {
        try {
            for (Label tr : bt) {
                tr.setStyle("-fx-border-color:Transparent; -fx-border-width: 2px; -fx-text-fill: #8b8f98;");
                tr.setFont(Font.font("Century Gothic", FontPosture.REGULAR, 13));
            }
            bt[0].setStyle("-fx-border-color:  Transparent Transparent teal; -fx-border-width: 2px; -fx-text-fill: teal;");
            bt[0].setFont(Font.font("Century Gothic", FontWeight.BOLD, 13));
        } catch (Exception ex) {
//            error(ex.getMessage());
        }

    }

}
