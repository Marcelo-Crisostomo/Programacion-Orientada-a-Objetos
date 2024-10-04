import java.util.ArrayList;
import java.util.Scanner;

// Definición de la clase Gimnasio
public class Gimnasio {
    // Lista que almacena los alumnos inscritos
    private ArrayList<Alumno> alumnos;
    // Scanner para leer las entradas del usuario
    private Scanner scanner;

    // Constructor que inicializa la lista de alumnos y el objeto Scanner
    public Gimnasio() {
        alumnos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Método para agregar un alumno a la lista
    public void agregarAlumno() {
        // Solicita al usuario ingresar los datos del alumno
        System.out.println("Ingrese el ID del alumno:");
        int id = leerIdValido(); // Validación del ID (debe ser positivo)

        System.out.println("Ingrese el nombre completo del alumno:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del alumno:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea

        System.out.println("Ingrese el tipo de membresía (Mensual, Trimestral, Anual):");
        String membresia = scanner.nextLine();

        // Crea un nuevo objeto Alumno y lo agrega a la lista
        Alumno nuevoAlumno = new Alumno(id, nombre, edad, membresia);
        alumnos.add(nuevoAlumno);

        // Confirma que el alumno fue agregado
        System.out.println("Alumno agregado exitosamente.");
    }

    // Método para mostrar todos los alumnos
    public void mostrarAlumnos() {
        // Verifica si hay alumnos en la lista
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos inscritos.");
        } else {
            // Recorre y muestra cada alumno usando el método toString()
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }

    // Método para actualizar un alumno existente
    public void actualizarAlumno() {
        // Solicita el ID del alumno a actualizar
        System.out.println("Ingrese el ID del alumno que desea actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea

        // Busca al alumno en la lista por su ID
        Alumno alumno = buscarAlumnoPorId(id);

        // Si el alumno es encontrado, se actualizan sus datos
        if (alumno != null) {
            System.out.println("Ingrese el nuevo nombre completo del alumno:");
            String nuevoNombre = scanner.nextLine();

            System.out.println("Ingrese la nueva edad del alumno:");
            int nuevaEdad = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            System.out.println("Ingrese el nuevo tipo de membresía:");
            String nuevaMembresia = scanner.nextLine();

            // Actualiza los valores
            alumno.setNombre(nuevoNombre);
            alumno.setEdad(nuevaEdad);
            alumno.setMembresia(nuevaMembresia);

            System.out.println("Alumno actualizado exitosamente.");
        } else {
            // Mensaje de error si no se encuentra el alumno
            System.out.println("Alumno no encontrado.");
        }
    }

    // Método para eliminar un alumno
    public void eliminarAlumno() {
        // Solicita el ID del alumno a eliminar
        System.out.println("Ingrese el ID del alumno que desea eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea

        // Busca al alumno en la lista
        Alumno alumno = buscarAlumnoPorId(id);

        // Si el alumno es encontrado, se elimina de la lista
        if (alumno != null) {
            alumnos.remove(alumno);
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            // Mensaje de error si no se encuentra el alumno
            System.out.println("Alumno no encontrado.");
        }
    }

    // Método privado para buscar un alumno por ID
    private Alumno buscarAlumnoPorId(int id) {
        // Recorre la lista buscando el alumno por su ID
        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                return alumno; // Devuelve el alumno si se encuentra
            }
        }
        return null; // Retorna null si no se encuentra el alumno
    }

    // Método privado para validar que el ID sea positivo
    private int leerIdValido() {
        int id;
        // Ciclo para validar el ID
        do {
            // Lee el ID ingresado
            id = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea
            if (id <= 0) {
                System.out.println("El ID debe ser un número positivo. Intente nuevamente:");
            }
        } while (id <= 0); // Repite hasta que el ID sea válido

        return id; // Retorna el ID válido
    }
}
