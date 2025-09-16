class Circulo extends Figura {
    private double radio;
    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    //Metodo de calculo area
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Círculo: radio = " + radio + ".");
    }
}