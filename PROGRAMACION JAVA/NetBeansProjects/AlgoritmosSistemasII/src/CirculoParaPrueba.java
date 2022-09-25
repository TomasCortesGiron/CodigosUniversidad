//Tomas Cortes - Ingenieria Electronica

public class CirculoParaPrueba {

    private double radio;

    public CirculoParaPrueba() {
        this.radio = 0;
    }

    public CirculoParaPrueba(double pRadio) {
        this.radio = pRadio;
    }

    public double calcularArea() {
        double area;
        area = Math.PI * (radio * radio);
        return area;
    }

    @Override
    public String toString() {
        return "CirculoParaPrueba{" + "radio=" + radio + '}';
    }

}
