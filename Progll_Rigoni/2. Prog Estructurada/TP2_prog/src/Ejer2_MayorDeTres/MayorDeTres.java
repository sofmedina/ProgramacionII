package Ejer2_MayorDeTres;   // Estructuras Condicionales

import java.util.Scanner;

public class MayorDeTres {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a determinar el mayor de 3 número que ingrese");
        System.out.println();

        System.out.println("Ingrese el 1er numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el 2do numero: ");
        int num2 = scanner.nextInt();
        System.out.println();

        System.out.println("Ingrese el 3er numero: ");
        int num3 = scanner.nextInt();
        System.out.println();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("El número: " +num1+ " es el mayor de los tres ingresados.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("El número: " +num2+ " es el mayor de los tres ingresados.");
        }else {
            System.out.println("El número: " +num3+ " es el mayor de los tres ingresados");
        }
    }
}
