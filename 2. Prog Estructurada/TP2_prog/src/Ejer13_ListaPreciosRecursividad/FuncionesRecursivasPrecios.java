package Ejer13_ListaPreciosRecursividad;
//Esta clase solo contiene las funciones recursivas que se usan en el main.

public class FuncionesRecursivasPrecios {

    // Función recursiva para mostrar los precios

    public static void mostrarPreciosRecursivo(double[] array, int indice) {
        // Caso base: si el índice se pasa del último, terminamos
        if (indice >= array.length) {
            return;
        }

        // Mostrar el precio actual
        System.out.println("Precio: $" + array[indice]);

        // Llamada recursiva: pasar al siguiente índice
        mostrarPreciosRecursivo(array, indice + 1);
    }
}
