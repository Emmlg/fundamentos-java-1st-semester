/**
 * EJERCICIO: Main de Operaciones con Matrices
 * ---------------------------------------------------------------
 * Concepto: Programación Orientada a Objetos (POO), interacción con clases.
 * 
 * DESCRIPCIÓN: 
 * Clase principal que gestiona la entrada de datos para dos matrices 
 * cuadradas y utiliza la clase OperadorMatrices para realizar 
 * operaciones de suma, resta y multiplicación.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 2021
 */
package matrices.proyecto;

import java.util.Scanner;

public class MainOperacionesMatrices {
    static Scanner leer = new Scanner(System.in);
    static int tamanio;
    static int[][] m1;
    static int[][] m2;

    public static void capturarDatos() {
        System.out.print("Tamaño de las matrices cuadradas: ");
        tamanio = leer.nextInt();
        m1 = new int[tamanio][tamanio];
        m2 = new int[tamanio][tamanio];

        System.out.println("--- Matriz 1 ---");
        llenar(m1);
        System.out.println("--- Matriz 2 ---");
        llenar(m2);
    }

    private static void llenar(int[][] m) {
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print("Pos [" + i + "][" + j + "]: ");
                m[i][j] = leer.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        capturarDatos();
        OperadorMatrices op = new OperadorMatrices(tamanio, m1, m2);
        op.mostrarMatrices();
        op.sumar();
        op.restar();
        op.multiplicar();
    }
}
