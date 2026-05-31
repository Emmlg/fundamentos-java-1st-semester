/**
 * EJERCICIO: Gestión de Calificaciones (Programación)
 * ---------------------------------------------------------------
 * Concepto: Matrices de gran escala, criterios de aprobación y máximos.
 * 
 * DESCRIPCIÓN: 
 * Administra las notas de 30 alumnos en 5 unidades. Calcula promedios, 
 * determina quiénes aprueban (min 70), quiénes van a segunda 
 * oportunidad (max 2 unidades reprobadas) e identifica los mejores promedios.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Noviembre 2021
 */
package practicas;

import java.util.Scanner;

public class PA08GestionCalificacionesProgramacion04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final int ALUMNOS = 30;
        int[][] notas = new int[ALUMNOS][7]; // [Lista, U1, U2, U3, U4, U5, Prom]
        
        int aprobados = 0, derechoSegunda = 0;

        for (int i = 0; i < ALUMNOS; i++) {
            System.out.print("Alumno " + (i + 1) + " - Num. Lista: ");
            notas[i][0] = leer.nextInt();
            
            int suma = 0, reprobadas = 0;
            for (int j = 1; j <= 5; j++) {
                do {
                    System.out.print("  Unidad " + j + ": ");
                    notas[i][j] = leer.nextInt();
                } while (notas[i][j] < 0 || notas[i][j] > 100);
                
                suma += notas[i][j];
                if (notas[i][j] < 70) reprobadas++;
            }
            
            notas[i][6] = suma / 5;
            if (notas[i][6] >= 70) aprobados++;
            if (reprobadas < 3) derechoSegunda++;
        }

        // Búsqueda del máximo promedio
        int maxProm = 0;
        for (int i = 0; i < ALUMNOS; i++) {
            if (notas[i][6] > maxProm) maxProm = notas[i][6];
        }

        System.out.println("
--- REPORTE FINAL ---");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Con derecho a 2da oportunidad: " + derechoSegunda);
        System.out.println("Máximo promedio obtenido: " + maxProm);
        System.out.print("Alumnos con máximo promedio (Lista): ");
        for (int i = 0; i < ALUMNOS; i++) {
            if (notas[i][6] == maxProm) System.out.print(notas[i][0] + " ");
        }
        System.out.println();
    }
}
