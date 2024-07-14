package view;

import constants.RoutesScreens;

import javax.swing.*;
import java.awt.*;

public class StartScreen {
    private JButton inicioButton;
    private JButton salirButton;
    private JPanel panelPrincipal;

    public StartScreen() {
        this.initUI();
    }

    private void initUI() {
        inicioButton.addActionListener(
                e -> {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this.panelPrincipal);
                    CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
                    cardLayout.show(frame.getContentPane(), RoutesScreens.AUTH_SCREEN);
                }
        );
        salirButton.addActionListener(
                e -> {
                    System.exit(0);
                }
        );
    }
    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

}
