public class Main {

    public static void main(String[] args) {
        // crea instancia de Coche
        Vehiculo coche = new Coche();
        coche.encenderMotor();
        coche.mover(50);

        // crea instancia de Avion
        Vehiculo avion = new Avion();
        avion.encenderMotor();
        avion.mover(300);
    }
}