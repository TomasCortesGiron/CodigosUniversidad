//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaPuntoUno {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        PuntoUno miPuntoUno = new PuntoUno();

        System.out.println("Digite la frase:");
        String cad = lea.nextLine();

        System.out.println("La cantidad de caracteres de la cadena que hay "
                + "es de: " + miPuntoUno.longitud(cad) + " caracteres");

        miPuntoUno.repetidos(cad);

    }
}
