
package com.mycompany.actividad_1;
import java.util.Scanner;

public class Actividad_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecciona el ejercicio que deseas ejecutar:");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                Ejercicio1.main(args);
                break;
            case 2:
                Ejercicio2.main(args);
                break;
            case 3:
                Ejercicio3.main(args);
                break;
            case 4:
                Ejercicio4.main(args);
                break;
            case 5:
                Ejercicio5.main(args);
                break;
            case 6:
                Ejercicio6.main(args);
                break;
            case 7:
                Ejercicio7.main(args);
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
    }
}

