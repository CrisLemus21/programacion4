package com.mycompany.actividad_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresa tus apellidos: ");
        String apellidos = scanner.nextLine();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String fechaActual = dateFormat.format(new Date());
        
        System.out.println("Resultado: " + nombre + " " + apellidos + " " + fechaActual);
    }
}


