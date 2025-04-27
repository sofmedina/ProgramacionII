package Ejer1_AnioBisiesto;   // Estructuras Condicionales

import java.util.Scanner;

public class AnioBisiesto {

    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese un año: ");
        int anio = scanner.nextInt();

        boolean esBisiesto = false;

        if (anio % 4 == 0){
            if(anio % 100 != 0 || anio % 400 == 0){
               esBisiesto = true;
            }
        }

        if (esBisiesto){   // si esBisiesto == true
            System.out.println("El año " +anio+ " es bisiesto");
        }else {  // si esBisiesto == false
            System.out.println("El año " +anio+ " NO es bisiesto");
        }

    }
}
// Bloque if-else:
// if (condición) → se ejecuta solo si la condición es true.
//else → se ejecuta solo si la condición es false.
