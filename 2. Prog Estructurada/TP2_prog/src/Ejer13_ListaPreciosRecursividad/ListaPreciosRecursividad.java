package Ejer13_ListaPreciosRecursividad;

public class ListaPreciosRecursividad {

    public static void main(String[] args) {
        // 1. Declaramos el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // 2. Mostramos los precios originales con recursividad
        System.out.println("Precios originales:");
        FuncionesRecursivasPrecios.mostrarPreciosRecursivo(precios, 0); // función desde otra clase

        // 3. Modificamos el precio en la posición 2 (el tercer producto)
        precios[2] = 129.99;

        // 4. Mostramos los precios modificados
        System.out.println("\nPrecios modificados:");
        FuncionesRecursivasPrecios.mostrarPreciosRecursivo(precios, 0); // misma función otra vez
    }
}
