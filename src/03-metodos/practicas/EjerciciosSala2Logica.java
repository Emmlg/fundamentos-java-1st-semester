/**
 * EJERCICIO: Descuento Almacenes Esteban
 * ---------------------------------------------------------------
 * Concepto: Lógica condicional compleja (AND) y manejo de tipos (float/int).
 * 
 * DESCRIPCIÓN: 
 * Almacenes Esteban ofrece un descuento del 10% a clientes de sexo 
 * femenino cuya compra sea de 000 o más. El programa calcula 
 * el total a pagar basándose en el género y monto de compra.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package practicas;

import java.util.Scanner;

public class EjerciciosSala2Logica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int genero;
        float monto, descuento, total;
        
        System.out.print("Ingresa el monto de la compra: ");
        monto = leer.nextFloat();
        System.out.print("Ingresa género (1-Masculino, 2-Femenino): ");
        genero = leer.nextInt();
        
        if(genero == 2 && monto >= 2000) {
            descuento = monto * 0.10f;
        } else {
            descuento = 0;
        }
        
        total = monto - descuento;
        System.out.println("Total a pagar: $" + total);
    }
}
