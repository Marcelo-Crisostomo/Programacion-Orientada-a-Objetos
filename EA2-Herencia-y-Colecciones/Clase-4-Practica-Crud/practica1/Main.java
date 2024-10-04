import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creo objeto (instancia de gimnasio y scanner)
        Gimnasio gimnasio = new Gimnasio();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        //menú
        do {
            System.out.println("\n--- Menú de Gestión de Alumnos ---");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Actualizar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gimnasio.agregarAlumno();
                    break;
                case 2:
                    gimnasio.mostrarAlumnos();
                    break;
                case 3:
                    gimnasio.actualizarAlumno();
                    break;
                case 4:
                    gimnasio.eliminarAlumno();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}
