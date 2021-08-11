package Cajero;

public abstract class Cuenta {
    String user;
    String pass;
    Double saldo;

    public Cuenta(String user, String pass, Double saldo) {
        user = user;
        pass = pass;
        saldo = saldo;
    }


    public void consultarSaldo (){
        //to do
    }
    public void retiro(){

    }
    public void deposito(){

    }
}
