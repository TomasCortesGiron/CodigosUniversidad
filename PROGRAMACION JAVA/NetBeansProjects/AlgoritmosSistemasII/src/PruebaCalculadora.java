//Tomas Cortes - Ingenieria Electronica

public class PruebaCalculadora {

    public static void main(String[] args) {

        Calculadora unaCalculadora = new Calculadora();
        System.out.println("Inicializando el objeto " + unaCalculadora.toString());

        Calculadora casio = new Calculadora(5.6, 3.4);
        System.out.println("Los numeros a y b son: " + casio.toString());

        casio.calcularSuma();
        casio.calcularResta();
        casio.calcularMultiplicacion();
        casio.calcularDivision();

    }

}
