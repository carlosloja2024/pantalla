package view;

import constants.RoutesScreens;
import controller.UserController;
import model.User;

import javax.swing.*;
import java.awt.*;

public class AuthScreen {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton iniciarSesiónButton;
    private JButton noEstoyRegistradoButton;
    private JPanel panelPrincipal;

    private UserController userController;
    public AuthScreen() {
        this.initUI();
        this.userController = UserController.getInstance();
    }

    private void initUI() {
        iniciarSesiónButton.addActionListener(
                e -> {
                    String username = usernameField.getText();
                    String password = new String(passwordField.getPassword());

                    boolean isLogged = userController.login(username, password);
                    if (isLogged) {
                        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this.panelPrincipal);
                        CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
                        cardLayout.show(frame.getContentPane(), RoutesScreens.HOME_SCREEN);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                    }
                }
        );
        noEstoyRegistradoButton.addActionListener(
                e -> {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this.panelPrincipal);
                    CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
                    cardLayout.show(frame.getContentPane(), RoutesScreens.REGISTER_SCREEN);
                }
        );
    }
    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }
}
