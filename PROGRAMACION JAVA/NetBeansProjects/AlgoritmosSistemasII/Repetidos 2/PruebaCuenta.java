//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaCuenta {
    
    private Cuenta miCuenta;
    private Scanner lea;
    
    public PruebaCuenta(){
        this.miCuenta = new Cuenta();
        this.lea = new Scanner(System.in);
    }
    
    public void crearUsuario(){
        String usuario = "";
        String clave = "";
        System.out.println("Ingrese usuario...: ");
        usuario = lea.next();
        miCuenta.setUsuario(usuario);
        System.out.println("Ingrese clave...: ");
        clave = lea.next();
        miCuenta.setClave(clave);
    }
    
    public void verificarUsuario() {
        String usuario = "";
        String clave = "";
        System.out.println("|Verificacion de usuario y clave|");
        
        System.out.println("Ingrese usuario...:");
        usuario = lea.next();
        System.out.println("Ingrese clave...:");
        clave = lea.next();
        if(miCuenta.validarEntrada(usuario, clave)){
            System.out.println("Ingreso exitoso..." + miCuenta.getUsuario());
        }else{
            System.out.println("Ingreso no exitoso..." + miCuenta.getUsuario());
        }
    }
    
    public void cambiarClave(){
        int desea;
        
        System.out.println("Si desea cambiar la clave, digite |1|: ");
        desea = lea.nextInt();
        
        if(desea == 1){   
            String clave = "";
            String clave2 = "";
            System.out.println("Ingrese clave actual: ");
            clave = lea.next();
            if(clave.equalsIgnoreCase(miCuenta.getClave())){
                System.out.println("Ingrese la nueva clave: ");
                clave = lea.next();
                System.out.println("Ingrese nuevamente su clave: ");
                clave2 = lea.next();
                if(clave.equalsIgnoreCase(clave2)){
                    miCuenta.cambiarClave(clave);
                    System.out.println("Cambio realizado satisfactoriamente");
                }else{
                    System.out.println("Claves incorrecta...");
                }
            }else{
                System.out.println("Clave actual incorrecta...");
            } 
        }
    }
    
    public static void main(String[] args){
        PruebaCuenta prueba = new PruebaCuenta();
        prueba.crearUsuario();
        prueba.verificarUsuario(); 
        prueba.cambiarClave();
    }
}
