/**
 * EJERCICIO: Cálculo de Factorial
 * ---------------------------------------------------------------
 * Concepto: Funciones con retorno y ciclos iterativos.
 * 
 * DESCRIPCIÓN: 
 * Escribe una función que calcula el factorial de un número 
 * proporcionado por el usuario.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Mayo 2021
 */
package practicas;

import java.util.Scanner;

public class PA09ConversorMetrico04 {
    public static Scanner leer = new Scanner(System.in);

    /**
     * Calcula el factorial de un número.
     */
    public static long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.print("Escribe el número para calcular su factorial: ");
        int num = leer.nextInt();
        System.out.println("El resultado es: " + calcularFactorial(num));
    }
}
