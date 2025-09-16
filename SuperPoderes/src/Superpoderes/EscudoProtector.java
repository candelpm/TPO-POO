package Superpoderes;

public enum EscudoProtector {
    ESCUDO_1(50),
    ESCUDO_2(30),
    ESCUDO_3(70),
    ESCUDO_4(90);

    private final int porcentajeDefensa;

    EscudoProtector(int porcentajeDefensa) {
        this.porcentajeDefensa = porcentajeDefensa;
    }

    public int getPorcentajeDefensa() {
        return this.porcentajeDefensa;
    }
}