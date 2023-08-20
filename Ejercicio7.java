package semana1.Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static int resolverFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        scanner.close();

        System.out.println("El factorial de " + numero + " es: " + resolverFactorial(numero));
    }
}
