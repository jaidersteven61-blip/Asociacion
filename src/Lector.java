public class Lector {
    
    private String nombre;
    private String Cedula;
    private Libro libroActual; // referencia a un objeto libro - puede ser null


    //--CONSTRUCTORES--//

    public Lector() {
        // constructor vacio
    }

    public Lector(String nombre, String Cedula) {
        this.nombre = nombre;
        this.Cedula = Cedula;
    }

    //--GETTERS--//

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public Libro getLibroActual() {
        return libroActual;
    }

    //--SETTERS--//

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    //Toma un libro prestado - llama al metodo prestar() del libro
    public void tomarPrestado(Libro libro) {
        if (libroActual != null) {
            System.out.println(nombre + " ya tiene el libro: \"" + libroActual.getTitulo() + " \". Debe devolverlo primero.");
        } else {
            if (libro.prestar()) {
                libroActual = libro;
                libroActual = libro;
            }
        }
    }


    //Devuelve el libo actual - llama al metodo devolver() del libro
    public void regresarLibro() {
        if (libroActual == null) {
            System.out.println(nombre + " no tiene ningun libro.");
        } else {
            libroActual.devolver();
            libroActual = null;
        }
    }

    //Muestra el estado del lector
    public void mostrarEstado() {
        String estadoLibro = (libroActual != null) ? libroActual.getTitulo() : "Sin libro";
        System.out.println("Lector: " + nombre + " | Libro: " + estadoLibro);
    }
}

//ASOCIACION SE DA EN DOS MOMENTOS:
//1. Cuando el lector toma prestado un libro, se establece la referencia al libro en el atributo libroActual del lector.
//2. Cuando el lector devuelve el libro, se elimina la referencia al libro en el atributo libroActual del lector, y el libro vuelve a estar disponible para otros lectores.