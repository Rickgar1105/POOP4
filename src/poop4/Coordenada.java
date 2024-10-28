package poop4;

public class Coordenada {
    private int x;
    private int y;
    private String etiqueta;

    public Coordenada() {
        x = 0;
        y = 0;
        etiqueta = null;
    }

    public void mostrar() {
        System.out.println("Ubicación (x=" + x + ", y=" + y + ") Nombre = " + etiqueta);
    }

    public Coordenada(int x, int y, String etiqueta) {
        this.x = x;
        this.y = y;
        this.etiqueta = etiqueta;
    }

    public void configurarPosicion(int x, int y, String etiqueta) {
        this.x = x;
        this.y = y;
        this.etiqueta = etiqueta;
    }
}
