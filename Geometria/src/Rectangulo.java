class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    //Contructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    //Metodo calculo area
    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Rectángulo: ancho = " + ancho + ", alto = " + alto + ".");
    }
}