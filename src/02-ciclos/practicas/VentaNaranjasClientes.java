/**
 * EJERCICIO: Venta de Naranjas con Descuento
 * ---------------------------------------------------------------
 * Concepto: Ciclo for, condicionales y cálculo de porcentajes.
 * 
 * DESCRIPCIÓN: 
 * Una tienda de naranjas ofrece un 15% de descuento si la compra 
 * excede los 10kg. El programa procesa a 15 clientes, calculando 
 * el pago de cada uno y la ganancia total de la tienda.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 21 de Octubre 2021
 */
package practicas;

import java.util.Scanner;

public class VentaNaranjasClientes {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int personas, kilos;
        float precio, total, descuento, pago, pagofinal = 0;
        
        for(personas=1; personas<=15; personas++){
            System.out.println("Cliente numero: "+personas+" ¿cuántos kilos compró?");
            kilos=leer.nextInt();
            System.out.print("Precio por kilo: ");
            precio=leer.nextFloat(); 
            total=precio*kilos;
            
            if(kilos>10) descuento = total * 0.15f;
            else descuento = 0;
            
            pago = total - descuento;
            System.out.println("El precio a pagar es: "+pago);
            pagofinal += pago;
        }
        System.out.println("La ganancia total del día es: "+pagofinal);
    }
}
