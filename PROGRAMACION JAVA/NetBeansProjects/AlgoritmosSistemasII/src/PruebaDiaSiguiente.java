//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaDiaSiguiente {

    public static void main(String[] args) {

        int pDia, pMes, pAno;

        DiaSiguiente elDiaSiguiente = new DiaSiguiente();
        System.out.println("La fecha inicializada es: " 
                + elDiaSiguiente.toString());

        Scanner fecha = new Scanner(System.in);
        System.out.println("");

        System.out.println("Digite el dia en valor numerico: ");
        pDia = fecha.nextInt();
        System.out.println("Digite el mes en valor numerico: ");
        pMes = fecha.nextInt();
        System.out.println("Digite el año: ");
        pAno = fecha.nextInt();

        DiaSiguiente siguienteFecha = new DiaSiguiente();
        siguienteFecha.bisiesto(pDia, pMes, pAno);

    }

}
