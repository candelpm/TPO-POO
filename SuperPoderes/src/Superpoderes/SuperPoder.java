package Superpoderes;

public enum SuperPoder {
    VOLAR(10),
    FUERZA_SOBREHUMANA(20),
    INVISIBILIDAD(15),
    TELEPATIA(12);

    private final int nivelDanio;

    SuperPoder(int nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    public int getNivelDanio() {
        return this.nivelDanio;
    }
}