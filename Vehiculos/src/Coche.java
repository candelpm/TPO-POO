public class Coche extends Vehiculo {

    @Override
    public void mover(int distancia) {
        System.out.println("Velocidad " + distancia + " km/h");
    }
}