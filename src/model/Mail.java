package model;

public class Mail {
    private String cadena;
    public Mail(String c) {
        this.cadena = c;
    }

    private String getDomain() {
        return this.cadena.split("@")[1];
    }
}
