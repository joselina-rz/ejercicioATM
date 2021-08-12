package Cajero;

import java.util.Scanner;

/*inicialmente la aplicación tendrá un solo usuario, este usuario contará con un user inicial y una contraseña.
        El usuario poseerá los tres tipos de cuentas que maneja nuestro ATM (Caja de ahorro en pesos, Caja de ahorro en dolares y Cuenta Corrientes).
El sistema debe permitir:
        El usuario debe poder elegir con que cuenta desea operar.

La aplicación podrá:

        Mostrar el saldo de la cuenta (elegida).

        Depositar un valor.

        Retirar un valor.

        Al momento de retirar “dinero”, este mostrará 5 valores opcionales: 5000, 10.000, 20.000, 50.000, 100.000.

        Retirar un valor diferente en la caja (con un rango diferente a los mencionados anteriormente).

        Se trabajaran con números enteros, si se desea trabajar con decimales pueden modificar el tipo de las variables 😉.
        Se debe permitir cambiar la clave.
  Validaciones:
        Se validarán si son números los que se ingresan como datos.
        Si se ingresan las opciones correctas.*/

public class Main {
    public static void main(String[] args) {


        CajaAhorroPesos CA = new CajaAhorroPesos(00001, 200000.0);
        CajaAhorroDolares CD = new CajaAhorroDolares(00002, 500000.0);
        CuentaCorriente CC = new CuentaCorriente(00003, 300000.0);
        Usuario user1 = new Usuario("usuario", "1234", CA, CD, CC);
        Cajero cajero = new Cajero();

        cajero.Autenticacion(user1);
        
    }



}
