class Usuario {
    String nombre;
    int id;
    int maxlibrosPrestados;
    int librosPrestados;

    public Usuario(String nombre, int id, int maxlibrosPrestados) {
        this.nombre = nombre;
        this.id = id;
        this.maxlibrosPrestados = 2;
        this.librosPrestados = 0; 
    }

    public void prestarLibro(Libro libro) {
        if (librosPrestados < maxlibrosPrestados) {
            if (!libro.isEstado()) {
                libro.prestar();
                librosPrestados++;
            } else {
                System.out.println("El libro ya está prestado.");
            }
        } else {
            System.out.println("El usuario " + nombre + " ha alcanzado el límite de libros prestados.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (libro.isEstado()) {
            libro.devolver();
            librosPrestados--;
        } else {
            System.out.println("Este libro no estaba prestado por el usuario.");
        }
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " (ID: " + id + ")";
    }
}