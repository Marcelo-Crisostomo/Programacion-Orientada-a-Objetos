import java.util.ArrayList;
import java.util.Scanner;

public class Gimnasio {
    private ArrayList<Alumno> alumnos;
    private Scanner scanner;
 //Inicializamos el aaraylist y scanner
    public Gimnasio() {
        alumnos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    //Agregarr
    public void agregarAlumno() {
        System.out.println("Ingrese el ID del alumno:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del alumno:");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el tipo de membresía (Mensual, Trimestral, Anual):");
        String membresia = scanner.nextLine();

        Alumno alumno = new Alumno(id, nombre, edad, membresia);
        alumnos.add(alumno);
        System.out.println("Alumno agregado exitosamente.");
    }
    //Mostrar
    public void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos inscritos en el gimnasio.");
        } else {
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }
    //Actualizar update
    public void actualizarAlumno() {
        System.out.println("Ingrese el ID del alumno que desea actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                System.out.println("Ingrese el nuevo nombre del alumno:");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese la nueva edad del alumno:");
                int nuevaEdad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese la nueva membresía del alumno:");
                String nuevaMembresia = scanner.nextLine();

                alumno.setNombre(nuevoNombre);
                alumno.setEdad(nuevaEdad);
                alumno.setMembresia(nuevaMembresia);
                System.out.println("Alumno actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }
//Delete eliminar
    public void eliminarAlumno() {
        System.out.println("Ingrese el ID del alumno que desea eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Alumno alumnoAEliminar = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getId() == id) {
                alumnoAEliminar = alumno;
                break;
            }
        }

        if (alumnoAEliminar != null) {
            alumnos.remove(alumnoAEliminar);
            System.out.println("Alumno eliminado exitosamente.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}
