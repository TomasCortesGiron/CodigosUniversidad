//Tomas Cortes - Ingenieria Electronica;

public class PruebaSuma {

    public static void main(String[] args) {
        Suma miSuma = new Suma();
        System.out.println("Primera suma: " + miSuma.obtenerSuma("2.5", "10"));
        System.out.println("Segunda suma: " + miSuma.obtenerSuma(4, 3.4));
        System.out.println("Tercera suma: " + miSuma.obtenerSuma(3, 1, 3.5));
    }
}
