public class Main {
    public static void main(String[] args) {
        // Crea posición inicial
        Posicion posicionInicial = new Posicion(1, 1);
        System.out.println("Posición inicial: " + posicionInicial);

        // Movimientos
        Posicion posicion1 = posicionInicial.mover(1, 2);
        System.out.println("Después de mover(1, 2): " + posicion1);

        Posicion posicion2 = posicion1.mover(2, 1);
        System.out.println("Después de mover(2, 1): " + posicion2);

        // Compruebo que no se cambio la posicion inicial
        System.out.println("Posición inicial sigue siendo: " + posicionInicial);
    }
}