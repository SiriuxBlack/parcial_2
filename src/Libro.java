class Libro {
    String titulo;
    String autor;
    int isbn;
    boolean estado;

    public Libro (String titulo, String autor, int isbn, boolean estado){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.estado=true;
    }

    public void prestar(){
        if (estado) {
            estado=false;
            System.out.println("El libro "+titulo+" ha sido prestado");
        } else {
            System.out.println("El libro "+titulo+" ya esta prestado");
        }
    }

    public void devolver(){
        if (!estado) {
            estado=true;
            System.out.println("El libro "+titulo+" ha sido devuelto");
        } 
    }
}
