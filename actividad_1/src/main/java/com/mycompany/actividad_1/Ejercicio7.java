package com.mycompany.actividad_1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        
        double area = Math.PI * radio * radio;
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        
        System.out.println("Área: " + area);
        System.out.println("Volumen: " + volumen);
    }
}

