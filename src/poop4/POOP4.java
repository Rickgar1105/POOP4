package poop4;

/**
 * Clase principal para ejecutar ejemplos de diversas entidades
 * como Coordenadas, Mascotas, Vehículos, Alumnos, Maestros y Polígonos.
 * Autor: Galicia Tequianes Ricardo Emmanuel
 */
public class POOP4 {

    public static void main(String[] args) {

        // Ejemplo de coordenadas
        Coordenada puntoA = new Coordenada();
        puntoA.mostrar();
        Coordenada puntoB = new Coordenada(-5, 10, "Esquina B");
        puntoB.mostrar();

        puntoA.configurarPosicion(45, 30, "Centro A");
        puntoA.mostrar();
        System.out.println(puntoA);

        // Ejemplo de mascotas
        Mascota mascotaA = new Mascota("blanco", "rizado", 25, "labrador", 3);
        mascotaA.mostrarDetalles();
        mascotaA.jugarConCuerda();
        mascotaA.correrA(2.1f, -3, 5.7f);

        System.out.println("--------------");

        // Ejemplo de vehículos
        Vehiculo cocheA = new Vehiculo("Honda", "Civic", 2020, "Motor eléctrico", 2);
        cocheA.mostrarInfo();
        cocheA.viajarA(15.2f, 6.5f, 9.3f);
        cocheA.encenderFaros();
        cocheA.tocarBocina();
        cocheA.iniciarMotor();

        System.out.println("--------------");

        // Ejemplo de alumnos
        Alumno alumnoA = new Alumno("Laura", 22, 120349840, "Derecho", "García L.");
        alumnoA.mostrarDatos();
        alumnoA.asistirClase();
        alumnoA.prepararTarea();
        alumnoA.sumarCreditos();
        alumnoA.ubicarseAula(4.4f, 9.1f, 2.2f);

        System.out.println("--------------");

        // Ejemplo de maestros
        Maestro profeA = new Maestro("Javier", 42, "Martes y Viernes de 2pm a 5pm", "Ciencias Sociales", "Historia");
        profeA.mostrarInfo();
        profeA.asistirClase();
        profeA.evaluarProyecto();
        profeA.darConsejo();

        System.out.println("--------------");

        // Ejemplo de polígonos
        Poligono figuraA = new Poligono(5, 5, 5, 12.7f, "Azul");
        figuraA.mostrarInfo();
        figuraA.subdividirFigura();
        figuraA.determinarAngulos();
        figuraA.construirFiguras();
        figuraA.calcularArea();
        figuraA.jugarFigura();
    }
}
