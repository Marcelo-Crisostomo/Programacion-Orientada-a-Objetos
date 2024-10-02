public class Alumno {
    //Atributos
    private int id;
    private String nombre;
    private int edad;
    private String membresia;
    //Constructor
    public Alumno(int id, String nombre, int edad, String membresia) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.membresia = membresia;
    }
    //GYS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }
    //TS
    @Override
    public String toString() {
        return "Alumno{" +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Membresía='" + membresia + '\'' +
                '}';
    }
}
