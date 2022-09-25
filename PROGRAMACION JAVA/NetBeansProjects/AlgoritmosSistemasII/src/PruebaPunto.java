//Tomas Cortes - Ingenieria Electronica

public class PruebaPunto {
    public static void main(String[] args){
        Punto unPunto = new Punto();
        System.out.println("Estado inicial " + unPunto);
        
        // Primier cuadrante
        Punto miPunto = new Punto(3.0, 2.5);
        System.out.println("Cuardrante inicial (x,y) ->" + miPunto);
        
        //Cambio de cuadrande
        miPunto.setX(-4.0);
        System.out.println("Cuadrande (-x,y) ->" + miPunto 
                + ". Se actualizo la coordenada "+ miPunto.getX());
        
        miPunto.setY(-5.0);
        System.out.println("Cuadrande (-x,-y) ->" + miPunto 
                + ". Se actualizo la coordenada "+ miPunto.getY());
        
        miPunto.setX(2.0);
        System.out.println("Cuadrande (x,-y) ->" + miPunto 
                + ". Se actualizo la coordenada "+ miPunto.getX());
       
    }
}
