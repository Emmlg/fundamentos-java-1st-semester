/**
 * EJERCICIO: Clasificador de Números Pares e Impares
 * ---------------------------------------------------------------
 * Concepto: Arreglos aleatorios, condicionales y filtrado de datos.
 * 
 * DESCRIPCIÓN: 
 * Genera números aleatorios y los clasifica. El objetivo es organizar 
 * los números pares en las primeras posiciones y los impares en las 
 * restantes, demostrando lógica de ordenamiento básico con arreglos.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 13 de Noviembre 2021
 */
package practicas;

import java.util.Scanner;

public class PA08ClasificadorParesImpares01 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contPar = 0, contImpar = 0;

        System.out.println("Generando 20 números aleatorios...");
        for (int i = 0; i < 20; i++) {
            numeros[i] = (int) (Math.random() * 101);
            if (numeros[i] % 2 == 0) {
                pares[contPar++] = numeros[i];
            } else {
                impares[contImpar++] = numeros[i];
            }
        }

        System.out.println("
--- RESULTADOS (Pares primero, Impares después) ---");
        for (int i = 0; i < contPar; i++) System.out.print(pares[i] + " ");
        for (int i = 0; i < contImpar; i++) System.out.print(impares[i] + " ");
        System.out.println();
    }
}
