class Libro {
    String titulo;
    String autor;
    String isbn;
    boolean estado; 

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = false; 
    }

    public void prestar() {
        if (!estado) {
            estado = true;
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está prestado.");
        }
    }

    public void devolver() {
        if (estado) {
            estado = false;
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        } else {
            System.out.println("El libro '" + titulo + "' ya está disponible.");
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo + " por " + autor + " (ISBN: " + isbn + ")";
    }
}
