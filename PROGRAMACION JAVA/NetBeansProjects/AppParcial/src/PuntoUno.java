//Tomas Cortes - Ingenieria Electronica

public class PuntoUno {

    public int longitud(String cad) {

        String cadSinEspacios = "";

        for (int x = 0; x < cad.length(); x++) {
            if (cad.charAt(x) != ' ') {
                cadSinEspacios += cad.charAt(x);
            }
        }

        int longitud = cadSinEspacios.length();

        return longitud;
    }

    public void repetidos(String cad) {

        char[] letras;
        char letraMasRepetida = 0;
        int mayorRepeticion = 0;
        String cadMin;

        cadMin = cad.toLowerCase();

        letras = cadMin.toCharArray();

        for (int i = 0; i < letras.length; i++) {

            char letraActual = letras[i];
            int contador = 0;

            for (int j = 0; j < letras.length; j++) {

                if (letras[j] == letraActual) {
                    contador++;
                }

            }
            if (mayorRepeticion < contador) {
                mayorRepeticion = contador;
                letraMasRepetida = letraActual;
            }

        }

        System.out.println("La letra mas repetida es: " + letraMasRepetida
                + " y se presenta " + mayorRepeticion + " veces");
    }
}
