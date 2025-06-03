package Ejer8_CalculoPrecioFinalProd;

public class FuncionesPrecio {
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioConImpuesto = precioBase * (impuesto / 100);
        double precioConDescuento = precioBase * (descuento / 100);
        return precioBase + precioConImpuesto - precioConDescuento;
    }
}
