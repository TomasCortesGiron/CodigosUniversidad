//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaDiaSiguiente2 {
    
    public static void main(String[] args){
        
        int pDia, pMes, pAno;
        
        DiaSiguiente2 elDiaSiguiente = new DiaSiguiente2();
        
        Scanner fecha = new Scanner(System.in);
        System.out.println("");
        
        System.out.println("Digite el dia en valor numerico: ");
        pDia = fecha.nextInt();
        System.out.println("Digite el mes en valor numerico: ");
        pMes = fecha.nextInt();
        System.out.println("Digite el año: ");
        pAno = fecha.nextInt();  
        
        DiaSiguiente2 siguienteFecha = new DiaSiguiente2();
        siguienteFecha.bisiesto(pDia, pMes, pAno);
        
        int sumaLocal;
        sumaLocal = elDiaSiguiente.obtenerSuma(pDia, pMes, pAno);
        System.out.println("la suma es " + sumaLocal);
    }
    
}
