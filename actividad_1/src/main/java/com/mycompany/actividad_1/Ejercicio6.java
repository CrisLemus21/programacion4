package com.mycompany.actividad_1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la base del rectángulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        
        double perimetro = 2 * (base + altura);
        double area = base * altura;
        
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}

