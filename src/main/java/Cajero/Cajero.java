package Cajero;

import java.util.Scanner;

public class Cajero {

    public void elegirCuenta(Usuario user) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija la cuenta con la que desea operar: 1-CA Pesos, 2-CC, 3-CA Dólares");
        String cuentaElegida = sc.nextLine();

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

            default:
                System.out.println("Opción incorrecta");
        }

    }

    public void Autenticacion(Usuario user1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        String userIn = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        String passIn = sc.nextLine();

        if (userIn.equals(user1.getUser()) && passIn.equals(user1.getPass())) {
            System.out.println("Ingreso exitoso");
            elegirCuenta(user1);
        } else {
            System.out.println("Datos incorrectos");
        }
    }

    public Cajero() {
    }
}
