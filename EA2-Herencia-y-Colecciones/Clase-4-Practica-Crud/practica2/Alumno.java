// Definición de la clase Alumno
public class Alumno {
    // Atributos privados de la clase Alumno
    private int id;
    private String nombre;
    private int edad;
    private String membresia;

    // Constructor que inicializa los atributos de la clase Alumno
    public Alumno(int id, String nombre, int edad, String membresia) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.membresia = membresia;
    }

    // Métodos getter y setter para acceder y modificar los atributos

    // Devuelve el ID del alumno
    public int getId() {
        return id;
    }

    // Establece el ID del alumno
    public void setId(int id) {
        this.id = id;
    }

    // Devuelve el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    // Establece el nombre del alumno
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelve la edad del alumno
    public int getEdad() {
        return edad;
    }

    // Establece la edad del alumno
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Devuelve el tipo de membresía del alumno
    public String getMembresia() {
        return membresia;
    }

    // Establece el tipo de membresía del alumno
    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    // Método que devuelve una representación clara del objeto Alumno
    @Override
    public String toString() {
        return "Alumno ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Membresía: " + membresia;
    }
}
