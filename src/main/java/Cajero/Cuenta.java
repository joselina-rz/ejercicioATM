package Cajero;

import java.util.Scanner;

public abstract class Cuenta {
    int nroCuenta;
    Double saldo;

    public void operaciones(){
        boolean band = true;
        while (band){
            Scanner op = new Scanner(System.in);
            System.out.println("¿Que desea hacer? 1-Mostrar saldo, 2-Depositar, 3-Retirar, 4-Salir");
            String operacionElegida = op.nextLine();
            if (operacionElegida.equals("1") || operacionElegida.equals("2") || operacionElegida.equals("3") || operacionElegida.equals("4")){
                band=false;
                switch (operacionElegida){
                    case "1":
                        this.consultarSaldo();
                        break;
                    case "2":
                        this.depositar();
                        break;
                    case "3":
                        this.retirar();
                        break;
                    case "4":
                        System.out.println("Gracias por utilizar nuestro servicio");
                        break;
                    default:
                        System.out.println("Operación inválida");
                }
            }else {
                System.out.println("Opción ingresada incorrecta. Por favor, inténtelo nuevamente.");
            }

        }

    }

    public Cuenta(int nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }


    public void consultarSaldo() {
        System.out.println("Su saldo es " + saldo);
    }


    public void retirar() {
        int cantidadRetiro;
        Scanner ret = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea retirar");
        cantidadRetiro = ret.nextInt();
        if (cantidadRetiro <= saldo){
            saldo -= cantidadRetiro;
            System.out.println("Usted retiró: " + cantidadRetiro);
            System.out.println("Su saldo es: " + saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar() {
        int cantidadDeposito;
        Scanner dep = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a depositar");
        cantidadDeposito = dep.nextInt();
        saldo += cantidadDeposito;
        System.out.println("Usted depositó " + cantidadDeposito);
        System.out.println("Su saldo actual es: " + saldo);

    }
}
