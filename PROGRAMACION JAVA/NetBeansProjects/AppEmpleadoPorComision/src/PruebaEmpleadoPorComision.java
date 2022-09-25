//Tomas Cortes - Ingenieria Electronica

public class PruebaEmpleadoPorComision {
    
    public static void main(String args[]){
        
        EmpleadoPorComision empleado = new EmpleadoPorComision("Tomas",
                "Cortes", "1000350463", 64000, .07);
        
        // obtiene datos del empleado por comisión
        System.out.println(
        "Informacion del empleado obtenida por los metodos establecer: \n" );
        System.out.printf( "%s %s\n", "El primer nombre es",
        empleado.obtenerPrimerNombre() );
        System.out.printf( "%s %s\n", "El apellido paterno es",
        empleado.obtenerApellidoPaterno() );
        System.out.printf( "%s %s\n", "El numero de seguro social es",
        empleado.obtenerNumeroSeguroSocial() );
        System.out.printf( "%s %.2f\n", "Las ventas brutas son",
        empleado.obtenerVentasBrutas() );
        System.out.printf( "%s %.2f\n", "La tarifa de comision es",
        empleado.obtenerTarifaComision() );
    }
    
}
