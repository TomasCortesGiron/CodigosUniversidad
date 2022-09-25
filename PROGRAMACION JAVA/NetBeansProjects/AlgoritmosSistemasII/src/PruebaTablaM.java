//Tomas Cortes - Ingenieria Electronica
import java.util.Scanner;

public class PruebaTablaM {
    public static void main(String[]args){
        int n;
        
        Scanner lea = new Scanner (System.in);
        
        TablaMultiplicar unaTablaMultiplicar = new TablaMultiplicar();
        System.out.println("El estado inicial de la tabla es: " 
                + unaTablaMultiplicar.toString());
        
        System.out.print("Digiter el numero ");
        System.out.println("que quiere que sea la base de las operaciones: ");
        n = lea.nextInt();
        
        TablaMultiplicar miTablaMultiplicar = new TablaMultiplicar(n);
        System.out.println("Los valores de la tabla son: ");
        miTablaMultiplicar.generarTabla(n);
        
        
    }
    
}
