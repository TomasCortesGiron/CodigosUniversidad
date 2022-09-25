//Tomas Cortes - Ingenieria Electronica

public class Reloj {

    private int segundos;
    private int minutos;
    private int horas;

    public Reloj() {
        this.segundos = 0;
        this.minutos = 0;
        this.horas = 0;
    }

    public Reloj(int pSegundos, int pMinutos, int pHoras) {
        this.segundos = pSegundos;
        this.minutos = pMinutos;
        this.horas = pHoras;
    }

    public void conteo(int pSegundos, int pMinutos, int pHoras)
            throws InterruptedException {

        while (true) {

            //Mostrar
            if (pHoras < 10) {
                System.out.print("0");
            }

            System.out.print(pHoras + ":");

            if (pMinutos < 10) {
                System.out.print("0");
            }

            System.out.print(pMinutos + ":");

            if (pSegundos < 10) {
                System.out.print("0");
            }

            System.out.println(pSegundos);

            //Aumentar el tiempo.
            pSegundos++;

            //Comprovar el tiempo 
            if (pSegundos == 60) {
                pSegundos = 0;
                pMinutos++;

                if (pMinutos == 60) {
                    pMinutos = 0;
                    pHoras++;
                    if (pHoras == 24) {
                        pHoras = 0;
                    }
                }
            }

            Thread.sleep(1000);

        }

    }

    @Override
    public String toString() {
        return "Reloj{" + "segundos=" + segundos + ", minutos=" + minutos
                + ", horas=" + horas + '}';
    }

}
