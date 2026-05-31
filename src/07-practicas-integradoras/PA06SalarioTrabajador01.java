/**
 * PRÁCTICA INTEGRADORA: Salario de Trabajador (Horas Extras)
 * ---------------------------------------------------------------
 * Concepto: Lógica condicional anidada y cálculo de tarifas dobles/triples.
 * 
 * DESCRIPCIÓN: 
 * Calcula el salario semanal de un trabajador considerando:
 * - Horas normales: 40 primeras horas.
 * - Horas extras (1-8): Se pagan al doble.
 * - Horas extras (+8): El exceso de 8 se paga al triple.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 14 de Octubre 2021
 */
package integradoras;

import java.util.Scanner;

public class PA06SalarioTrabajador01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("¿Cuántas horas trabajó?: ");
        int h = leer.nextInt();
        System.out.print("¿Cuánto gana por hora?: ");
        float cuota = leer.nextFloat();
        
        float salario;
        if (h <= 40) {
            salario = h * cuota;
        } else {
            int extras = h - 40;
            if (extras <= 8) {
                salario = (40 * cuota) + (extras * cuota * 2);
            } else {
                int extrasTriples = extras - 8;
                salario = (40 * cuota) + (8 * cuota * 2) + (extrasTriples * cuota * 3);
            }
        }

        System.out.println("
Su salario total es de: $" + salario);
    }
}
