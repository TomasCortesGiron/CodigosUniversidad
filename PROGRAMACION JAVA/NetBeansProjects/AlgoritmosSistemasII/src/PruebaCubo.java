//Tomas Cortes - Ingenieria Electronica

public class PruebaCubo {

    public static void main(String[] args) {
        CuboParaPrueba unCubo = new CuboParaPrueba();
        System.out.println("Objeto inicializado " + unCubo.toString());

        CuboParaPrueba cubo1 = new CuboParaPrueba(3.5, 7.0, 8.0);
        CuboParaPrueba cubo2 = new CuboParaPrueba(1.7, 3.4, 10);

        System.out.println("Mi primer cubo es " + cubo1.toString());
        System.out.println("Mi segundo cubo es " + cubo2.toString());

        System.out.println("El perimetro de mi primer objeto es "
                + cubo1.calcularPerimetro());

        System.out.println("El perimetro de mi segundo objeto es "
                + cubo2.calcularPerimetro());

        System.out.println("El area de mi primer objeto es "
                + cubo1.calcularArea());

        System.out.println("El area de mi primer objeto es "
                + cubo2.calcularArea());

    }

}
