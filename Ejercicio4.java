package semana1.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número n: ");
        int n = scanner.nextInt();

        System.out.println("Números impares menores a " + n + ":");

        int i = 1;
        while (i < n) {
            System.out.println(i);
            i += 2;
        }
    }
}
