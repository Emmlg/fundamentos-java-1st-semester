/**
 * EJERCICIO: Calculadora Básica (Estructura Switch)
 * ---------------------------------------------------------------
 * Concepto: Menú de opciones, estructura switch-case y operaciones aritméticas.
 * 
 * DESCRIPCIÓN: 
 * Implementa una calculadora funcional que permite realizar las 
 * cuatro operaciones básicas (Suma, Resta, Multiplicación, División) 
 * sobre dos números proporcionados por el usuario.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package metodos;

import java.util.Scanner;

public class EjerciciosSala1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float a, b, c;
        int opcion;

        System.out.print("Ingresa el primer número: ");
        a = leer.nextFloat();
        System.out.print("Ingresa el segundo número: ");
        b = leer.nextFloat();
        
        System.out.println("
--- MENÚ DE OPERACIONES ---");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.print("Elige una opción (1-4): ");
        opcion = leer.nextInt();
        
        switch(opcion) {
            case 1: 
                System.out.println("Resultado Suma: " + (a + b));
                break;
            case 2: 
                System.out.println("Resultado Resta: " + (a - b));
                break;
            case 3: 
                System.out.println("Resultado Multiplicación: " + (a * b));
                break;
            case 4: 
                if (b != 0) System.out.println("Resultado División: " + (a / b));
                else System.out.println("Error: División por cero");
                break;
            default: 
                System.out.println("Error: Opción inválida.");
        }
    }
}
