/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.app;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class App {

    public static String LOGIN = "login/login";
    
    public static Map<String, String> map = new HashMap();

    private String getUrl(String url) {
        return "/lib/gui/" + url + ".fxml";
    }

    public App() {
            map.put(LOGIN, getUrl(LOGIN));
    }

}
