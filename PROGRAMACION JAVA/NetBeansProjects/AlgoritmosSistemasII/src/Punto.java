//Tomas Cortes - Ingenieria Electro

public class Punto {

    private double x;
    private double y;

    public Punto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Punto(double pX, double pY) {
        this.x = pX;
        this.y = pY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
}
