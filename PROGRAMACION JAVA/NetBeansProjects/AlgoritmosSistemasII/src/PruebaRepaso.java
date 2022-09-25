//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaRepaso {
    public static void main(String []args){
        double pa, pb;
        char opc;
        
        Repaso unRepaso = new Repaso();
        System.out.println("Los valores iniciales del repaso son: ");
        unRepaso.toString();
        
        Scanner lea = new Scanner(System.in);
        
        System.out.println("Digite los valores del primer numero: ");
        pa = lea.nextDouble();
        System.out.println("Digite los valores del segundo numero: ");
        pb = lea.nextDouble();
        
        Repaso miRepaso = new Repaso(pa, pb);
        
        opc=menu();
        
        switch(opc){
            case '1':
                miRepaso.Sumar(pa, pb);
            break;
                
            case '2':
                miRepaso.Restar(pa, pb);
            break;
            
            case '3':
                miRepaso.Multiplicar(pa, pb);
            break;
            
            case '4':
                miRepaso.Dividir(pa, pb);
            break;
        }
        
    }
        
    public static char menu(){
       char opcion;
       
       Scanner lea = new Scanner(System.in);
       
        System.out.println("Si desea sumar, digite 1");
        System.out.println("Si desea restar, digite 2");
        System.out.println("Si desea multiplicar, digite 3");
        System.out.println("Si desea dividir, digite 4");
        
        opcion = lea.next().charAt(0);
        return opcion;
        
    }
    
}
