package Superpoderes;

import java.util.Random;

public class Personaje {
    private final String nombre;
    private int vidas;
    private final SuperPoder superPoder;
    private final EscudoProtector escudoProtector;

    // Constructor
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.vidas = 100; // Todas las vidas inician con 100.
        this.superPoder = obtenerPoderAleatorio(); // Seleccionar SuperPoder al azar
        this.escudoProtector = obtenerEscudoAleatorio(); // Seleccionar EscudoProtector al azar
    }

    // Método para seleccionar un SuperPoder aleatorio
    private SuperPoder obtenerPoderAleatorio() {
        SuperPoder[] poderes = SuperPoder.values(); // Obtener todos los valores del enum
        int indiceAleatorio = new Random().nextInt(poderes.length); // Generar índice aleatorio
        return poderes[indiceAleatorio];
    }

    // Método para seleccionar un EscudoProtector aleatorio
    private EscudoProtector obtenerEscudoAleatorio() {
        EscudoProtector[] escudos = EscudoProtector.values(); // Obtener todos los valores del enum
        int indiceAleatorio = new Random().nextInt(escudos.length); // Generar índice aleatorio
        return escudos[indiceAleatorio];
    }

    // Método para recibir daño, teniendo en cuenta el escudo
    public void recibirDanio(int danio) {
        int danioReducido = (danio * (100 - escudoProtector.getPorcentajeDefensa())) / 100;
        vidas -= danioReducido; // Actualizar vidas según el daño recibido
        if (vidas < 0) vidas = 0; // Asegurarse de que las vidas no sean negativas
    }

    // Método para calcular el daño al atacar
    public int atacar() {
        return superPoder.getNivelDanio(); // El daño depende del nivel del superpoder
    }

    // Método para verificar si el personaje sigue con vida
    public boolean estaVivo() {
        return vidas > 0;
    }

    // Obtener el nombre del personaje
    public String getNombre() {
        return nombre;
    }

    // Sobrescribir el método toString para mostrar la información del personaje
    @Override
    public String toString() {
        return "Personaje: " + nombre +
                ", Vidas: " + vidas +
                ", SuperPoder: " + superPoder +
                " (" + superPoder.getNivelDanio() + " daño)" +
                ", Escudo: " + escudoProtector +
                " (" + escudoProtector.getPorcentajeDefensa() + "% defensa)";
    }
}