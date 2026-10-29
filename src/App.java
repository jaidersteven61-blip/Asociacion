public class App {
    public static void main(String[] args) throws Exception {
    Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
    Libro libro2 = new Libro("El principlito", "Antoine de Saint-Exupéry");

    //Lectores
    Lector lector1 = new Lector("Ana Torres", "1001234567");
    Lector lector2 = new Lector("Carlos Ruiz", "1009876543");

    //cada lector toma un libro
    lector1.tomarPrestado(libro1);
    lector2.tomarPrestado(libro2);

    System.out.println();
    lector1.mostrarEstado();
    lector2.mostrarEstado();

    //intento de tomar otro libro sin devolver el actual
    System.out.println();
    lector1.tomarPrestado(libro2);

    //lector1 devuelve
    }
}
