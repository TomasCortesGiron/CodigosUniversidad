//Tomas Cortes - Ingieria Electronica

// Fig. 9.9: EmpleadoPorComision2.java
// La clase EmpleadoPorComision2 representa a un empleado por comisión.

public class EmpleadoPorComision2
{
    protected String primerNombre;
    protected String apellidoPaterno;
    protected String numeroSeguroSocial;
    protected double ventasBrutas; // ventas totales por semana
    protected double tarifaComision; // porcentaje de comisión

    // constructor con cinco argumentos
    public EmpleadoPorComision2( String nombre, String apellido, String nss,
    double ventas, double tarifa )
    {
    // la llamada implícita al constructor del objeto ocurre aquí
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas( ventas ); // valida y almacena las ventas brutas
        establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comisión
    } // fin del constructor de EmpleadoPorComision2 con cinco argumentos

    // establece el primer nombre
    public void establecerPrimerNombre( String nombre )
    {
        primerNombre = nombre;
    } // fin del método establecerPrimerNombre
    
    // devuelve el primer nombre
    public String obtenerPrimerNombre()
    {
        return primerNombre;
    } // fin del método obtenerPrimerNombre
    
    // establece el apellido paterno
    public void establecerApellidoPaterno( String apellido )
    {
        apellidoPaterno = apellido;
    } // fin del método establecerApellidoPaterno
    
    // devuelve el apellido paterno
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    } // fin del método obtenerApellidoPaterno

    // establece el número de seguro social
    public void establecerNumeroSeguroSocial( String nss )
    {
        numeroSeguroSocial = nss; // debe validar
    } // fin del método establecerNumeroSeguroSocial

    // devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial()
    {
        return numeroSeguroSocial;
    } // fin del método obtenerNumeroSeguroSocial
    
    // establece el monto de ventas brutas
    public void establecerVentasBrutas( double ventas )
    {
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    } // fin del método establecerVentasBrutas

    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    } // fin del método obtenerVentasBrutas
    
    // establece la tarifa de comisión
    public void establecerTarifaComision( double tarifa )
    {
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    } // fin del método establecerTarifaComision

    // devuelve la tarifa de comisión
    public double obtenerTarifaComision()
    {
        return tarifaComision;
    } // fin del método obtenerTarifaComision

    // calcula los ingresos
    public double ingresos()
    {
        return tarifaComision * ventasBrutas;
    } // fin del método ingresos

    // devuelve representación String del objeto EmpleadoPorComision2
    public String toString()
    {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
        "empleado por comision", primerNombre, apellidoPaterno,
        "numero de seguro social", numeroSeguroSocial, 
        "ventas brutas", ventasBrutas,
        "tarifa de comision", tarifaComision );
    } // fin del método toString
    } // fin de la clase EmpleadoPorComision2
