//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {
        char opc;
        double valor;

        Scanner lea = new Scanner(System.in);

        Cuenta inicialCuenta = new Cuenta();
        System.out.println("El valor inicial de la cuenta es:");
        valor = lea.nextDouble();
        // Apertura de cuenta
        Cuenta miCuenta = new Cuenta(valor);
        System.out.println("Apertura de cuenta: $" + miCuenta.obtenerSaldo());

        opc = menu();
        switch (opc) {
            case '1': {
                System.out.println(">>> Realizar consignación <<<");
                System.out.println("Cantidad: ");
                valor = lea.nextDouble();
                miCuenta.consignar(valor);
                System.out.println("Su nuevo saldo es de $ "
                        + miCuenta.obtenerSaldo());
                break;
            }

            case '2': {
                System.out.println(">>> Realizar consignación <<<");
                System.out.println("Cantidad: ");
                valor = lea.nextDouble();
                miCuenta.retirar(valor);
                System.out.println("Su nuevo saldo es de $ "
                        + miCuenta.obtenerSaldo());
                break;
            }

            case '3': {
                System.out.println(">>> Realizar consignación <<<");
                System.out.println("Cantidad: ");
                valor = lea.nextDouble();
                miCuenta.consignar(valor);
                System.out.println("Su nuevo saldo es de $ "
                        + miCuenta.obtenerSaldo());
                break;
            }
        }

    }

    public static char menu() {
        char opcion;
        Scanner lea = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("-- Banco ABC --");
        System.out.println();
        System.out.println("--- Menu principal ---");
        System.out.println(" [1] consignaciones");
        System.out.println(" [2] Retiros");
        System.out.println(" [3] Consultar saldo");
        System.out.println(" [4] Salir");
        System.out.println();
        System.out.println("Por favor, escoja una opción: ");
        opcion = lea.next().charAt(0);
        return opcion;
    }

}
