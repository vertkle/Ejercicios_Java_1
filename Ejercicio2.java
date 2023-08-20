package semana1.Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        if (edad >= 15) {
            System.out.print("¿Trae regalos? (Si | No): ");
            String respuestaRegalos = scanner.next();

            if (respuestaRegalos.equalsIgnoreCase("Si")) {
                System.out.println("¡Bienvenido(a) a la fiesta!");
            } else {
                System.out.println("Lo siento, necesitas traer regalos para entrar.");
            }
        } else {
            System.out.println("¡Bienvenido(a) a la fiesta! Eres menor de 15 años y entras gratis.");
        }
    }
}
