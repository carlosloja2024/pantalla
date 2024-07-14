package view;

import constants.RoutesScreens;
import controller.UserController;

import javax.swing.*;
import java.awt.*;

public class RegisterScreen {
    private JPanel panelPrincipal;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField usuarioField;
    private JPasswordField claveField;
    private JPasswordField repetirClaveField;
    private JButton guardarButton;
    private JButton cancelarButton;

    private UserController userController;
    public RegisterScreen() {
        this.userController = UserController.getInstance();
        this.initUI();
    }

    private void initUI() {
        guardarButton.addActionListener(
                e -> {
                    String nombre = nombreField.getText();
                    String apellido = apellidoField.getText();
                    String usuario = usuarioField.getText();
                    String clave = new String(claveField.getPassword());
                    String repetirClave = new String(repetirClaveField.getPassword());

                    if (!clave.equals(repetirClave)) {
                        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                    } else {
                        boolean isRegistered = userController.register(nombre, apellido, clave,usuario);
                        if (isRegistered) {
                            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this.panelPrincipal);
                            CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
                            cardLayout.show(frame.getContentPane(), RoutesScreens.AUTH_SCREEN);
                        } else {
                            JOptionPane.showMessageDialog(null, "El usuario ya existe");
                        }
                    }
                }
        );
        cancelarButton.addActionListener(
                e -> {
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this.panelPrincipal);
                    CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
                    cardLayout.show(frame.getContentPane(), RoutesScreens.AUTH_SCREEN);
                }
        );
    }
    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }
}
