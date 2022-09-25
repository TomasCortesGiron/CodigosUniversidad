//Tomas Cortes - Ingenieria Electronica

public class Profesor extends Empleado {

    private String area;
    private String categoria;

    public Profesor(String area, String categoria, double Sueldo, int edad, 
            int identificacion, String nombre) {
        super(Sueldo, edad, identificacion, nombre);
        this.area = area;
        this.categoria = categoria;
    }
}
