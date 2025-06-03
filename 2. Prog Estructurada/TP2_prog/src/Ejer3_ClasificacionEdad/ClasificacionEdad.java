package Ejer3_ClasificacionEdad;   // Estructuras Condicionales

import java.util.Scanner;

public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 12){
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        }else if (edad <= 59){
            System.out.println("Eres un Adulto");
        }else {
            System.out.println("Eres un Adulto Mayor");
        }
    }
}
