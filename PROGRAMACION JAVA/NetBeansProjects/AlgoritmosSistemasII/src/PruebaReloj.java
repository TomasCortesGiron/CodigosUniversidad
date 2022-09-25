//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaReloj {
    public static void main(String[]args) throws InterruptedException{
        
        Reloj unReloj = new Reloj();
        System.out.println("Los datos iniciales del reloj son: " 
                + unReloj.toString());
        
        int pSegundos, pMinutos, pHoras;
        
        Scanner lea = new Scanner(System.in);
        System.out.print("Digite el segundo ");
        System.out.println("en donde quiere iniciar el reloj:");
        
        pSegundos = lea.nextInt();
        
        System.out.print("Digite el minuto ");
        System.out.println("en donde quiere iniciar el reloj:");
        
        pMinutos = lea.nextInt();
        
        System.out.print("Digite la hora ");
        System.out.println("en donde quiere iniciar el reloj:");
        
        pHoras = lea.nextInt();
        
        Reloj miReloj = new Reloj();
        
        System.out.println("Los nuevos valores son: ");
        miReloj.conteo(pSegundos, pMinutos, pHoras);
        
        
    }
    
}
