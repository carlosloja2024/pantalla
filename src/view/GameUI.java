package view;

import constants.RoutesScreens;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class GameUI extends JFrame {
    private CardLayout cardLayout;
    public GameUI() {
        initUI();
    }

    private void initUI() {
        setTitle("Wordle");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        setLayout(cardLayout);


        HashMap<String, JPanel> screens = RoutesScreens.getRoutes();

        for (String key : screens.keySet()) {
            add(screens.get(key), key);
        }

        cardLayout.show(getContentPane(), RoutesScreens.START_SCREEN);


    }
}
