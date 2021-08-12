package Cajero;

public class Usuario {

    private String user;
    private String pass;
    private CajaAhorroDolares dolares;
    private CajaAhorroPesos pesos;
    private CuentaCorriente ccPesos;

    public Usuario(String usuario, String pass, CajaAhorroPesos pesos, CajaAhorroDolares dolares,  CuentaCorriente ccPesos) {
        this.user = usuario;
        this.pass = pass;
        this.dolares = dolares;
        this.pesos = pesos;
        this.ccPesos = ccPesos;
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

    public CajaAhorroDolares getDolares() {
        return dolares;
    }

    public void setDolares(CajaAhorroDolares dolares) {
        this.dolares = dolares;
    }

    public CajaAhorroPesos getPesos() {
        return pesos;
    }

    public void setPesos(CajaAhorroPesos pesos) {
        this.pesos = pesos;
    }

    public CuentaCorriente getCcPesos() {
        return ccPesos;
    }

    public void setCcPesos(CuentaCorriente ccPesos) {
        this.ccPesos = ccPesos;
    }
}
