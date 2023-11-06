/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.app;

import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXListView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import lib.main.Main;
import org.controlsfx.control.PopOver;

/**
 *
 * @author PC
 */
public class App {

    public static String LOGIN = "login/login";
    public static String ERROR = "error/error";
    public static String DASHBOARD = "dashboard/dashboard";
    public static String HOME = "home/home";
    public static String ENTREE = "entree/entree";
    public static String SORTIE = "sortie/sortie";
    public static String FINANCE = "finance/finance";
    public static String STOCK = "stock/stock";
    public static String LISTE_ENTREE = "entree/liste/liste";
    public static String APPROVISIONNEMENT = "entree/approvisionnement/approvisionnement";
    public static String LISTE_SORTIE = "sortie/liste/liste";
    public static String VENTES = "sortie/vente/ventes";
    public static String PRODUCTS = "products/products";

    public static String ADD_PRODUICT = "product/addProduct";
    public static String ADD_AGENT = "agent/agent";
    public static String ADD_CLIENT = "client/client";
    public static String ADD_FOURNISSEUR = "fournisseur/fournisseur";

    public static String IDENTIFICATE_PRINCIPALE = "identificate/principale/principale";
    public static String IDENTIFICATE_AGENT = "identificate/agent/agent";
    public static String IDENTIFICATE_CLIENT = "identificate/client/client";
    public static String IDENTIFICATE_FOURNISSEUR = "identificate/fournisseur/fournisseur";

    public static String LOAD_PANIER_APPROV = "entree/approvisionnement/loadPanierApprovisionnement";

    public static Map<String, String> map = new HashMap();
    public static StackPane stackPane = Main.stage.getContent();
    public static final HashMap<String, Node> SCREENS = new HashMap<>();
    public static JFXDialog dialog;
    public static PopOver over = new PopOver();
    public static Node currentView = null;
    private static App instance;

    private String getUrl(String url) {
        return "/lib/gui/" + url + ".fxml";
    }

    private String getDialog(String url) {
        return "/lib/dialog/" + url + ".fxml";
    }

    private String getLoad(String url) {
        return "/lib/load/" + url + ".fxml";
    }

    public App() {
        map.put(LOGIN, getUrl(LOGIN));
        map.put(ERROR, getUrl(ERROR));
        map.put(DASHBOARD, getUrl(DASHBOARD));
        map.put(HOME, getUrl(HOME));
        map.put(ENTREE, getUrl(ENTREE));
        map.put(SORTIE, getUrl(SORTIE));
        map.put(STOCK, getUrl(STOCK));
        map.put(FINANCE, getUrl(FINANCE));
        map.put(LISTE_ENTREE, getUrl(LISTE_ENTREE));
        map.put(VENTES, getUrl(VENTES));
        map.put(LISTE_SORTIE, getUrl(LISTE_SORTIE));
        map.put(PRODUCTS, getUrl(PRODUCTS));
        map.put(APPROVISIONNEMENT, getUrl(APPROVISIONNEMENT));

        //Identification
        map.put(IDENTIFICATE_AGENT, getUrl(IDENTIFICATE_AGENT));
        map.put(IDENTIFICATE_CLIENT, getUrl(IDENTIFICATE_CLIENT));
        map.put(IDENTIFICATE_FOURNISSEUR, getUrl(IDENTIFICATE_FOURNISSEUR));
        map.put(IDENTIFICATE_PRINCIPALE, getUrl(IDENTIFICATE_PRINCIPALE));

        //Dialog
        map.put(ADD_PRODUICT, getDialog(ADD_PRODUICT));
        map.put(ADD_AGENT, getDialog(ADD_AGENT));
        map.put(ADD_CLIENT, getDialog(ADD_CLIENT));
        map.put(ADD_FOURNISSEUR, getDialog(ADD_FOURNISSEUR));
        map.put(LOAD_PANIER_APPROV, getLoad(LOAD_PANIER_APPROV));
    }

    public Node get(String view) {
        if (!SCREENS.containsKey(view)) {
            try {
                String url = map.get(view);
                if (url == null) {
                    SCREENS.put(view, FXMLLoader.load(getClass().getResource(ERROR)));
                } else {
                    currentView = FXMLLoader.load(getClass().getResource(url));
                    SCREENS.put(view, currentView);
                }
            } catch (IOException ex) {
                try {
                    SCREENS.put(view, FXMLLoader.load(getClass().getResource(ERROR)));
                } catch (IOException e) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        return SCREENS.get(view);
    }

    public void remode(String remove) {
        SCREENS.remove(remove);
    }

    public void setContaint(Node Contrainaire, String interfaces) {
        try {
            Node child = this.get(interfaces);
            if (Contrainaire instanceof StackPane) {
                StackPane contain_area = (StackPane) Contrainaire;
                contain_area.getChildren().removeAll();
                contain_area.getChildren().setAll(child);
            } else if (Contrainaire instanceof VBox) {
                VBox contain_area = (VBox) Contrainaire;
                contain_area.getChildren().removeAll();
                contain_area.getChildren().setAll(child);
            } else if (Contrainaire instanceof AnchorPane) {
                AnchorPane contain_area = (AnchorPane) Contrainaire;
                contain_area.getChildren().removeAll();
                contain_area.getChildren().setAll(child);
            } else if (Contrainaire instanceof ScrollPane) {
                ScrollPane contain_area = (ScrollPane) Contrainaire;
                contain_area.setContent(child);
            } else if (Contrainaire instanceof JFXListView) {
                JFXListView contain_area = (JFXListView) Contrainaire;
//                contain_area.getItems().removeAll();
                Main.loadPreview = contain_area; 
  
            }
   
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void SelectDataFor(Button... bt) {
        try {
            for (Button tr : bt) {
                tr.setStyle("-fx-background-color: #C4BEBB;-fx-text-fill: #000000;");
                tr.setFont(Font.font("System", FontPosture.REGULAR, 13));
            }
            bt[0].setStyle("-fx-background-color: #37479C;-fx-text-fill: #fff;");
            bt[0].setFont(Font.font("System", FontWeight.BOLD, 13));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setDialog(String interfaces) {
        JFXDialogLayout dl = new JFXDialogLayout();
        Node node = get(interfaces);
        dl.setBody(node);
        dialog = new JFXDialog(stackPane, dl, JFXDialog.DialogTransition.CENTER, true);
        dialog.show(stackPane);
    }

    public void setDialog(String url, float x, float y) {
        try {
            Node node = FXMLLoader.load(getClass().getResource(url));
            JFXDialogLayout dl = new JFXDialogLayout();
            dl.setPrefSize(x, y);
            dl.setPadding(Insets.EMPTY);
            dl.setBody(node);
            dialog = new JFXDialog(stackPane, dl, JFXDialog.DialogTransition.CENTER, false);
            dialog.show(stackPane);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void popOverMenu(Node node, Node interfaces, PopOver.ArrowLocation arrowLocation) {
        if (!over.isShowing()) {
            AnchorPane box = (AnchorPane) interfaces;
            over.setArrowLocation(arrowLocation);
            over.setAutoHide(true);
            over.setContentNode(box);
            over.show(node, 0);
        } else {
            over.hide();
        }
    }

    public static App instance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

}
