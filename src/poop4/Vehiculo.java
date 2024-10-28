package poop4;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String motor;
    private int puertas;

    public Vehiculo() {
        marca = null;
        modelo = null;
        anio = 0;
        motor = null;
        puertas = 0;
    }

    public Vehiculo(String marca, String modelo, int anio, String motor, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.motor = motor;
        this.puertas = puertas;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Motor: " + motor);
        System.out.println("Puertas: " + puertas);
    }

    public void viajarA(float x, float y, float z) {
        System.out.println("Viajando a: " + x + ", " + y + ", " + z);
    }

    public void encenderFaros() {
        System.out.println("Faros encendidos");
    }

    public boolean atropellar() {
        System.out.println("Atropello accidental");
        return true;
    }

    public void tocarBocina() {
        System.out.println("Bocina: ¡Beep beep!");
    }

    public boolean iniciarMotor() {
        System.out.println("Motor en marcha");
        return true;
    }
}
