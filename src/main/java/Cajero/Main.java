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
    public  static void main (String[] args){
        Usuario user1 = new Usuario("usuario", "1234");
        Cuenta cajaP = new CajaAhorroPesos( 00001, 200000.0);
        Cuenta cajaD = new CajaAhorroDolares(00002, 500000.0);
        Cuenta cuentaC = new CuentaCorriente(00003, 300000.0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        String userIn = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        String passIn = sc.nextLine();

        if (userIn.equals(user1.getUser()) && passIn.equals(user1.getPass())){
            System.out.println("Ingreso exitoso");
            System.out.println("Elija la cuenta con la que desea operar: 1-CA Pesos, 2-CC, 3-CA Dólares");
            String tipo = sc.nextLine();

            System.out.println("¿Que desea hacer? 1-Mostrar saldo, 2-Depositar, 3-Retirar");
            String op = sc.nextLine();
            switch (op){
                case 1:
                break;
                case 2:
                default:
            }


        }else {
            System.out.println("Datos incorrectos");
        }


    }

}
