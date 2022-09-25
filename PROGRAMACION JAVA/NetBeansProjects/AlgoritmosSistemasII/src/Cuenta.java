//Tomas Cortes - Ingenieria Electronica

public class Cuenta {

    private double saldo;

    public Cuenta() {
        this.saldo = 0.0;
    }

    public Cuenta(double cantidad) {
        
        if (cantidad >= 0) {
            this.saldo = cantidad;
        } else {
            System.out.println("El numero digitado no es valido");
        }
    }

    public void consignar(double cantidad) {
        if (cantidad >= 0) {
            saldo = saldo + cantidad;
        } else {
            System.out.println
            ("Por favor digite un numero con valores positivos");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad >= 0) {
            saldo = saldo - cantidad;
        } else {
            System.out.println
            ("Por favor digite un numero con valores positivos");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
