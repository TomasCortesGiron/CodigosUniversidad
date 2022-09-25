//Tomas Cortes - Ingieria Electronica

public class Sedan extends Car {

    private int length;

    public Sedan(int length, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.length = length;

        System.out.println("El auto de marca Sedan posee una longitud "
                + length + ",con una velocidad de " + speed
                + " fts, con un precio regular de "
                + regularPrice + " y con un color " + color);
    }

    @Override
    public double getSalePrice() {

        if (length > 20) {

            regularPrice = regularPrice - (regularPrice * 0.05);

        } else {

            regularPrice = regularPrice - (regularPrice * 0.1);

        }

        return regularPrice;
    }
}
