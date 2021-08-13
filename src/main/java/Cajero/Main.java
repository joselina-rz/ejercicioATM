package Cajero;

public class Main {
    public static void main(String[] args) {


        CajaAhorroPesos cajaAhorro = new CajaAhorroPesos(1, 200000.0);
        CajaAhorroDolares cajaDolares = new CajaAhorroDolares(2, 500000.0);
        CuentaCorriente cuentaCo = new CuentaCorriente(3, 300000.0);
        Usuario user1 = new Usuario("usuario", "1234", cajaAhorro, cajaDolares, cuentaCo);
        Cajero cajero = new Cajero();

        cajero.identificacion(user1);
        
    }

}
