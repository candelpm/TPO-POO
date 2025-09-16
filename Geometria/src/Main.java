public class Main {
    public static void main(String[] args) {

        //RECTANGULO
        Rectangulo rectangulo = new Rectangulo(4.0, 5.0);
        rectangulo.mostrarDescripcion();
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());

        //CIRCULOO
        Circulo circulo = new Circulo(3.0);
        circulo.mostrarDescripcion();
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}