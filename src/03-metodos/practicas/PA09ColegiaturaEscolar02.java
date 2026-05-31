/**
 * EJERCICIO: Cálculo de Colegiatura Escolar
 * ---------------------------------------------------------------
 * Concepto: Modularización, funciones con parámetros y lógica de descuentos.
 * 
 * DESCRIPCIÓN: 
 * Determina el monto a pagar por un alumno basándose en el número de 
 * materias y su promedio. Si el promedio >= 9, aplica 30% de descuento 
 * y exención de IVA. De lo contrario, cobra colegiatura completa + 10% IVA.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Mayo 2021
 */
package practicas;

import java.util.Scanner;

public class PA09ColegiaturaEscolar02 {
    public static Scanner leer = new Scanner(System.in);

    /**
     * Calcula la colegiatura base según el número de materias.
     */
    public static float calcularColegiaturaBase() {
        System.out.print("¿Cuántas materias tienes?: ");
        int totalMaterias = leer.nextInt();
        System.out.print("¿Cuánto pagas por materia?: ");
        float pagoMateria = leer.nextFloat();
        return totalMaterias * pagoMateria;
    }

    /**
     * Calcula el pago final aplicando descuentos o impuestos según promedio.
     */
    public static float calcularPagoFinal() {
        float base = calcularColegiaturaBase();
        System.out.print("¿Cuál es tu promedio?: ");
        float promedio = leer.nextFloat();
        
        if (promedio >= 9) {
            return base * 0.70f; // 30% descuento, sin IVA
        } else {
            return base * 1.10f; // Sin descuento + 10% IVA
        }
    }

    public static void main(String[] args) {
        float total = calcularPagoFinal();
        System.out.println("El pago total de colegiatura es: $" + total);
    }
}
