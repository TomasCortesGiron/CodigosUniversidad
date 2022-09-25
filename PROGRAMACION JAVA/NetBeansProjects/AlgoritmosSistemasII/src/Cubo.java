//Tomas Cortes - Ingenieria Electronica

public class Cubo {

    //Atributos
    private double ancho;
    private double alto;
    private double largo;

    //Metodos
    public void calcularArea() {
        double a;
        a = ancho * largo * alto;
        System.out.println("El area del cubo es...");
    }

    public void calcularPerimetro() {
        double p;
        p = ancho + alto + largo;
        System.out.println("El area delperimetro es...");
    }

}
