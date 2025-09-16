public final class Posicion {
    private final int fila;
    private final int columna;

    public Posicion(int fila, int columna) {
        if (fila < 1 || fila > 8 || columna < 1 || columna > 8) {
            throw new IllegalArgumentException("La fila y la columna deben estar entre 1 y 8.");
        }
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    // Metodo mover posicion
    public Posicion mover(int df, int dc) {
        int nuevaFila = fila + df;
        int nuevaColumna = columna + dc;

        if (nuevaFila < 1 || nuevaFila > 8 || nuevaColumna < 1 || nuevaColumna > 8) {
            throw new IllegalArgumentException("Movimiento fuera del tablero.");
        }

        return new Posicion(nuevaFila, nuevaColumna);
    }

    @Override
    public String toString() {
        return "(" + fila + ", " + columna + ")";
    }
}