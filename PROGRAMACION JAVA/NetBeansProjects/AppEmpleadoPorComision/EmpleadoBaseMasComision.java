//Tomas Cortes - Ingenieria Electronica

// Fig. 9.6: EmpleadoBaseMasComision.java 
// La clase EmpleadoBaseMasComision representa a un empleado que recibe
// un salario base, además de la comisión.

public class EmpleadoBaseMasComision{
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión
    private double salarioBase; // salario base por semana
 
    // constructor con seis argumentos
    public EmpleadoBaseMasComision( String nombre, String apellido,
    String nss, double ventas, double tarifa, double salario )
    {

    // la llamada implícita al constructor de Object ocurre aquí
    primerNombre = nombre;
    apellidoPaterno = apellido;
    numeroSeguroSocial = nss;
    establecerVentasBrutas( ventas ); // valida y almacena las ventas brutas
    establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comisión
    establecerSalarioBase( salario ); // valida y almacena el salario base
    } // fin del constructor de EmpleadoBaseMasComision con seis argumentos
    
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
    
    // establece el salario base
    public void establecerSalarioBase( double salario )
    {
        salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
    } // fin del método establecerSalarioBase
    
    // devuelve el salario base
    public double obtenerSalarioBase()
    {
        return salarioBase;
    } // fin del método obtenerSalarioBase
    
    // calcula los ingresos
    public double ingresos()
    {
        return salarioBase + ( tarifaComision * ventasBrutas );
    } //fin del método ingresos
    
    // devuelve representación String de EmpleadoBaseMasComision
    public String toString()
    {
    return String.format(
    "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
    "empleado por comision con sueldo base", primerNombre, apellidoPaterno,
    "numero de seguro social", numeroSeguroSocial,
    "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision,
    "salario base", salarioBase );
    } // fin del método toString
    } // fin de la clase EmpleadoBaseMasComision