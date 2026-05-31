/**
 * EJERCICIO: Demostración de Métodos (Números Primos)
 * ---------------------------------------------------------------
 * Concepto: Definición de métodos, modularidad y lógica de números primos.
 * 
 * DESCRIPCIÓN: 
 * Programa que utiliza métodos personalizados para verificar si un 
 * número es primo e imprimir una lista de números primos dentro de 
 * un rango definido (start a end).
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Mayo 2021
 */
package metodos;

public class DemoMetodos {
    
    public static void main(String[] args) {
        printprimeBetween(10, 30);
    }
    
    /**
     * Verifica si un número dado es primo.
     */
    public static boolean isPrime(int nn) {
        if (nn < 2) return false;
        for (int i = 2; i <= Math.sqrt(nn); i++) {
            if (nn % i == 0) return false;
        }
        return true;
    }
    
    /**
     * Imprime todos los números primos en un rango específico.
     */
    public static void printprimeBetween(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}
