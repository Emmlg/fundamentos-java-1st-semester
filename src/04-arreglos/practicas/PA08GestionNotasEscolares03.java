/**
 * EJERCICIO: Gestión de Notas Escolares (Matemáticas)
 * ---------------------------------------------------------------
 * Concepto: Arreglos paralelos, validación de datos y búsqueda de extremos.
 * 
 * DESCRIPCIÓN: 
 * Programa que gestiona las calificaciones de una clase. Utiliza múltiples 
 * arreglos para almacenar número de lista, unidades (1-5) y promedio.
 * Incluye validación de rango (0-10) y determina aprobados, reprobados 
 * y los promedios más altos/bajos con su respectiva posición.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Noviembre 2021
 */
package practicas;

import java.util.Scanner;

public class PA08GestionNotasEscolares03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numAlumnos;

        System.out.print("¿Cuántos alumnos son?: ");
        numAlumnos = leer.nextInt();
        if (numAlumnos < 1) return;

        int[] lista = new int[numAlumnos];
        int[][] unidades = new int[numAlumnos][5];
        float[] promedios = new float[numAlumnos];

        // Llenado de datos con validación
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("
--- Alumno " + (i + 1) + " ---");
            System.out.print("Número de lista: ");
            lista[i] = leer.nextInt();

            int suma = 0;
            for (int j = 0; j < 5; j++) {
                do {
                    System.out.print("Calificación Unidad " + (j + 1) + ": ");
                    unidades[i][j] = leer.nextInt();
                } while (unidades[i][j] < 0 || unidades[i][j] > 10);
                suma += unidades[i][j];
            }
            promedios[i] = (float) suma / 5;
        }

        // Análisis de resultados
        int aprobados = 0, reprobados = 0;
        int posAlto = 0, posBajo = 0;

        for (int i = 0; i < numAlumnos; i++) {
            if (promedios[i] >= 6) aprobados++;
            else reprobados++;

            if (promedios[i] > promedios[posAlto]) posAlto = i;
            if (promedios[i] < promedios[posBajo]) posBajo = i;
        }

        // Reporte final
        System.out.println("
#Lista	U1	U2	U3	U4	U5	Prom");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print(lista[i] + "	");
            for (int j = 0; j < 5; j++) System.out.print(unidades[i][j] + "	");
            System.out.println(String.format("0.00", promedios[i]));
        }

        System.out.println("
Aprobados: " + aprobados + " | Reprobados: " + reprobados);
        System.out.println("Promedio más alto: " + promedios[posAlto] + " (Lista: " + lista[posAlto] + ")");
        System.out.println("Promedio más bajo: " + promedios[posBajo] + " (Lista: " + lista[posBajo] + ")");
    }
}
