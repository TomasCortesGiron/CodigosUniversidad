//Tomas Cortes - Ingenieria Electronica

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private int numeroPaginas;

    public Libro() {
        this.isbn = "";
        this.titulo = "";
        this.autor = "";
        this.editorial = "";
        this.numeroPaginas = 0;
    }

    public Libro(String pIsbn, String pTitulo, String pAutor, String pEditorial,
            int pNumeroPaginas) {
        this.isbn = pIsbn;
        this.titulo = pTitulo;
        this.autor = pAutor;
        this.editorial = pEditorial;
        this.numeroPaginas = pNumeroPaginas;
    }

    public void setIsbn(String isbn) {
        if (numeroPaginas >= 0) {
            this.isbn = isbn;
        } else {
            System.out.println("El numero registrado no es valido");
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas >= 0) {
            this.numeroPaginas = numeroPaginas;
        } else {
            System.out.println("El numero registrado no es valido");
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo
                + ", autor=" + autor + ", editorial=" + editorial
                + ", numeroPaginas=" + numeroPaginas + '}';
    }
}
