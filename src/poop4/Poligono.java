package poop4;

public class Poligono {
    private int lados;
    private int vertices;
    private int aristas;
    private float altura;
    private String color;

    public Poligono() {
        lados = 0;
        vertices = 0;
        aristas = 0;
        altura = 0;
        color = null;
    }

    public Poligono(int lados, int vertices, int aristas, float altura, String color) {
        this.lados = lados;
        this.vertices = vertices;
        this.aristas = aristas;
        this.altura = altura;
        this.color = color;
    }

    public void mostrarInfo() {
        System.out.println("Lados: " + lados);
        System.out.println("Vértices: " + vertices);
        System.out.println("Aristas: " + aristas);
        System.out.println("Altura: " + altura);
        System.out.println("Color: " + color);
    }

    public void subdividirFigura() {
        System.out.println("Subdividiendo la figura en partes iguales");
    }

    public boolean determinarAngulos() {
        System.out.println("La suma de ángulos internos depende de los lados");
        return true;
    }

    public boolean construirFiguras() {
        System.out.println("Construyendo figuras a partir de polígonos");
        return true;
    }

    public void calcularArea() {
        System.out.println("Calculando el área del polígono");
    }

    public void jugarFigura() {
        System.out.println("Utilizado en juegos de construcción");
    }
}
