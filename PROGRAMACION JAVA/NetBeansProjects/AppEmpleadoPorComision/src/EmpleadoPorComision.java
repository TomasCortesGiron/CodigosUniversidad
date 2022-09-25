//Tomas Cortes - Ingenieria Electronica

public class EmpleadoPorComision extends Object {

    String primerNombre;
    String apellidoPaterno;
    String numeroSeguroSocial;
    double ventasBrutas;
    double tarifaComision;

    //Constructor con cinco argumentos
    public EmpleadoPorComision(String nombre, String apellido, String nss, 
            double ventas, double tarifa) {

        //La llamada implicita al constructor del objeto ocurre por aqui
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas(ventas);//Valida y almacena las ventas brutas
        establecerTarifaComision(tarifa);//Valida y almacena la tarifa comisión;
    }

    //Establece el primer nombre
    public void establecerPrimerNombre(String nombre) {
        primerNombre = nombre;
    }

    //Devuelve el primer nombre
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    //Establece el apellido paterno
    public void establecerApellidoPaterno(String apellido) {
        apellidoPaterno = apellido;
    }

    //Devuelve el apellido paterno
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public void establecerNumeroSocial(String nss) {
        numeroSeguroSocial = nss;
    }

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void establecerVentasBrutas(double ventas) {
        ventasBrutas = (ventas < 0.0) ? 0.0 : ventas;
    }

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    public void establecerTarifaComision(double tarifa) {
        tarifaComision = (tarifa > 0.0 && tarifa < 0.0) ? tarifa : 0.0;
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }

    public double ingresos() {
        return tarifaComision * ventasBrutas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" + "primerNombre="
                + primerNombre + ", apellidoPaterno=" + apellidoPaterno
                + ", numeroSeguroSocial=" + numeroSeguroSocial
                + ", ventasBrutas=" + ventasBrutas + ", tarifaComision="
                + tarifaComision + '}';
    }
}
