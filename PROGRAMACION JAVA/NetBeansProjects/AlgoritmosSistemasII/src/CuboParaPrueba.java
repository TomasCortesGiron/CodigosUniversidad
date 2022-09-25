//Tomas Cortes - Ingenieria Electronica 

public class CuboParaPrueba {

    //atributos
    private double ancho;
    private double largo;
    private double alto;

    //metodo inicializador
    public CuboParaPrueba() {
        this.ancho = 0.0;
        this.largo = 0.0;
        this.alto = 0.0;
    }

    //metodo constructor
    public CuboParaPrueba(double pAncho, double pLargo, double pAlto) {
        this.ancho = pAncho;
        this.largo = pLargo;
        this.alto = pAlto;
    }

    //metodos operadores
    public double calcularPerimetro() {
        //System.out.println("El perimetro es " + (ancho + largo + alto));
        return (ancho + largo + alto);
    }

    public double calcularArea() {
        //System.out.println("El area del cubo es " + (ancho * largo * ancho));
        return (ancho * largo * alto);
    }

    //metodo visualizador

    @Override
    public String toString() {
        return "CuboParaPrueba{" + "ancho=" + ancho + ", largo=" + largo 
                + ", alto=" + alto + '}';
    }
    

}
