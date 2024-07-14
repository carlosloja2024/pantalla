package model;

public class Database {
    private static Database instance = null;
    private User[] users;
    private int userCount;

    private Database() {
        users = new User[10];
        userCount = 0;
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void addUser(User user) {
        if (userCount < users.length) {
            users[userCount] = user;
            userCount++;
        }
    }

    public User[] getUsers() {
        return users;
    }

    public int getUserCount() {
        return userCount;
    }

    public User getUser(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                return users[i];
            }
        }
        return null;
    }

    public Boolean userExists(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public User validateUser(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }
}
