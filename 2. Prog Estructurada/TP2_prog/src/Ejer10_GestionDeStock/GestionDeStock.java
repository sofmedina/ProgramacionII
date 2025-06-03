package Ejer10_GestionDeStock;   // Ejercicios Funciones  (funcion con varios parametros)

import java.util.Scanner;

//Aca directamente escribimos el metodo(o funcion) en la misma clase, pero separado del main.

public class GestionDeStock {

    //Metodo que actualiza el stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    //Metodo main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        scanner.close();
    }

}
