/**
 * EJERCICIO: Operaciones con Matrices (Suma y Diagonal)
 * ---------------------------------------------------------------
 * Concepto: Matrices (arreglos bidimensionales), suma de filas/columnas y diagonal.
 * 
 * DESCRIPCIÓN: 
 * Crea una matriz de tamaño N x N, calcula la suma de cada fila, 
 * cada columna y la diagonal principal. También identifica los 
 * valores máximo y mínimo con sus coordenadas.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 23 de Noviembre 2021
 */
package practicas;

import java.util.Scanner;

public class PracticaMatriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Tamaño de la matriz (N > 1): ");
            n = leer.nextInt();
        } while (n < 2);

        int[][] matriz = new int[n + 1][n + 1];

        // Lectura de datos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
                
                // Suma acumulada en bordes (n-ésima fila/columna)
                matriz[i][n] += matriz[i][j]; // Suma de la fila
                matriz[n][j] += matriz[i][j]; // Suma de la columna
                if (i == j) matriz[n][n] += matriz[i][j]; // Suma diagonal
            }
        }

        // Búsqueda de mayor/menor
        int mayor = matriz[0][0], menor = matriz[0][0];
        int fMax = 0, cMax = 0, fMin = 0, cMin = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > mayor) { mayor = matriz[i][j]; fMax = i; cMax = j; }
                if (matriz[i][j] < menor) { menor = matriz[i][j]; fMin = i; cMin = j; }
            }
        }

        // Visualización
        System.out.println("
--- MATRIZ RESULTANTE (Bordes son sumas) ---");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(matriz[i][j] + "	");
            }
            System.out.println();
        }

        System.out.println("
Mayor: " + mayor + " en [" + fMax + "," + cMax + "]");
        System.out.println("Menor: " + menor + " en [" + fMin + "," + cMin + "]");
    }
}
