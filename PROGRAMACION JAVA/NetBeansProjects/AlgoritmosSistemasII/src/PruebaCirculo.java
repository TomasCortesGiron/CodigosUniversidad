//Tomas Cortes - Ingenieria Electronica

public class PruebaCirculo {

    public static void main(String[] args) {
        CirculoParaPrueba unCirculo = new CirculoParaPrueba();
        System.out.println("Objeto inicializado " + unCirculo.toString());

        CirculoParaPrueba Circulo1 = new CirculoParaPrueba(3.4);
        CirculoParaPrueba Circulo2 = new CirculoParaPrueba(7.2);

        System.out.println("Mi primer circulo es " + Circulo1.toString());
        System.out.println("Mi segundo circulo es " + Circulo2.toString());

        System.out.println("Area Circulo 1: " + Circulo1.calcularArea());
        System.out.println("Area Circulo 2: " + Circulo2.calcularArea());

    }

}
