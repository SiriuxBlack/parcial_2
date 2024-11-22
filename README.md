# parcial_2
1)Libro
Aqui definimos los atributos y hicimos el constructor
dentro de la clase hay distintos metodos los cuales son:
prestar: Marca el libro como prestado si no lo esta
devolver: Marca el libro como disponible si estaba prestado
isPrestado: Devuelve el estado de préstamo del libro
toString: Devuelve una representación en cadena del libro

2)Usuario 
definimos los atributos y hacemos el constructor 
dentro de esta clase estan los siguientes metodos:
prestarLibro(Libro libro): Permite al usuario pedir prestado un libro si no ha alcanzado el límite de libros prestados
devolverLibro(Libro libro): Permite al usuario devolver un libro prestado
toString: Devuelve una representación en cadena del usuario

3)GestionBiblioteca
en esta clase importamos una biblioteca (ArrayList)
con arrayList creamos dos array, una para libro y otra para usuario

creamos un metodo para registrar libros (registrarLibro)
en este metodo añadimos los libros al array correspondiente

creamos un metodo para registrar usuarios (registrarUsuario)
en este metodo hacemos lo mismo de que en el anterior solo que registramos los usuarios 

creamos un metodo que verifica la disponibilidad del libro
en este metodo creamos un ciclo for-each para recorrer la array libros y verificar el estado 
creamos un metodo que muestras el historial de los libro y los usuarios
usamos dos for para monstrar los correspondientes historiales 

4)App
creamos el objeto de gestion (GestionBiblioteca)
luego creamos dos objetos libros y dos objetos usuarios 
llamamos a los dos metodos (Registrar libros y registrar usuarios) 
seguido llamamos a los metodos de prestamo y devolucion de libros
despues el metodo de disponibilidad y por el ultimo el de mostrar el 
historial de la bibilioteca en general.

Gracias profe :D