class Usuario {
    String nombre;
    int id;
    int librosPrestados;

    public Usuario(String nombre, int id, int librosPrestados){
        this.nombre=nombre;
        this.id=id;
        this.librosPrestados=0;
    }

    public void prestarLibro(Libro libro){
        
        System.out.println("El usuario "+nombre+" toma el libro");       
        librosPrestados++;
    }
}