//Tomas Cortes - Ingenieria Electronica

public class Calculadora {

    //atributos
    private double a;
    private double b;

    //metodo inicializador
    public Calculadora() {
        this.a = 0.0;
        this.b = 0.0;
    }

    //metodo constructor
    public Calculadora(double pa, double pb) {
        this.a = pa;
        this.b = pb;
    }

    public double calcularSuma() {
        System.out.println("La suma de a y b es:" + (a + b));
        return (a + b);
    }

    public double calcularResta() {
        System.out.println("La resta de a y b es:" + (a - b));
        return (a - b);
    }

    public double calcularMultiplicacion() {
        System.out.println("La multiplicacion de a y b es:" + (a * b));
        return (a * b);
    }

    public double calcularDivision() {
        System.out.println("La division de a y b es:" + (a / b));
        return (a / b);
    }

    @Override
    public String toString() {
        return "Calculadora{" + "a=" + a + ", b=" + b + '}';
    }

}
