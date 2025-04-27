package Ejer4_CalculadoraDto;   // Estructuras Condicionales

import java.util.Scanner;

public class CalculadoraDto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese la categoria del producto (A,B,C): ");
        String categoria = scanner.next();



    }
}
