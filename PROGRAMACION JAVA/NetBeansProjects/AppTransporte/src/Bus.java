//Tomas Cortes - Ingenieria Electronica

public class Bus extends Terrestre {

    private int pisos;
    private int llantas;

    public Bus(int pisos, int llantas, double horarios, String estaciones) {
        super(horarios, estaciones);
        this.pisos = pisos;
        this.llantas = llantas;
    }
}
