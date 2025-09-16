package Superpoderes;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear dos personajes
        Personaje personaje1 = new Personaje("Heroe");
        Personaje personaje2 = new Personaje("Villano");

        System.out.println("=== BATALLA ===\n");

        // Mostrar información inicial de los personajes
        System.out.println("** Información inicial de los personajes **\n");
        System.out.println("Personaje 1:");
        System.out.println(personaje1);
        System.out.println();
        System.out.println("Personaje 2:");
        System.out.println(personaje2);
        System.out.println("\n==========================\n");

        Random random = new Random();

        // Simulación de la batalla (hasta 5 rondas)
        for (int ronda = 1; ronda <= 5; ronda++) {
            System.out.println(">>> Ronda " + ronda);

            // Si uno de los personajes no está vivo, terminamos
            if (!personaje1.estaVivo() || !personaje2.estaVivo()) {
                System.out.println("\nUno de los personajes ya no está en pie. ¡Fin de la batalla!");
                break;
            }

            if (random.nextBoolean()) {
                // Personaje 1 ataca
                System.out.println(personaje1.getNombre() + " ataca con " + personaje1.atacar() + " de daño.");
                personaje2.recibirDanio(personaje1.atacar());
            } else {
                // Personaje 2 ataca
                System.out.println(personaje2.getNombre() + " ataca con " + personaje2.atacar() + " de daño.");
                personaje1.recibirDanio(personaje2.atacar());
            }

            // Estado de los personajes tras la ronda
            System.out.println("\nEstado de los personajes al final de la ronda:");
            System.out.println(personaje1);
            System.out.println(personaje2);
            System.out.println("\n==========================\n");
        }

        // Determinar al ganador
        System.out.println("=== RESULTADO FINAL ===");

        if (personaje1.estaVivo() && personaje2.estaVivo()) {
            System.out.println("Empate: ¡Ambos personajes siguen en pie!");
        } else if (personaje1.estaVivo()) {
            System.out.println(personaje1.getNombre() + " es el ganador. ¡Felicidades!");
        } else if (personaje2.estaVivo()) {
            System.out.println(personaje2.getNombre() + " es el ganador. ¡Felicidades!");
        } else {
            System.out.println("Ambos personajes han caído. ¡No hay ganador!");
        }
    }
}