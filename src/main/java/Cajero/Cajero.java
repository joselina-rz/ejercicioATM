package Cajero;

import java.util.Scanner;

public class Cajero {

    public void elegirCuenta(Usuario user) {
        boolean band = true;
        while (band){
            Scanner sc = new Scanner(System.in);
            System.out.println("Elija la cuenta con la que desea operar: 1-CA Pesos, 2-CC, 3-CA Dólares, 4-Salir");
            String cuentaElegida = sc.nextLine();
            if (cuentaElegida.equals("1") || cuentaElegida.equals("2") || cuentaElegida.equals("3") || cuentaElegida.equals("4")){
                band=false;
                switch (cuentaElegida) {
                    case "1":
                        user.getPesos().operaciones();
                        break;
                    case "2":
                        user.getDolares().operaciones();
                        break;
                    case "3":
                        user.getCcPesos().operaciones();
                        break;
                    case "4":
                        System.out.println("Gracias por utilizar nuestros servicios.");
                        break;
                }

            }else {
                System.out.println("Opción ingresada incorrecta. Por favor, inténtelo nuevamente.");
            }

        }

    }

    public void identificacion(Usuario user1) {
        boolean band = true;
        while (band){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su usuario");
            String userIn = sc.nextLine();
            System.out.println("Ingrese su contraseña");
            String passIn = sc.nextLine();

            if (userIn.equals(user1.getUser()) && passIn.equals(user1.getPass())) {
                System.out.println("Ingreso exitoso");
                elegirCuenta(user1);
                band=false;
            } else {
                System.out.println("El usuario y/o contraseña no coinciden. Intente nuevamente");
            }

        }

    }

}
