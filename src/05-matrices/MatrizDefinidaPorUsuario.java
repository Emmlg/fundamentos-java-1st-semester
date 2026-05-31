/**
 * EJERCICIO: Matriz Definida por Usuario (Suma por Renglón)
 * ---------------------------------------------------------------
 * Concepto: Redimensionamiento dinámico y acumulación por filas.
 * 
 * DESCRIPCIÓN: 
 * Programa que permite al usuario definir las dimensiones de una 
 * matriz. Calcula la suma de cada renglón y guarda el resultado 
 * en una columna adicional al final de cada fila.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Noviembre 2021
 */
package matrices;

import java.util.Scanner;

public class MatrizDefinidaPorUsuario {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Número de filas: ");
        int m = leer.nextInt();
        System.out.print("Número de columnas: ");
        int n = leer.nextInt();

        int[][] matriz = new int[m][n + 1];

        // Llenado y suma por fila
        for (int f = 0; f < m; f++) {
            for (int c = 0; c < n; c++) {
                System.out.print("Dato [" + f + "][" + c + "]: ");
                matriz[f][c] = leer.nextInt();
                matriz[f][n] += matriz[f][c]; // Acumula en la última columna
            }
        }

        // Visualización
        System.out.println("
--- MATRIZ (Última columna es la suma de la fila) ---");
        for (int f = 0; f < m; f++) {
            for (int c = 0; c <= n; c++) {
                System.out.print(matriz[f][c] + "	");
            }
            System.out.println();
        }
    }
}
