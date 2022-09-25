//Tomas Cortes - Ingenieria Electronica 

// Fig. 9.11: PruebaEmpleadoBaseMasComision3.java
// Prueba de la clase EmpleadoBaseMasComision3.

public class PruebaEmpleadoBaseMasComision3
{
    public static void main( String args[] )
    {
    // crea instancia de un objeto EmpleadoBaseMasComision3
    EmpleadoBaseMasComision3 empleado =
    new EmpleadoBaseMasComision3(
    "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
    
    // obtiene datos del empleado por comision con sueldo base
    System.out.println(
    "Informacion del empleado, obtenida por los metodos establecer: \n" );
    System.out.printf( "%s %s\n", "El primer nombre es",
        empleadoBaseMasComision.obtenerPrimerNombre() );
    System.out.printf( "%s %s\n", "El apellido es",
        empleadoBaseMasComision.obtenerApellidoPaterno() );
    System.out.printf( "%s %s\n", "El numero de seguro social es",
        empleadoBaseMasComision.obtenerNumeroSeguroSocial() );
    System.out.printf( "%s %.2f\n", "Las ventas brutas son",
        empleadoBaseMasComision.obtenerVentasBrutas() );
    System.out.printf( "%s %.2f\n", "La tarifa de comision es",
        empleadoBaseMasComision.obtenerTarifaComision() );
    System.out.printf( "%s %.2f\n", "El salario base es",
        empleadoBaseMasComision.obtenerSalarioBase() );

    empleadoBaseMasComision.establecerSalarioBase( 1000 ); // establece el salario base

    System.out.printf( "\n%s:\n\n%s\n",
    "Informacion actualizada del empleado, obtenida por toString",
        empleadoBaseMasComision.toString() );
    } // fin de main
    } // fin de la clase PruebaEmpleadoBaseMasComision3
