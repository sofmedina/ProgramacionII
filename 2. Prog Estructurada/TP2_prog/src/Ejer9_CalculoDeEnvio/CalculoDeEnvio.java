package Ejer9_CalculoDeEnvio;  //Ejercicios Funciones  (composicion de funciones)

import java.util.Scanner;

public class CalculoDeEnvio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // limpiar el salto de línea

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();

        // Llamamos a los metodos de la clase FuncionesEnvio y le pasamos los valores que el usuario ingreso
        double costoEnvio = FuncionesEnvio.calcularCostoEnvio(peso,zona);
        double total = FuncionesEnvio.calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

    }

}
