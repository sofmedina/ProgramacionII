package Ejer12_ListaPrecios;   // Lista de Precios de Productos con Modificación

public class ListaPrecios {
    public static void main(String[] args) {
        // Paso 1: Array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // Paso 2: Mostrar precios originales (Aca usamos el for-each)
        System.out.println("Precios originales:");
        for (double precio : precios) {     //Aca lo que hace es que para todos los valores del array "precios", los vaya guardando en la variable double "precio".
            System.out.println("Precio: $" + precio);
        }

        // Paso 3: Modificar el precio de un producto
        precios[2] = 129.99;  // Cambiamos el tercero

        // Paso 4: Mostrar precios modificados
        System.out.println("\nPrecios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
