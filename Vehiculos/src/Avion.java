public class Avion extends Vehiculo {

    @Override
    public void mover(int distancia) {
        System.out.println("Velocidad de vuelo " + distancia + " km/h");
    }
}