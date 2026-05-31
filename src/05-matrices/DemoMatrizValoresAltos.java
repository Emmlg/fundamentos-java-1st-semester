/**
 * EJERCICIO: Demostración de Matriz (Valores Máximos y Mínimos)
 * ---------------------------------------------------------------
 * Concepto: Matrices bidimensionales, búsqueda de extremos y coordenadas.
 * 
 * DESCRIPCIÓN: 
 * Programa que llena una matriz de 3x3, identifica el valor máximo 
 * y mínimo almacenado, y muestra sus posiciones (fila y columna).
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Noviembre 2021
 */
package matrices;

import java.util.Scanner;

public class DemoMatrizValoresAltos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final int TF = 3, TC = 3;
        int[][] matriz = new int[TF][TC];
        
        // Llenado de la matriz
        for (int f = 0; f < TF; f++) {
            for (int c = 0; c < TC; c++) {
                System.out.print("Escribe dato [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();
            }
        }

        // Búsqueda de Max y Min
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int fMax = 0, cMax = 0, fMin = 0, cMin = 0;

        for (int f = 0; f < TF; f++) {
            for (int c = 0; c < TC; c++) {
                if (matriz[f][c] > max) {
                    max = matriz[f][c]; fMax = f; cMax = c;
                }
                if (matriz[f][c] < min) {
                    min = matriz[f][c]; fMin = f; cMin = c;
                }
            }
        }

        // Visualización
        System.out.println("
--- MATRIZ ---");
        for (int f = 0; f < TF; f++) {
            for (int c = 0; c < TC; c++) {
                System.out.print(matriz[f][c] + "	");
            }
            System.out.println();
        }

        System.out.println("
Valor máximo: " + max + " en [" + fMax + "," + cMax + "]");
        System.out.println("Valor mínimo: " + min + " en [" + fMin + "," + cMin + "]");
    }
}
