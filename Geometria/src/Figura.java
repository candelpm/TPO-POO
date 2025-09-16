abstract class Figura {
    // Metodo abstracto area
    public abstract double calcularArea();

    // Metodo concreto output
    public void mostrarDescripcion() {
        System.out.println("Soy una figura geométrica.");
    }
}