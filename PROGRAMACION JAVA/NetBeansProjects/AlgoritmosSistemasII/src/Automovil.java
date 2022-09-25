//Tomas Cortes - Ingenieria Electronica

public class Automovil {

    //atributos
    private String placa;
    private String marca;
    private int modelo;
    private String color;
    private double precio;

    //metodo inicializador
    public Automovil() {
        this.placa = "";
        this.marca = "";
        this.modelo = 0;
        this.color = "";
        this.precio = 0.0;
    }

    //metodo constructor
    public Automovil(String pPlaca, String pMarca, int pModelo, String pColor,
           double pPrecio) {
        this.placa = pPlaca;
        this.marca = pMarca;
        this.modelo = pModelo;
        this.color = pColor;
        this.precio = pPrecio;
    }

    public void acelerar() {
        System.out.println("Acelerando...");

    }

    public void frenar() {
        System.out.println("frenando...");
    }

    public void retroceder() {
        System.out.println("retrocediendo...");
    }

    @Override
    public String toString() {
        return "Automovil{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + '}';
    }

}
