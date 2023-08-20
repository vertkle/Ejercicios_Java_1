package semana1.Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PAGO_FIJO = 10.0;
        final int LIMITE_GRATIS = 50;
        final int LIMITE_TARIFA1 = 200;
        final double TARIFA1 = 0.5;
        final double TARIFA2 = 1.5;

        System.out.print("Ingrese el consumo de agua en litros: ");
        int consumoAgua = scanner.nextInt();

        double costoTotal = PAGO_FIJO;

        if (consumoAgua > LIMITE_GRATIS) {
            int consumoTarifa1 = (consumoAgua - LIMITE_GRATIS);
            int consumoTarifa2 = (consumoAgua - LIMITE_TARIFA1);

            if (consumoTarifa1 > (LIMITE_TARIFA1 - LIMITE_GRATIS)) {
                consumoTarifa1 = LIMITE_TARIFA1 - LIMITE_GRATIS;
            } else {
                consumoTarifa2 = 0;
            }

            costoTotal += (consumoTarifa1 * TARIFA1) + (consumoTarifa2 * TARIFA2);
        }

        System.out.println("El costo total a pagar es: $" + costoTotal);
    }
}
