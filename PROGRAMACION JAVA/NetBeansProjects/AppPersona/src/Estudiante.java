//Tomas Cortes - Ingenieria Electronica

public class Estudiante extends Persona {

    private String carrera;
    private int semestre;

    public Estudiante(String carrera, int semestre, int identificacion, 
            String nombre) {
        super(identificacion, nombre);
        this.carrera = carrera;
        this.semestre = semestre;
    }
}
