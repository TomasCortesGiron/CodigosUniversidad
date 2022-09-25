//Tomas Cortes - Ingenieria Electronica

public class DemoCirculo {
    
    public static void main(String[]args){
        double r = 5;
        Circulo unCirculo = new Circulo(r);
        System.out.println("Longitud del circulo " 
                + unCirculo.calcularPerimetro());
        System.out.println("Area del circulo " + unCirculo.calcularArea());
    }
    
}
