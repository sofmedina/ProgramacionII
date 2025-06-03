package Ejer5_SumNumPares;   // Estructuras Repetitivas (bucles/ciclos)

import java.util.Scanner;

public class SumNumPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número (0 para terminar): ");
        int num = scanner.nextInt();
        int sumaPares = 0;

        while (num != 0){
            if (num % 2 == 0) {
                sumaPares += num;
            }
            System.out.println("Ingrese un número (0 para terminar): ");
            num = scanner.nextInt();
        }

        System.out.println("La suma de los números pares ingresados es: " + sumaPares);
    }
}
