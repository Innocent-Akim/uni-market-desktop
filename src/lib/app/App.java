/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
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
    public static String LISTE_ENTREE="entree/liste/liste";
    


    //Hap<String, String> map=new HashMap();
    public static Map<String, String> map = new HashMap();
    public static StackPane stackPane = Main.stage.getContent();
    public static final HashMap<String, Node> SCREENS = new HashMap<>();
    public static Node currentView = null;
    private static App instance;

    private String getUrl(String url) {
        return "/lib/gui/" + url + ".fxml";
    }

    public App() {
        map.put(LOGIN, getUrl(LOGIN));
        map.put(ERROR, getUrl(ERROR));
        map.put(DASHBOARD, getUrl(DASHBOARD));
        map.put(HOME, getUrl(HOME));
        map.put(ENTREE, getUrl(ENTREE));
        map.put(SORTIE, getUrl(SORTIE   ));
        map.put(STOCK, getUrl(STOCK));
        map.put(FINANCE, getUrl(FINANCE));

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

    public static App instance() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

}
