//Tomas Cortes - Ingenieria Electronica

public class Empleado extends Persona {

    private double Sueldo;
    private int edad;

    public Empleado(double Sueldo, int edad, int identificacion, String nombre){
        super(identificacion, nombre);
        this.Sueldo = Sueldo;
        this.edad = edad;
    }
}
