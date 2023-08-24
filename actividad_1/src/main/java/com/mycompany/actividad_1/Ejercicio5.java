package com.mycompany.actividad_1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();
        
        int max = Math.max(Math.max(num1, num2), num3);
        
        System.out.println("El mayor número es: " + max);
    }
}


