//Tomas Cortes - Ingenieria Electronica

public class Administrativo extends Empleado {

    private String funcion;
    private String ubicacionTrabajo;

    public Administrativo(String funcion, String ubicacionTrabajo,
            double Sueldo, int edad, int identificacion, String nombre) {
        super(Sueldo, edad, identificacion, nombre);
        this.funcion = funcion;
        this.ubicacionTrabajo = ubicacionTrabajo;
    }
}
