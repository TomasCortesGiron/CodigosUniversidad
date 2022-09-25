//Tomas Cortes - Ingenieria Electronica

public class Car {

    private int speed;
    double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;

    }

    public double getSalePrice() {

        System.out.println("El auto posee una velocidad de "
                + speed + " fts, con un precio regular de "
                + regularPrice + " y con un color " + color);

        regularPrice = regularPrice;

        return regularPrice;
    }
}

