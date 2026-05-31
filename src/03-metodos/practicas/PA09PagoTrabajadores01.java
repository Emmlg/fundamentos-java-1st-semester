/**
 * EJERCICIO: Pago de Trabajadores GACMAN
 * ---------------------------------------------------------------
 * Concepto: Modularización, acumuladores y condicionales de impuestos.
 * 
 * DESCRIPCIÓN: 
 * Calcula el pago de trabajadores diferenciando entre obreros y empleados. 
 * Aplica un 10% de impuesto si el pago excede los 00,000. 
 * Al final muestra los totales acumulados por cada tipo de trabajador.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Mayo 2021
 */
package practicas;

import java.util.Scanner;

public class PA09PagoTrabajadores01 {
    public static Scanner leer = new Scanner(System.in);

    public static int seleccionarTipoTrabajador() {
        int tipo;
        do {
            System.out.print("Escribe: 1.-Obrero, 2.-Empleado: ");
            tipo = leer.nextInt();
        } while (tipo < 1 || tipo > 2);
        return tipo;
    }

    public static float calcularSueldoIndividual() {
        System.out.print("¿Cuántas horas trabajas?: ");
        int horas = leer.nextInt();
        System.out.print("¿Cuánto ganas por hora?: ");
        float cuota = leer.nextFloat();
        float subtotal = horas * cuota;
        
        if (subtotal >= 100000) {
            return subtotal * 1.10f; // 10% impuesto (sumado)
        }
        return subtotal;
    }

    public static void main(String[] args) {
        float totalObreros = 0, totalEmpleados = 0;
        int continuar;
        
        do {
            int tipo = seleccionarTipoTrabajador();
            float sueldo = calcularSueldoIndividual();
            
            if (tipo == 1) totalObreros += sueldo;
            else totalEmpleados += sueldo;
            
            System.out.print("¿Desea continuar? (1-Si, 2-No): ");
            continuar = leer.nextInt();
        } while (continuar == 1);
        
        System.out.println("Total pagado a Obreros: $" + totalObreros);
        System.out.println("Total pagado a Empleados: $" + totalEmpleados);
    }
}
