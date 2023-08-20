package semana1.Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño del array (n): ");
        int n = scanner.nextInt();

        int[] numerosAleatorios = new int[n];

        for (int i = 0; i < n; i++) {
            numerosAleatorios[i] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
        }

        System.out.println("Elementos del array:");
        int i = 0;
        for (int num : numerosAleatorios) {
            System.out.println("El elemento " + i +" es: " + num);
            i++;
        }
    }
}

