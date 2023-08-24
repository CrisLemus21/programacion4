package com.mycompany.actividad_1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.println(palabra);
        }
    }
}
