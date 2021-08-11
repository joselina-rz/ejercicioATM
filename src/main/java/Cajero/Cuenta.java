package Cajero;

public abstract class Cuenta {
    int nroCuenta;
    Double saldo;

    public Cuenta(int nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }


    public void consultarSaldo (){
        //to do
    }
    public void retiro(){

    }
    public void deposito(){

    }
}
