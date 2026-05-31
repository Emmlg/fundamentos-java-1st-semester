/**
 * EXAMEN: Cálculo de Comisiones por Ventas
 * ---------------------------------------------------------------
 * Concepto: Ciclos do-while, acumuladores y cálculos de comisiones.
 * 
 * DESCRIPCIÓN: 
 * Una compañía de seguros paga un sueldo base más un 10% de comisiones 
 * sobre tres ventas semanales. El programa calcula el ingreso total 
 * de cada vendedor y el monto total que la empresa pagará a N vendedores.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 25 de Octubre 2021
 */
package examenes;

import java.util.Scanner;

public class ExamenEmmlgComisionesVentas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float salario, v1, v2, v3, venta, comision, sueldoT, totalEmpresa = 0;
        int continuar;

        do {
            System.out.println("
--- REGISTRO DE VENDEDOR ---");
            System.out.print("Sueldo base: ");
            salario = leer.nextFloat();
            System.out.print("Monto Venta 1: ");
            v1 = leer.nextFloat();
            System.out.print("Monto Venta 2: ");
            v2 = leer.nextFloat();
            System.out.print("Monto Venta 3: ");
            v3 = leer.nextFloat();

            venta = v1 + v2 + v3;
            comision = venta * 0.10f;
            sueldoT = salario + comision;

            System.out.println("Comisión ganada: $" + comision);
            System.out.println("Sueldo total semanal: $" + sueldoT);

            totalEmpresa += sueldoT;

            System.out.println("---------------------------------------------");
            System.out.print("¿Ingresar otro vendedor? (1-Si, 2-Ver Total): ");
            continuar = leer.nextInt();
        } while (continuar == 1);

        System.out.println("
Total a pagar por la empresa a todos los vendedores: $" + totalEmpresa);
    }
}
