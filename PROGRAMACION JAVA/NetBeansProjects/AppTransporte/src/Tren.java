//Tomas Cortes - Ingenieria Electronica

public class Tren extends Terrestre {

    private int vagones;
    private String tipoEnergia;

    public Tren(int vagones, String tipoEnergia, double horarios,
            String estaciones) {
        super(horarios, estaciones);
        this.vagones = vagones;
        this.tipoEnergia = tipoEnergia;
    }
}
