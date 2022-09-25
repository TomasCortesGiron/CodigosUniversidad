//Tomas Cortes - Ingenieria Electronica

public class Repaso {
    
    private double a;
    private double b;
    
    public Repaso(){
        this.a = 0.0;
        this.b = 0.0;
    }
    
    public Repaso(double pa, double pb){
        this.a = pa;
        this.b = pb;
    }
    
    public void Sumar (double pa, double pb){
        System.out.println("El valor sumado de los dos datos son: " + (pa+pb));
        
    }
    
    public void Restar (double pa, double pb){
        System.out.println("El valor restado de los dos datos son: " + (pa-pb));
        
    }
    public void Multiplicar (double pa, double pb){
        System.out.println("El valor multiplicado de los dos datos son: " + pa*pb);
        
    }
    public void Dividir (double pa, double pb){
        System.out.println("El valor dividido de los dos datos son: " + pa/pb);
        
    }

    @Override
    public String toString() {
        return "Repaso{" + "a=" + a + ", b=" + b + '}';
    }
    
    
}
