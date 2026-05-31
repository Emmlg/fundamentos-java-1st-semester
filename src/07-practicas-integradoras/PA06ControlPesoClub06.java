/**
 * PRÁCTICA INTEGRADORA: Control de Peso (Club de Obesidad)
 * ---------------------------------------------------------------
 * Concepto: Ciclos for anidados, promedios y lógica de comparación.
 * 
 * DESCRIPCIÓN: 
 * Programa que ayuda a 5 miembros de un club a monitorear su peso. 
 * Cada persona se pesa en 10 básculas distintas para obtener un 
 * promedio exacto. Luego, el programa compara este promedio con su 
 * peso anterior para determinar si subió, bajó o se mantuvo.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 15 de Octubre 2021
 */
package integradoras;

import java.util.Scanner;

public class PA06ControlPesoClub06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("
--- Miembro " + i + " ---");
            System.out.print("¿Cuál fue su peso anterior (kg)?: ");
            float pesoAnterior = leer.nextFloat();
            
            float sumaBasculas = 0;
            for (int j = 1; j <= 10; j++) {
                System.out.print("  Peso en báscula " + j + ": ");
                sumaBasculas += leer.nextFloat();
            }
            
            float promedioActual = sumaBasculas / 10;
            float diferencia = promedioActual - pesoAnterior;

            if (Math.abs(diferencia) < 0.1) {
                System.out.println("Resultado: IGUAL (Peso: " + promedioActual + " kg)");
            } else if (diferencia > 0) {
                System.out.println("Resultado: SUBIÓ " + diferencia + " kg");
            } else {
                System.out.println("Resultado: BAJÓ " + Math.abs(diferencia) + " kg");
            }
        }
    }
}
