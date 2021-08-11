package Cajero;

import javax.swing.*;
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
    public  static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija la cuenta con la que desea operar: 1-CA Pesos, 2-CC, 3-CA Dólares");
        String tipo = sc.nextLine();
            switch (tipo){
                case 1: Cuenta cajaP = new CajaAhorroPesos("user1", "1234", 200000);
                case 2: Cuenta cajaD = new CajaAhorroDolares("user1", "1234", 200000);;
                case 3: Cuenta cuentaC = new CuentaCorriente("user1", "1234", 200000);;
                default: ;
            }
        System.out.println("¿Que desea hacer? 1-Mostrar saldo, 2-Depositar, 3-Retirar");
        String op = sc.nextLine();

        switch (op){
            1:
            2:
            3:
            default:
        }
    }

}
