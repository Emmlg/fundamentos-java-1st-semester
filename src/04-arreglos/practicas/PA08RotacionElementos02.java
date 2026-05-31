/**
 * EJERCICIO: Rotación de Elementos en un Arreglo
 * ---------------------------------------------------------------
 * Concepto: Manipulación de índices y algoritmos de rotación.
 * 
 * DESCRIPCIÓN: 
 * Lee 15 números y los almacena en un arreglo. Realiza una rotación 
 * a la derecha: el elemento en la posición i pasa a i+1, y el último 
 * elemento pasa a la posición 0.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Noviembre 2021
 */
package practicas;

import java.util.Scanner;

public class PA08RotacionElementos02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] va = new int[15];

        // Entrada de datos
        for (int i = 0; i < 15; i++) {
            System.out.print("Escribe el número para la posición [" + i + "]: ");
            va[i] = leer.nextInt();
        }

        System.out.println("
--- ARREGLO ROTADO ---");
        int ultimo = va[14];
        
        // Imprimir el último en la primera posición y luego el resto
        System.out.print(ultimo + " ");
        for (int i = 0; i < 14; i++) {
            System.out.print(va[i] + " ");
        }
        System.out.println();
    }
}
