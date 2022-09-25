//Tomas Cortes - Ingenieria Electronica

public class PruebaTriangulo {

    public static void main(String[] args) {
        TrianguloParaPrueba unTriangulo = new TrianguloParaPrueba();
        System.out.println("Objeto inicializado " + unTriangulo.toString());

        TrianguloParaPrueba Triangulo1 = new TrianguloParaPrueba(4.5, 3.2);
        TrianguloParaPrueba Triangulo2 = new TrianguloParaPrueba(2.8, 5.4);

        System.out.println("Mi primer triangulo es " + Triangulo1.toString());
        System.out.println("Mi segundo triangulo es " + Triangulo2.toString());

        System.out.println("Triangulo 1: ");
        Triangulo1.calcularArea();
        System.out.println("Triangulo 2: ");
        Triangulo2.calcularArea();
        
    }
}
