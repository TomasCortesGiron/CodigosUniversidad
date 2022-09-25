//Tomas Cortes - Ingenieria Electronica

public class PruebaAutomovil {

    public static void main(String[] args) {
        Automovil unAutomovil = new Automovil();
        System.out.println("Inicializando el objeto " + unAutomovil.toString());

        Automovil miAuto = new Automovil("TOM-774", "Mazda", 2019, "Rojo", 8600);
        System.out.println("Mi automovil es " + miAuto.toString());

        Automovil autoBenjamin = new Automovil("ESE-412", "Ford Fiesta", 2018, "Blanco", 7800);
        System.out.println("El automovil de Benjamin es " + autoBenjamin.toString());
    }

}
