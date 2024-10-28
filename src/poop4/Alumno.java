package poop4;

public class Alumno {
    private String nombre;
    private int edad;
    private int numCuenta;
    private String carrera;
    private String tutor;

    public Alumno() {
        nombre = null;
        edad = 0;
        numCuenta = 0;
        carrera = null;
        tutor = null;
    }

    public Alumno(String nombre, int edad, int numCuenta, String carrera, String tutor) {
        this.nombre = nombre;
        this.edad = edad;
        this.numCuenta = numCuenta;
        this.carrera = carrera;
        this.tutor = tutor;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de cuenta: " + numCuenta);
        System.out.println("Carrera: " + carrera);
        System.out.println("Tutor: " + tutor);
    }

    public void asistirClase() {
        System.out.println("Asistiendo a clase");
    }

    public boolean prepararTarea() {
        System.out.println("Preparando tarea");
        return true;
    }

    public void sumarCreditos() {
        System.out.println("85 créditos acumulados");
    }

    public boolean ubicarseAula(float x, float y, float z) {
        System.out.println("Ubicación del aula en: " + x + ", " + y + ", " + z);
        return true;
    }
}
