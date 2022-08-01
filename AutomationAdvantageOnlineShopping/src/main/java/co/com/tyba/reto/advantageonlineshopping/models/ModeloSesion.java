package co.com.tyba.reto.advantageonlineshopping.models;

public class ModeloSesion {
    private String user;
    private String pass;

    public ModeloSesion(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
