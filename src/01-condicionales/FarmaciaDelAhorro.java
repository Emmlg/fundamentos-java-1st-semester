/**
 * EJERCICIO: Farmacia del Ahorro
 * ---------------------------------------------------------------
 * Concepto: Estructuras condicionales simples (if-else) y casting de tipos.
 * 
 * DESCRIPCIÓN: 
 * Programa que calcula el descuento de una compra en una farmacia.
 * Si el monto es mayor o igual a $500, se aplica un 10% de descuento.
 * De lo contrario, se aplica solo un 5%.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package condicionales;

import java.util.Scanner;

public class FarmaciaDelAhorro {

    public static void main(String[] args) {
        Scanner leet= new  Scanner(System.in);
        // TODO code application logic here
        Scanner leet= new  Scanner(System.in);
        
        float compra,decuento = 0,total;
        
        System.out.println("cuanto fue el total de la compra: ");
        compra= leet.nextFloat();
        
        if(compra>=500)
        decuento=(float) (compra*.10);                
        else        
        decuento= (float) (compra*.05);
        
        total=compra - decuento;
        
        System.out.println("El descuento es de : "+decuento);
        System.out.println("el total a pagar es de :"+total);
                    
        
        
            
            
            
            
            
        
        
    }
    
}
