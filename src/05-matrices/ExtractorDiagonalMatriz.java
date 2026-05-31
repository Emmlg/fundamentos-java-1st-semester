/**
 * EJERCICIO: Extractor de Diagonal Principal
 * ---------------------------------------------------------------
 * Concepto: Matrices dinámicas y suma de la diagonal principal.
 * 
 * DESCRIPCIÓN: 
 * Solicita al usuario el tamaño de una matriz (M x N), la llena y 
 * calcula la suma de la diagonal principal, almacenando el resultado 
 * en la posición extra [M][N] del arreglo expandido.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 9 de Noviembre 2021
 */
package matrices;

import java.util.Scanner;

public class ExtractorDiagonalMatriz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Número de filas: ");
        int m = leer.nextInt();
        System.out.print("Número de columnas: ");
        int n = leer.nextInt();
        
        int[][] matriz = new int[m + 1][n + 1];

        // Llenado
        for (int f = 0; f < m; f++) {
            for (int c = 0; c < n; c++) {
                System.out.print("Dato [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();
                
                // Suma diagonal (si es cuadrada o hasta el límite)
                if (f == c) {
                    matriz[m][n] += matriz[f][c];
                }
            }
        }

        // Salida
        System.out.println("
--- MATRIZ CON SUMA DIAGONAL EN [" + m + "][" + n + "] ---");
        for (int f = 0; f <= m; f++) {
            for (int c = 0; c <= n; c++) {
                System.out.print(matriz[f][c] + "	");
            }
            System.out.println();
        }
    }
}
