/**
 * EJERCICIO: Buscador de Mayor y Menor en Matriz
 * ---------------------------------------------------------------
 * Concepto: Matrices dinámicas, sumas perimetrales y búsqueda de extremos.
 * 
 * DESCRIPCIÓN: 
 * Programa que genera una matriz de N x N. Calcula sumas de filas, 
 * columnas y diagonal principal. Identifica el valor mayor y menor 
 * con sus coordenadas específicas.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 23 de Noviembre 2021
 */
package practicas;

import java.util.Scanner;

public class BuscadorMayorMenorMatriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("Tamaño de la matriz (N > 2): ");
            n = leer.nextInt();
        } while (n < 2);

        int[][] matriz = new int[n + 1][n + 1];

        // Lectura y sumas automáticas
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
                matriz[i][n] += matriz[i][j]; // Suma fila
                matriz[n][j] += matriz[i][j]; // Suma columna
                if (i == j) matriz[n][n] += matriz[i][j]; // Suma diagonal
            }
        }

        // Búsqueda de extremos
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        int fMax = 0, cMax = 0, fMin = 0, cMin = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > mayor) { mayor = matriz[i][j]; fMax = i; cMax = j; }
                if (matriz[i][j] < menor) { menor = matriz[i][j]; fMin = i; cMin = j; }
            }
        }

        // Visualización
        System.out.println("
--- RESULTADOS ---");
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
