package Ejer7_ValidacionEntrada;   // Estructuras Repetitivas (bucles/ciclos)

import java.util.Scanner;

public class ValidacionEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {                                        // el ciclo se ejecuta al menos una vez
            System.out.println("Ingrese una nota: ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("⚠ Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10); // mientras la nota sea menor a 0 y mayor a 10, sel ciclo se va aseguir repitiendo.
                                        // el ciclo se repite solo si la nota no es valida.

        System.out.println("✅ Nota guardada correctamente."); // sino se guarda y sale del mismo.
    }
}



