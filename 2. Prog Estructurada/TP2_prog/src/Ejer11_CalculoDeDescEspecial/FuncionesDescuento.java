package Ejer11_CalculoDeDescEspecial;

public class FuncionesDescuento {
    public static final double DESCUENTO_ESPECIAL = 0.10;  //variable GLOBAL

    //Metodo que calcula es descuento
    //(Este metodo es "void" porque no le va a pasar nada al main, solo va a mostrar el mensaje cuando el main lo llame)

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;  //variable LOCAL "descuentoAplicado"
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
