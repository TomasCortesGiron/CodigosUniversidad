//Tomas Cortes - Ingenieria Electronica

public class Cadenas {

    public static void main(String[] args) {
        //Cadena 1 (concatenacion 1):
        String cad1 = "Hola";
        String cad2 = " mundo";
        String salida = cad1 + cad2;
        System.out.println("La cadena 1 dice: " + salida);

        //Cadena 2 (concatenacion 2):
        String nombre = "Juan Carlos";
        nombre += "Bustamante";
        System.out.println(nombre);

        //Cadena 3 (longitud): 
        String Nombre = "Allan Brito";
        int longitud = Nombre.length();

        //Cadena 4 (equals-comparacion):
        String cadena1 = "Telecomunicaciones";
        String cadena2 = new String("Telecomunicaciones");
        if (cadena1.equals(cadena2)) {
            System.out.println("Cadenas de igual contenido");
        } else {
            System.out.println("Cadenas diferentes");
        }

        //Cadena 5 (comparacion sin tomar las mayusculas en cuenta):
        String password = "ABC123";
        if (password.equals("abc123")) {
            System.out.println("Clave correcta");
        } else {
            System.out.println("Clave errada");
        }

        //Cadena 6(iniciales iguales/diferentes):
        String parametro = "192.168.100.2";
        if (parametro.startsWith(".co")) {
            System.out.println("La direccion " + parametro);
        } else {
            System.out.println("El parametro no es una ip");
        }

        //Cadena 7 (ultimos datos iguales/diferentes):
        String url = "https://www.usergioarboleda.edu.co";
        if (url.endsWith(".co")) {
            System.out.println("Pagina colombiana");
        } else {
            System.out.println("Pagina extranjera");
        }
    }
}
