/**
 * EJERCICIO: Promedio con Arreglos Unidimensionales
 * ---------------------------------------------------------------
 * Concepto: Declaración, inicialización y recorrido de arreglos (vectores).
 * 
 * DESCRIPCIÓN: 
 * Programa que solicita 10 calificaciones, las almacena en un arreglo 
 * y calcula el promedio final. Demuestra el uso de índices y constantes.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 26 de Octubre 2021
 */
package arreglos;

import java.util.Scanner;

public class DemoArrayUnidimensional {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final int CAPACIDAD = 10;
        int[] calificaciones = new int[CAPACIDAD];
        int suma = 0;

        // Llenado del arreglo y acumulación
        for (int i = 0; i < CAPACIDAD; i++) {
            System.out.print("Escribe la calificación no. " + (i + 1) + ": ");
            calificaciones[i] = leer.nextInt();
            suma += calificaciones[i];
        }

        float promedio = (float) suma / CAPACIDAD;
        System.out.println("
El promedio final es: " + promedio);
    }
}
