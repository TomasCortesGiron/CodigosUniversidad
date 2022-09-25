//Tomas Cortes - Ingenieria Electroncia

public class SobreCargaConstructor {
    
    public static void main (String[] args){
        //Se define tres instancias de la clase Cubo
        Cuboide cubo1 = new Cuboide();
        Cuboide cubo2 = new Cuboide(7);
        Cuboide cubo3 = new Cuboide(10, 20, 15);
        //Se define el atributo volumen de tipo double
        
        double volumen = 0.0;
        volumen = cubo1.obtenerVolumen();
        System.out.println("El volumen del cubo1 es: " + volumen);
        volumen = cubo2.obtenerVolumen();
        System.out.println("El volumen del cubo2 es: " + volumen);
        volumen = cubo3.obtenerVolumen();
        System.out.println("El volumen del cubo3 es: " + volumen);
    }
}
