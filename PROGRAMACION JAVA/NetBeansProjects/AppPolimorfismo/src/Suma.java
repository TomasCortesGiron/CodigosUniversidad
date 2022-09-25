//Tomas Cortes - Ingenieria Electronica

public class Suma {

    //Metodos sobrecargados
    double obtenerSuma(String x, String y) {
        double xa = Double.parseDouble(x);
        double ya = Double.parseDouble(y);
        return xa + ya;
    }

    double obtenerSuma(double x, double y) {
        return x + y;
    }

    double obtenerSuma(double x, double y, double z) {
        return x + y + z;
    }
}
