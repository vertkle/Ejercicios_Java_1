package semana1.Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Ingrese los elementos del array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        // Invertir el array
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        System.out.println("El array invertido es:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
