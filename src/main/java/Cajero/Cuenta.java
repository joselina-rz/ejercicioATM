package Cajero;

import java.util.Scanner;

public abstract class Cuenta {
    int nroCuenta;
    Double saldo;

    public void operaciones(){
        Scanner op = new Scanner(System.in);
        System.out.println("¿Que desea hacer? 1-Mostrar saldo, 2-Depositar, 3-Retirar");
        String operacionElegida = op.nextLine();

        switch (operacionElegida){
            case "1": {
                this.consultarSaldo();
                break;
            }
            case "2": {
                this.deposito();
                break;
            }
            case "3": {
                this.retiro();
                break;
            }
            default:{
                System.out.println("Operación inválida");
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


//Falta algo para que no pueda retirar mas de lo que tiene en la cuenta

    public void retiro() {
        int cantidadRetiro;
        Scanner ret = new Scanner(System.in);
        System.out.println("Ingrese cuanto desea retirar");
        cantidadRetiro = ret.nextInt();
        saldo -= cantidadRetiro;
        System.out.println("Usted retiro " + cantidadRetiro);
        System.out.println("Su saldo es " + saldo);

    }

    public void deposito() {
        int cantidadDeposito;
        Scanner dep = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a depositar");
        cantidadDeposito = dep.nextInt();
        saldo += cantidadDeposito;
        System.out.println("Usted deposito " + cantidadDeposito);
        System.out.println("Su saldo actual es " + saldo);

    }
}
