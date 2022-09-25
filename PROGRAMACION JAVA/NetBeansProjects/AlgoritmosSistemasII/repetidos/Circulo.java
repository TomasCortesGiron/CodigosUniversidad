//Tomas Cortes - Ingenieria Electronica

public class Circulo {

    private double radio;

    public Circulo() {
        this.radio = 0.0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 2 * Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return Math.PI * radio * radio;
    }

}
