/**
 * PRÁCTICA INTEGRADORA: Descuento en Frutería
 * ---------------------------------------------------------------
 * Concepto: Estructura switch-case y lógica de rangos.
 * 
 * DESCRIPCIÓN: 
 * Calcula el pago final por la compra de manzanas aplicando 
 * descuentos según el volumen: 
 * (0-2kg: 0%, 2-5kg: 10%, 5-10kg: 15%, +10kg: 20%).
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 15 de Octubre 2021
 */
package integradoras;

import java.util.Scanner;

public class PA06DescuentoFruteria03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Precio por kilo: ");
        float pK = leer.nextFloat();
        System.out.print("Kilos comprados: ");
        float nk = leer.nextFloat();
        
        float totalBruto = pK * nk;
        float descuento = 0;

        if (nk > 10) descuento = 0.20f;
        else if (nk > 5) descuento = 0.15f;
        else if (nk > 2) descuento = 0.10f;
        
        float pagoFinal = totalBruto * (1 - descuento);
        
        System.out.println("Subtotal: $" + totalBruto);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Total a pagar: $" + pagoFinal);
    }
}
