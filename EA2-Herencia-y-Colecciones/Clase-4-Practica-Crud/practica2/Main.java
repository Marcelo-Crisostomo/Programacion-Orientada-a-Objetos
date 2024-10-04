import java.util.Scanner;

// Clase principal que maneja la interacción con el usuario
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase Gimnasio
        Gimnasio gimnasio = new Gimnasio();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle que mantiene el menú activo hasta que el usuario elija salir
        do {
            // Mostrar las opciones del menú
            System.out.println("Menú de Gestión de Alumnos del Gimnasio");
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Mostrar Alumnos");
            System.out.println("3. Actualizar Alumno");
            System.out.println("4. Eliminar Alumno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción seleccionada por el usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            // Ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    gimnasio.agregarAlumno(); // Llama al método para agregar un alumno
                    break;
                case 2:
                    gimnasio.mostrarAlumnos(); // Llama al método para mostrar alumnos
                    break;
                case 3:
                    gimnasio.actualizarAlumno(); // Llama al método para actualizar un alumno
                    break;
                case 4:
                    gimnasio.eliminarAlumno(); // Llama al método para eliminar un alumno
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    break;
                default:
                    // Mensaje en caso de que se elija una opción no válida
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5); // Repite el menú hasta que el usuario elija salir
    }
}
