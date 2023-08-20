package semana1.Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        double salarioPorHora = 40.0;
        int horasNormales = 40;
        int horasExtrasDobles = 8;
        int horasExtrasTriples = horasExtrasDobles + 8;

        double salarioTotal = 0.0;

        if (horasTrabajadas <= horasNormales) {
            salarioTotal = horasTrabajadas * salarioPorHora;
        } else if (horasTrabajadas <= horasExtrasTriples) {
            int horasNormalesTrabajadas = horasNormales;
            int horasExtrasDoblesTrabajadas = horasTrabajadas - horasNormalesTrabajadas;

            salarioTotal = (horasNormalesTrabajadas * salarioPorHora) +
                    (horasExtrasDoblesTrabajadas * salarioPorHora * 2);
        } else {
            int horasNormalesTrabajadas = horasNormales;
            int horasExtrasDoblesTrabajadas = horasExtrasDobles;
            int horasExtrasTriplesTrabajadas = horasTrabajadas - horasExtrasTriples;

            salarioTotal = (horasNormalesTrabajadas * salarioPorHora) +
                    (horasExtrasDoblesTrabajadas * salarioPorHora * 2) +
                    (horasExtrasTriplesTrabajadas * salarioPorHora * 3);
        }

        System.out.println("El salario total es: S/." + salarioTotal);
    }
}
