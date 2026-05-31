/**
 * EJERCICIO: Cálculo de Pulsaciones
 * ---------------------------------------------------------------
 * Concepto: Sequential Logic / Arithmetic
 * 
 * DESCRIPCIÓN: 
 * Calcular el número de pulsaciones que una persona debe tener 
 * por cada 10 segundos de ejercicio, si la fórmula es: 
 * número de pulsaciones = (220 – edad) / 10
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: October 2021
 */
package practicas;

import java.util.Scanner;

public class PA04PulsacionesEjercicio02 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float a,pul;
        
        System.out.println("¿cuál es tu edad?");
        a= entrada.nextFloat();
        pul=(220-a)/10;
        System.out.println("tu pulsacion es: "+pul);
   }
}
