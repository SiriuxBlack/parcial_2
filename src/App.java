public class App {
    public static void main(String[] args) throws Exception {
        GestionBiblioteca gestion = new GestionBiblioteca();

        // Crear libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "12345");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "67890");

        // Crear usuarios
        Usuario usuario1 = new Usuario("Sebastian Ropero", 1, 3);
        Usuario usuario2 = new Usuario("Miguel Santos", 2, 2);

        // Registrar libros y usuarios
        gestion.registrarLibro(libro1);
        gestion.registrarLibro(libro2);
        gestion.registrarUsuario(usuario1);
        gestion.registrarUsuario(usuario2);

        // Pruebas de préstamo y devolución
        usuario1.prestarLibro(libro1);
        usuario1.prestarLibro(libro2);
        usuario1.devolverLibro(libro1);

        // Verificar disponibilidad
        gestion.verificarDisponibilidad("El Quijote");

        // Mostrar historial
        gestion.mostrarHistorial();
    }
}
