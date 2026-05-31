/**
 * EJERCICIO: Sumador de Filas y Columnas
 * ---------------------------------------------------------------
 * Concepto: Operaciones avanzadas con matrices N x N y búsqueda de máximos.
 * 
 * DESCRIPCIÓN: 
 * Programa que procesa una matriz cuadrada. Calcula la suma de todas 
 * las filas, columnas y la diagonal principal. Identifica los valores 
 * máximos globales para reportar tendencias de suma.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Noviembre 2021
 */
package matrices;

import java.util.Scanner;

public class SumadorFilasColumnas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Tamaño de la matriz (N >= 3): ");
            n = leer.nextInt();
        } while (n < 3);

        int[][] matriz = new int[n + 1][n + 1];

        // Entrada de datos
        for (int f = 0; f < n; f++) {
            for (int c = 0; c < n; c++) {
                System.out.print("Valor [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();
                
                // Sumas automáticas en bordes
                matriz[f][n] += matriz[f][c]; // Fila
                matriz[n][c] += matriz[f][c]; // Columna
                if (f == c) matriz[n][n] += matriz[f][c]; // Diagonal
            }
        }

        // Visualización completa
        System.out.println("
--- MATRIZ INTEGRAL DE SUMAS ---");
        for (int f = 0; f <= n; f++) {
            for (int c = 0; c <= n; c++) {
                System.out.print(matriz[f][c] + "	");
            }
            System.out.println();
        }
    }
}
