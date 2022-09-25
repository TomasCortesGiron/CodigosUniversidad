//Tomas Cortes - Ingenieria Electronica

import java.util.Scanner;

public class PruebaLibro {

    public static void main(String[] args) {

        String pIsbn, pTitulo, pAutor, pEditorial;
        int pNumeroPaginas;

        Libro unLibro = new Libro();
        System.out.println("El estado inicial de los lirbos son " + unLibro);

        Scanner lea = new Scanner(System.in);
        System.out.println("");

        System.out.println("Digite el isbn del libro: ");
        pIsbn = lea.nextLine();

        System.out.println("Digite el titulo del libro: ");
        pTitulo = lea.nextLine();

        System.out.println("Digite el nombre del autor: ");
        pAutor = lea.nextLine();

        System.out.println("Digite el nombre de la editorial: ");
        pEditorial = lea.nextLine();

        System.out.println("Digite el numero de paginas que posee el libro: ");
        pNumeroPaginas = lea.nextInt();

        Libro digitarLibro = new Libro(pIsbn, pTitulo, pAutor, pEditorial, 
                pNumeroPaginas);

        System.out.println("Los datos registrados son: "
                + digitarLibro);

    }
}
