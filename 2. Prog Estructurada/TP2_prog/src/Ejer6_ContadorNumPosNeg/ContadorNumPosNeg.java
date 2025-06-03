package Ejer6_ContadorNumPosNeg;   // Estructuras Repetitivas (bucles/ciclos)

import java.util.Scanner;

public class ContadorNumPosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Iniciamos los contadores en cero
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Ciclo for para pedir 10 números
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = scanner.nextInt();

            // Condiciones para contar positivos, negativos y ceros
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar los resultados
        System.out.println("'Resultados'");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}

