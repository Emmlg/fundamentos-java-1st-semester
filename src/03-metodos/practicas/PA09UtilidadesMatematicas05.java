/**
 * EJERCICIO: Utilidades Matemáticas (Potencia)
 * ---------------------------------------------------------------
 * Concepto: Funciones con retorno y ciclos para cálculos matemáticos.
 * 
 * DESCRIPCIÓN: 
 * Función que calcula la potencia de un número (base^n) mediante 
 * multiplicaciones sucesivas dentro de un ciclo.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Mayo 2021
 */
package practicas;

import java.util.Scanner;

public class PA09UtilidadesMatematicas05 {
    public static Scanner leer = new Scanner(System.in);

    public static long calcularPotencia() {
        System.out.print("Escribe el número base: ");
        int base = leer.nextInt();
        System.out.print("Escribe el exponente: ");
        int exp = leer.nextInt();
        long resultado = 1;
        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int sino;
        do {
            System.out.println("El resultado es: " + calcularPotencia());
            System.out.print("¿Desea continuar? (1-Si, 2-No): ");
            sino = leer.nextInt();
        } while (sino == 1);
    }
}
