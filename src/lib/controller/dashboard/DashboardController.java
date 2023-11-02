/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.dashboard;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class DashboardController implements Initializable {

    @FXML
    private Label presExpire;
    @FXML
    private Label produitNondispo;
    @FXML
    private VBox bn;
    @FXML
    private Label perimer;
    @FXML
    private VBox bn2;
    @FXML
    private Label client;
    @FXML
    private Label dateDay;
    @FXML
    private Label mothOfyear;
    @FXML
    private Label jour;
    @FXML
    private AnchorPane sc;
    @FXML
    private Text bn1;
    @FXML
    private BarChart<?, ?> piChart;
    @FXML
    private JFXButton b_Year;
    @FXML
    private JFXButton b_Moth;
    @FXML
    private JFXButton b_Week;
    @FXML
    private JFXButton b_Day;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LoadDataForYear(MouseEvent event) {
    }

    @FXML
    private void LoadDataForMoth(MouseEvent event) {
    }

    @FXML
    private void LoadDataForWeek(MouseEvent event) {
    }

    @FXML
    private void LoadDataForDay(MouseEvent event) {
    }
    
}
