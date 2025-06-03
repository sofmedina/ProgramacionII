package Ejer8_CalculoPrecioFinalProd;   // Ejercicios Funciones

import java.util.Scanner;              // Las clases que se llaman igual que el paquete son las "Main" de cada paquete, en mi caso.

public class CalculoPrecioFinalProd {
    public static void main(String[] args) {   //Desde aca el main del ejer8, llamamos a la funcion.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble();

        double precioFinal = FuncionesPrecio.calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

}
