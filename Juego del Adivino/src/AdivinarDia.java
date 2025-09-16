import java.util.Random;
import java.util.Scanner;

public class AdivinarDia {

    public void jugar() {
        DiaSemana diaAleatorio = generarDiaAleatorio();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a Juego del Adivino!");
        System.out.println("¡Adivina el día de la semana! Tienes 3 SOLO intentos.");

        boolean adivinado = false;
        for (int intento = 1; intento <= 3; intento++) {
            System.out.print("Intento " + intento + ": ");
            String diaUsuario = scanner.next().toUpperCase();

            try {
                DiaSemana diaAdivinado = DiaSemana.valueOf(diaUsuario);

                if (diaAdivinado == diaAleatorio) {
                    System.out.println("¡CORRECTO! El día era " + diaAleatorio + ". ¡Felicidades!");
                    adivinado = true;
                    break;
                } else {
                    System.out.println("¡INCORRECTO!. Intenta de nuevo.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada no válida. Debes escribir un día de la semana.");
            }
        }

        if (!adivinado) {
            System.out.println("Lo siento, has agotado tus intentos. El día correcto era " + diaAleatorio + ".");
        }

        scanner.close();
    }

    private DiaSemana generarDiaAleatorio() {
        DiaSemana[] dias = DiaSemana.values();
        Random random = new Random();
        int indiceAleatorio = random.nextInt(dias.length);
        return dias[indiceAleatorio];
    }
}