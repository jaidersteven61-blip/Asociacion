public class Libro {
    
    //Atributos privados - nadiee los puede tocar directamente desde afuera
    private String titulo;
    private String autor;
    private boolean disponible;


    //--CONSTRUCTORES--//

    // constructor vacio: el libro queda disponible por defecto
    public Libro() {
        disponible = true;
    }

    // constructor con titulo y autor: disponible por defecto
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    //--GETTERS--//

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    //--SETTERS--//

    public void setTitulo(String titulo) {
        // no aceptamos titulos vacios
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Error: el titulo no puede estar vacio");
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //--METODOS--//

    //imprime los datos del libro en consola
    public void mostrarInfo() {
        System.out.println("--Libro--");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Si" : "No"));
    }

    //Marca el libro como prestado
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado");
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" no esta disponible para prestar");
            return false;
        }
    }

    //Marca el libro como devuelto
    public void devolver() {
        disponible = true;
        System.out.println("El libro \"" + titulo + "\" ha sido devuelto");
    }

}