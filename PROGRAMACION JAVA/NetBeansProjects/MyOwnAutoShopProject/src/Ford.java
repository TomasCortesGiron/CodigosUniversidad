//Tomas Cortes - Ingenieria Electronica

public class Ford extends Car {

    private int year;
    private int manufactureDiscount;

    public Ford(int year, int manufactureDiscount, int speed, 
            double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;

        System.out.println("El auto de marca Ford modelo "
                + year + ", con una velocidad de " + speed
                + " fts, con un precio regular de "
                + regularPrice + " y con un color " + color);
    }

    @Override
    public double getSalePrice() {

        regularPrice = regularPrice - manufactureDiscount;

        return regularPrice;
    }
}
