package Ejer4_CalculadoraDto;   // Estructuras Condicionales

import java.util.Scanner;

public class CalculadoraDto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese la categoria del producto (A,B,C): ");
        String categoria = scanner.next();
        categoria = categoria.toUpperCase(); // convertimos cualquier letra ingresada a Mayus

        switch (categoria) {
            case "A": // 10% descuento
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: $ " + (precio-((10*precio)/100)));
                break;

            case "B": // 15% descuento
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: $ " + (precio-((15*precio)/100)));
                break;

            case "C": // 20% descuento
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: $ " + (precio-((20*precio)/100)));
                break;

            default:
                System.out.println("La categoría seleccionada es inválida");
        }



    }
}
