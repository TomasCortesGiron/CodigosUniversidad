//Tomas Cortes - Ingenieria Electronica

public class TrianguloParaPrueba {
    
    //atributos
    private double base;
    private double altura;
    
    //metodo inicializador
    public TrianguloParaPrueba() {
        this.base = 0.0;
        this.altura = 0.0;
    }
    
    //metodo constructor
    public TrianguloParaPrueba(double pBase, double pAltura) {
        this.base = pBase;
        this.altura = pAltura;
    }
    
    //metodos operadores
    public void calcularArea(){
        double area; //variable local
        area = (base * altura)/2;
        System.out.println("El area es " + area);
    }

    //metodo visualizador
    @Override
    public String toString() {
        return "TrianguloParaPrueba{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
