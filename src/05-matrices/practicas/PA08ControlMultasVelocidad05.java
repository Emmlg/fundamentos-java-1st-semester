/**
 * EJERCICIO: Control de Multas por Velocidad
 * ---------------------------------------------------------------
 * Concepto: Matrices como bases de datos, cálculo de multas y cuadrantes.
 * 
 * DESCRIPCIÓN: 
 * Procesa infracciones de tránsito en 4 cuadrantes. Calcula multas 
 * basadas en un costo base (000) más un recargo por cada kph excedido (50). 
 * Genera un reporte tabular detallado.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 13 de Noviembre 2021
 */
package practicas;

import java.util.Scanner;

public class PA08ControlMultasVelocidad05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Cuántos vehículos procesar?: ");
        int n = leer.nextInt();

        int[][] multas = new int[n][5];

        for (int i = 0; i < n; i++) {
            System.out.println("
--- Vehículo " + (i + 1) + " ---");
            System.out.print("Registro: ");
            multas[i][0] = leer.nextInt();
            do {
                System.out.print("Cuadrante (1-4): ");
                multas[i][1] = leer.nextInt();
            } while (multas[i][1] < 1 || multas[i][1] > 4);
            System.out.print("Velocidad (kph): ");
            multas[i][2] = leer.nextInt();
            System.out.print("Límite (kph): ");
            multas[i][3] = leer.nextInt();

            if (multas[i][2] > multas[i][3]) {
                int exceso = multas[i][2] - multas[i][3];
                multas[i][4] = 1000 + (exceso * 250);
            } else {
                multas[i][4] = 0;
            }
        }

        System.out.println("
Reg	Cuad	Vel	Lim	Multa");
        for (int i = 0; i < n; i++) {
            System.out.println(multas[i][0] + "	" + multas[i][1] + "	" + multas[i][2] + "	" + multas[i][3] + "	$" + multas[i][4]);
        }
    }
}
