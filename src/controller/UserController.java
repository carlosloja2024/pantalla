package controller;

import model.Database;
import model.User;
import model.UserGame;

public class UserController {
    private Database database;
    private UserGame userGame;
    public static UserController instance=null;

    private UserController() {
        this.database = Database.getInstance();
        this.userGame = null;
    }

    public static UserController getInstance() {
        if (instance == null) {
            instance = new UserController();
        }
        return instance;
    }

    public boolean login(String usuario, String clave) {
        User userLogged = database.validateUser(usuario, clave);
        if (userLogged != null) {
            userGame = new UserGame(userLogged, 0, 1, 3);

            return true;
        }
        return false;
    }

    public boolean register(String nombre, String apellido, String clave, String usuario) {
        User user = new User(nombre, apellido, clave, usuario);
        database.addUser(user);
        userGame = new UserGame(user, 0, 1, 3);
        return true;
    }

    public void logout() {

    }

    public void saveGame() {

    }

    public void loadGame() {

    }


}
