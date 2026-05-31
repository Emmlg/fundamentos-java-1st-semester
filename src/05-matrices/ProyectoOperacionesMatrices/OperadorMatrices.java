/**
 * EJERCICIO: Operador de Matrices (Clase de Lógica)
 * ---------------------------------------------------------------
 * Concepto: Atributos, constructores, métodos de instancia y algoritmos matriciales.
 * 
 * DESCRIPCIÓN: 
 * Clase que encapsula la lógica para operar dos matrices cuadradas. 
 * Incluye métodos para sumar, restar y multiplicar matrices 
 * (algoritmo de producto punto).
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 2021
 */
package matrices.proyecto;

public class OperadorMatrices {
    private int[][] m1, m2, resultado;
    private int n;

    public OperadorMatrices(int n, int[][] m1, int[][] m2) {
        this.n = n;
        this.m1 = m1;
        this.m2 = m2;
        this.resultado = new int[n][n];
    }

    public void mostrarMatrices() {
        System.out.println("
--- Matriz 1 ---");
        imprimir(m1);
        System.out.println("
--- Matriz 2 ---");
        imprimir(m2);
    }

    private void imprimir(int[][] m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(m[i][j] + "	");
            System.out.println();
        }
    }

    public void sumar() {
        System.out.println("
--- Resultado Suma ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j];
                System.out.print(resultado[i][j] + "	");
            }
            System.out.println();
        }
    }

    public void restar() {
        System.out.println("
--- Resultado Resta ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = m1[i][j] - m2[i][j];
                System.out.print(resultado[i][j] + "	");
            }
            System.out.println();
        }
    }

    public void multiplicar() {
        System.out.println("
--- Resultado Multiplicación ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
                System.out.print(resultado[i][j] + "	");
            }
            System.out.println();
        }
    }
}
