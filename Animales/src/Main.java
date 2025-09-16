import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // crea lista HacerSonido
        ArrayList<HacerSonido> animales = new ArrayList<>();

        // objetos a lista
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Pato());

        // Recorre lista y llama hacerSonido
        for (HacerSonido animal : animales) {
            animal.hacerSonido();
        }
    }
}