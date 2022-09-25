//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);

        Cuenta unaCuenta = new Cuenta();

        System.out.println("Los valores iniciales de la cuenta son: "
                + unaCuenta.toString());

        int acceso;
        String x, y;

        System.out.println("-----Bienvenido-----");
        System.out.println("Digite los datos con los que desea"
                + " crear la cuenta");
        System.out.println("Digite el nombre de la cuenta: ");
        x = lea.next();

        System.out.println("Digite la clave de la cuenta");
        y = lea.next();

        Cuenta miCuenta = new Cuenta(x, y);

        System.out.println("Si desea conocer los datos de su cuenta."
                + " Por favor digite |1|");

        acceso = lea.nextInt();

        if (acceso == 1) {
            miCuenta.validarCuenta();
        } else {
            System.out.println("Gracias por su tiempo.");
        }
    }
}
