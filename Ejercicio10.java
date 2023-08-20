package semana1.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 0;
        int adivinanza;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¡Adivina cuál es!");

        do {
            System.out.print("Ingresa tu adivinanza: ");
            adivinanza = scanner.nextInt();
            intentos++;

            if (adivinanza < numeroAdivinar) {
                System.out.println("Número demasiado bajo, intenta nuevamente.");
            } else if (adivinanza > numeroAdivinar) {
                System.out.println("Número demasiado alto, intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
            }
        } while (adivinanza != numeroAdivinar);

        System.out.println("El número a adivinar era: " + numeroAdivinar);
        System.out.println("Cantidad de intentos realizados: " + intentos);

        scanner.close();
    }
}
