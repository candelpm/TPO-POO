public abstract class Vehiculo {

    // CONCRETO
    public void encenderMotor() {
        System.out.println("El motor está encendido");
    }

    // ABSTRACTO
    public abstract void mover(int distancia);
}