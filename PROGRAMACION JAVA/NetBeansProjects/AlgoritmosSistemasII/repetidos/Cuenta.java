//Tomas Cortes - Ingenieria Electronica

public class Cuenta {

    private String usuario;
    private String clave;

    public Cuenta() {
        this.usuario = " ";
        this.clave = " ";
    }

    public Cuenta(String pUsuario, String pClave) {
        this.usuario = pUsuario;
        this.clave = pClave;
    }

    public void validarCuenta() {
        System.out.println("----Ingresando al sistema----");
        System.out.println("-------Datos de cuenta-------");
        System.out.println("Usuario: " + usuario);
        System.out.println("Clave: " + clave);
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Cuenta{" + "usuario=" + usuario + ", clave=" + clave + '}';
    }
}
