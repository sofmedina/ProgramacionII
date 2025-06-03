package Ejer9_CalculoDeEnvio;

public class FuncionesEnvio {

    // Funcion que calcula el costo de envio
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona no válida.");
            return 0;
        }
    }

    // Funcion que calcula el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

}
