import java.util.ArrayList;

class GestionBiblioteca {
    ArrayList<Libro> libros;
    ArrayList<Usuario> usuarios;

    public GestionBiblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void registrarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro registrado: " + libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado: " + usuario);
    }

    public void verificarDisponibilidad(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isEstado()) {
                    System.out.println("El libro '" + titulo + "' está disponible.");
                } else {
                    System.out.println("El libro '" + titulo + "' está prestado.");
                }
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }

    public void mostrarHistorial() {
        System.out.println("=== Historial de Libros Registrados ===");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("\n=== Usuarios Registrados ===");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}

