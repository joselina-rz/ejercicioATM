package Cajero;

import java.util.Scanner;

public class Usuario {

    private String user;
    private String pass;
    private CajaAhorroDolares dolares;
    private CajaAhorroPesos pesos;
    private CuentaCorriente ccPesos;

    public Usuario(String usuario, String pass, CajaAhorroPesos pesos, CajaAhorroDolares dolares,  CuentaCorriente ccPesos) {
        this.user = usuario;
        this.pass = pass;
        this.dolares = dolares;
        this.pesos = pesos;
        this.ccPesos = ccPesos;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public CajaAhorroDolares getDolares() {
        return dolares;
    }

    public CajaAhorroPesos getPesos() {
        return pesos;
    }

    public CuentaCorriente getCcPesos() {
        return ccPesos;
    }

    public void cambiarPass(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese contraseña actual");
        String pwd = sc.nextLine();
        System.out.println("Ingrese nueva contraseña");
        String newPwd= sc.nextLine();
        System.out.println("Repita nueva contraseña");
        String newPwd2= sc.nextLine();
        if (pwd.equals(pass)){
            if (newPwd.equals(newPwd2)){
                System.out.println("Contraseña modificada con éxito");
            }else {
                System.out.println("Las contraseñas no coinciden");
            }
        }else {
            System.out.println("Contraseña actual incorrecta.");
        }

    }

}
