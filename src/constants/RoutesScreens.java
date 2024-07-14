package constants;

import javax.swing.*;
import java.util.HashMap;

public class RoutesScreens {

    public static final String AUTH_SCREEN = "auth";
    public static final String HOME_SCREEN = "home";
    public static final String START_SCREEN = "start";
    public static final String REGISTER_SCREEN = "register";

    public static HashMap<String, JPanel> getRoutes() {
        HashMap<String, JPanel> routes = new HashMap<>();
        routes.put(START_SCREEN, new view.StartScreen().getPanelPrincipal());
        routes.put(AUTH_SCREEN, new view.AuthScreen().getPanelPrincipal());
        routes.put(HOME_SCREEN, new view.HomeScreen().getPanelPrincipal());
        routes.put(REGISTER_SCREEN, new view.RegisterScreen().getPanelPrincipal());
        return routes;
    }

}
