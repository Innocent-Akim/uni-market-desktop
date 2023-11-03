/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.controller.home;

import de.jensd.fx.glyphs.icons525.Icons525View;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import lib.app.App;
import lib.utils.Utils;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class HomeController implements Initializable {

    @FXML
    private StackPane app_screen;
    public static StackPane container;
    @FXML
    private AnchorPane pan_dash;
    @FXML
    private Label b_dash;
    @FXML
    private Label b_dash1;
    @FXML
    private AnchorPane pan_entrees;
    @FXML
    private Label b_entrees;
    @FXML
    private AnchorPane pan_sorties;
    @FXML
    private Label b_sorties;
    @FXML
    private Icons525View o1;
    @FXML
    private AnchorPane pan_finances;
    @FXML
    private Label b_finances;
    @FXML
    private AnchorPane pan_stocks;
    @FXML
    private Label b_stocks;
    @FXML
    private Label b_dash11;
    @FXML
    private AnchorPane pan_rapport_entrees;
    @FXML
    private Label b_rapport_entrees;
    @FXML
    private AnchorPane pan_rapport_sorties;
    @FXML
    private Label b_rapport_sorties;
    @FXML
    private Icons525View o11;
    @FXML
    private AnchorPane pan_rapport_finances;
    @FXML
    private Label b_rapport_finances;
    @FXML
    private AnchorPane pan_rapport_stocks;
    @FXML
    private Label b_rapport_stocks;
    @FXML
    private Label b_dash111;
    @FXML
    private AnchorPane pan_historique_entrees;
    @FXML
    private Label b_histo_entrees;
    @FXML
    private AnchorPane pan_historique_sotries;
    @FXML
    private Label b_histoSorties;
    @FXML
    private Icons525View o111;
    @FXML
    private Label b_dash1111;
    @FXML
    private Label b_dash11111;
    @FXML
    private AnchorPane pan_identification;
    @FXML
    private Label b_identifications;
    @FXML
    private AnchorPane pan_produicts;
    @FXML
    private Label b_products;
    @FXML
    private Icons525View o112;
    @FXML
    private AnchorPane pan_droit_acces;
    @FXML
    private Label b_droitAcces;
    @FXML
    private Icons525View s111;
    @FXML
    private AnchorPane pan_configurations;
    @FXML
    private Label b_configuration;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        container = app_screen;
        App.instance().setContaint(app_screen, App.DASHBOARD);
        Utils.getInstance().IsSeleted(b_dash, b_entrees, b_sorties, b_stocks, b_finances, b_rapport_entrees, b_rapport_sorties, b_rapport_stocks, b_rapport_finances, b_histo_entrees, b_histoSorties, b_identifications, b_products, b_configuration, b_droitAcces);
        isAction();
    }

    @FXML
    private void Calldash(MouseEvent event) {
    }

    @FXML
    private void Calloperation(MouseEvent event) {
    }

    @FXML
    private void CallStatistique(MouseEvent event) {
    }

    void isAction() {
        b_dash.setOnMouseClicked((e) -> {
            App.instance().setContaint(app_screen, App.DASHBOARD);
            Utils.getInstance().IsSeleted(b_dash, b_entrees, b_sorties, b_stocks, b_finances, b_rapport_entrees, b_rapport_sorties, b_rapport_stocks, b_rapport_finances, b_histo_entrees, b_histoSorties, b_identifications, b_products, b_configuration, b_droitAcces);
        });
        b_entrees.setOnMouseClicked((e) -> {
            App.instance().setContaint(app_screen, App.ENTREE);
            Utils.getInstance().IsSeleted(b_entrees, b_dash, b_sorties, b_stocks, b_finances, b_rapport_entrees, b_rapport_sorties, b_rapport_stocks, b_rapport_finances, b_histo_entrees, b_histoSorties, b_identifications, b_products, b_configuration, b_droitAcces);
        });
        b_sorties.setOnMouseClicked((e) -> {
            App.instance().setContaint(app_screen, App.SORTIE);
            Utils.getInstance().IsSeleted(b_sorties, b_dash, b_entrees, b_stocks, b_finances, b_rapport_entrees, b_rapport_sorties, b_rapport_stocks, b_rapport_finances, b_histo_entrees, b_histoSorties, b_identifications, b_products, b_configuration, b_droitAcces);
        });
        b_stocks.setOnMouseClicked((e) -> {
            App.instance().setContaint(app_screen, App.STOCK);
            Utils.getInstance().IsSeleted(b_stocks, b_sorties, b_dash, b_entrees, b_finances, b_rapport_entrees, b_rapport_sorties, b_rapport_stocks, b_rapport_finances, b_histo_entrees, b_histoSorties, b_identifications, b_products, b_configuration, b_droitAcces);
        });
        b_finances.setOnMouseClicked((e) -> {
            App.instance().setContaint(app_screen, App.FINANCE);
            Utils.getInstance().IsSeleted(b_finances, b_stocks, b_sorties, b_dash, b_entrees, b_rapport_entrees, b_rapport_sorties, b_rapport_stocks, b_rapport_finances, b_histo_entrees, b_histoSorties, b_identifications, b_products, b_configuration, b_droitAcces);
        });

        b_products.setOnMouseClicked((e) -> {
            App.instance().setContaint(app_screen, App.PRODUCTS);
            Utils.getInstance().IsSeleted(b_products, b_finances, b_stocks, b_sorties, b_dash, b_entrees, b_rapport_entrees, b_rapport_sorties, b_rapport_stocks, b_rapport_finances, b_histo_entrees, b_histoSorties, b_identifications, b_configuration, b_droitAcces);
        });

        b_configuration.setOnMouseClicked((e) -> {
            App.instance().setContaint(app_screen, App.PRODUCTS);
            Utils.getInstance().IsSeleted(b_configuration, b_products, b_finances, b_stocks, b_sorties, b_dash, b_entrees, b_rapport_entrees, b_rapport_sorties, b_rapport_stocks, b_rapport_finances, b_histo_entrees, b_histoSorties, b_identifications, b_droitAcces);
        });
    }

}
