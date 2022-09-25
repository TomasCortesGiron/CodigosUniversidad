//Tomas Cortes - Ingenieria Electronica

public class TablaMultiplicar {
    
    private int n;
    
    public TablaMultiplicar(){
        this.n = 0;
    }
    
    public TablaMultiplicar(int pN){
        this.n = pN;
       
    }
    
    public void generarTabla(int pN){
        for (int i = 0; i <= 10; i++){
        System.out.println( n + "*" + i + " = " + n*i);
    }
    }

    @Override
    public String toString() {
        return "TablaMultiplicar{" + "n=" + n + '}';
    }  
}
