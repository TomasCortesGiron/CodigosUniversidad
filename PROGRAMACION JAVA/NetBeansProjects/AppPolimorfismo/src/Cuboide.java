//Tomas Cortes - Ingenieria Electronica

public class Cuboide {
    
    private double ancho;
    private double alto;
    private double profundo;
    
    public Cuboide(){
        this.ancho = 0;
        this.alto = 0;
        this.profundo = 0;
    }
    
    //Constructor con un parametro
    public Cuboide(double medida){
        this.ancho = medida;
        this.alto = medida;
        this.profundo = medida;
    }
    
    //Constructor con tres parametros
    public Cuboide(double ancho, double alto, double profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public double obtenerVolumen(){
        return ancho*alto*profundo;
    }
}
