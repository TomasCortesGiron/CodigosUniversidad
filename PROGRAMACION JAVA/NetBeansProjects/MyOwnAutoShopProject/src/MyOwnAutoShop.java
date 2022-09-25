//Tomas Cortes - Ingenieria Electronica

public class MyOwnAutoShop {

    public static void main(String[] args) {

        Sedan miSedan = new Sedan(22, 210, 9000, "rojo");
        System.out.println("El nuevo precio en euros es: "
                + miSedan.getSalePrice());

        Ford miFord1 = new Ford(2019, 250, 180, 36000, "Blanco");
        System.out.println("El nuevo precio en euros es: "
                + miFord1.getSalePrice());

        Ford miFord2 = new Ford(2018, 300, 160, 24700, "Azul");
        System.out.println("El nuevo precio en euros es: "
                + miFord2.getSalePrice());

        Truck miTruck = new Truck(900, 200, 20000, "verde");
        System.out.println("El nuevo precio en euros es: "
                + miTruck.getSalePrice());

        Car miCar = new Car(150, 24000, "negro");
        System.out.println("El nuevo precio en euros es: "
                + miCar.getSalePrice());
    }
}
