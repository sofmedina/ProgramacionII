package Ejer11_CalculoDeDescEspecial;   // Variables Locales y Globales

import java.util.Scanner;

public class CalculoDeDescEspecial {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        FuncionesDescuento.calcularDescuentoEspecial(precio); // llamamos al método

        scanner.close();
    }
}
