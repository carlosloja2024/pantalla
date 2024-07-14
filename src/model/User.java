package model;

public class User {
    private String username;
    private String password;
    private String name;
    private String surname;

    public User( String name, String surname, String password,String username) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean equals(User user) {
        return this.username.equals(user.getUsername());
    }

    public String toString() {
        return "Username: " + username + "\nPassword: " + password + "\nName: " + name + "\nSurname: " + surname;
    }

}
