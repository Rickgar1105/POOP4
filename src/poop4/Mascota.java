package poop4;

public class Mascota {
    private String color;
    private String pelaje;
    private int tamano;
    private String raza;
    private int edad;

    public Mascota() {
        color = null;
        pelaje = null;
        tamano = 0;
        raza = null;
        edad = 0;
    }

    public Mascota(String color, String pelaje, int tamano, String raza, int edad) {
        this.color = color;
        this.pelaje = pelaje;
        this.tamano = tamano;
        this.raza = raza;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Color: " + color);
        System.out.println("Pelaje: " + pelaje);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
    }

    public void jugarConCuerda() {
        System.out.println("Jugando con una cuerda");
    }

    public boolean comer() {
        System.out.println("Comiendo alimento");
        return true;
    }

    public void dormir() {
        System.out.println("Durmiendo zzz...");
    }

    public void ladrar() {
        System.out.println("¡Guau guau!");
    }

    public void correrA(float x, float y, float z) {
        System.out.println("Corro hacia: " + x + ", " + y + ", " + z);
    }
}
