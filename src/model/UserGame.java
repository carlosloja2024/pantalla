package model;

public class UserGame {

    private User user;
    private int puntaje;
    private int nivel;
    private int vidas;

    public UserGame(User user, int puntaje, int nivel, int vidas) {
        this.user = user;
        this.puntaje = puntaje;
        this.nivel = nivel;
        this.vidas = vidas;
    }

    public User getUser() {
        return user;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVidas() {
        return vidas;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void incrementarPuntaje(int incremento) {
        puntaje += incremento;
    }

    public void incrementarNivel() {
        nivel++;
    }

    public void decrementarVidas() {
        vidas--;
    }

    public boolean perdio() {
        return vidas == 0;
    }

    public boolean gano() {
        return nivel == 5;
    }

    public void reiniciar() {
        puntaje = 0;
        nivel = 1;
        vidas = 3;
    }


}
