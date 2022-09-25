//Tomas Cortes - Ingenieria Electronica

public class Truck extends Car {

    private int weight;

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;

        System.out.println("El auto de marca Truck posee un peso de "
                + weight + ",con una velocidad de " + speed
                + " fts, con un precio regular de "
                + regularPrice + " y con un color " + color);
    }

    @Override
    public double getSalePrice() {

        if (weight > 2000) {

            regularPrice = regularPrice - (regularPrice * 0.2);

        } else {

            regularPrice = regularPrice - (regularPrice * 0.1);

        }
        return regularPrice;
    }
}
