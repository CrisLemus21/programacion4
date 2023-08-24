package com.mycompany.actividad_1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.println("Suma: " + (valor1 + valor2));
        System.out.println("Resta: " + (valor1 - valor2));
        System.out.println("Multiplicación: " + (valor1 * valor2));
        
        if (valor2 != 0) {
            System.out.println("División: " + (valor1 / valor2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}

