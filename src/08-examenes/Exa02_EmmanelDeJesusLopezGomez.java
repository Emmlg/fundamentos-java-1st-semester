/**
 * EXAMEN 02: Gestión de Pagos de Refacciones
 * ---------------------------------------------------------------
 * Concepto: Cálculos porcentuales, manejo de tipos (float) y flujo lineal.
 * 
 * DESCRIPCIÓN: 
 * Una empresa compra piezas de refacción. El programa calcula el desglose 
 * del pago: 55% en efectivo, 30% en cheque bancario y 15% a crédito. 
 * Adicionalmente, calcula un 20% de interés sobre el monto a crédito 
 * y muestra el total final a pagar al fabricante.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 2021
 */
package examenes;

import java.util.Scanner;

public class Exa02_EmmanelDeJesusLopezGomez {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float gastoTotal, efectivo, cheque, credito, interesCredito, totalCredito;

        System.out.print("¿Cuál fue el gasto total de las refacciones?: ");
        gastoTotal = leer.nextFloat();

        efectivo = gastoTotal * 0.55f;
        cheque = gastoTotal * 0.30f;
        credito = gastoTotal * 0.15f;
        interesCredito = credito * 0.20f;
        totalCredito = credito + interesCredito;

        System.out.println("
--- DESGLOSE DE PAGO ---");
        System.out.println("Efectivo (55%): $" + efectivo);
        System.out.println("Cheque Bancario (30%): $" + cheque);
        System.out.println("Crédito con Interés (15% + 20% int): $" + totalCredito);
    }
}
