package poop4;

public class Maestro {
    private String nombre;
    private int edad;
    private String horario;
    private String carrera;
    private String materia;

    public Maestro() {
        nombre = null;
        edad = 0;
        horario = null;
        carrera = null;
        materia = null;
    }

    public Maestro(String nombre, int edad, String horario, String carrera, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.horario = horario;
        this.carrera = carrera;
        this.materia = materia;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Horario: " + horario);
        System.out.println("Carrera: " + carrera);
        System.out.println("Materia: " + materia);
    }

    public void asistirClase() {
        System.out.println("Asistiendo a la clase");
    }

    public boolean evaluarProyecto() {
        System.out.println("Evaluando proyecto final");
        return true;
    }

    public boolean darConsejo() {
        System.out.println("Dando un consejo profesional");
        return true;
    }
}
