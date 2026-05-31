/**
 * EJERCICIO: Condición y Agrupadores (Inversión y Crédito)
 * ---------------------------------------------------------------
 * Concepto: Estructuras condicionales, operadores de comparación y finanzas básicas.
 * 
 * DESCRIPCIÓN: 
 * Programa que determina la forma de pago para una compra de refacciones.
 * Si el monto excede los $50,000:
 * - 55% inversión propia, 30% préstamo bancario, 15% crédito fabricante.
 * Si el monto es menor o igual:
 * - 70% inversión propia, 30% crédito fabricante (con 20% de interés).
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package condicionales;

import java.util.Scanner;

public class CondicionAgrupadores {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int piezas;
        float efectivo,ppz,mt,banco,prestamo,interes = 0;
        
        System.out.println("¿ cuàl fue el  total de piezas? ");
        piezas=leer.nextInt();
        System.out.println("¿ cuàl fue el precio de la pieza? ");
        ppz=leer.nextFloat();
        
        mt=piezas*ppz;
        System.out.println("el precio total es: "+mt);
        
       /*  if(mt>=50000){
            efectivo=(float) (mt*.55);
            banco=(float) (mt*.30);
            prestamo=(float) (mt*.15);
            
            System.out.println("El dinero a pagar en efectivo es: "+efectivo);
            System.out.println("El dinero a pedir prestamo en el banco es : "+banco);
            System.out.println("El dinero a pedir en credito con el fabricante es: "+prestamo);
             }
        else{
           
            efectivo=(float) (mt*.70);
            prestamo=(float) (mt*.30);
            interes=(float) (prestamo*.15);
            
            System.out.println("El dinero a pagar en efectivo es: "+efectivo);
            System.out.println("El dinero a pedir a credito con el fabricante es : "+prestamo);
            System.out.println("El dinero a pedir en credito con el fabricante mas el interes es: "+interes);
            }
        */
       if(mt>50000){
            efectivo=(float) (mt*.55);
            banco=(float) (mt*.30);
            prestamo=(float) (mt*.15); 
       }
        else{
           
            efectivo=(float) (mt*.70);
            banco=0;
            prestamo=(float) (mt*.30);  
        }
        interes=(float) (prestamo*.20);
        
        System.out.println("El dinero a pagar en efectivo es: "+efectivo);
        System.out.println("el dinero a pagar con el banco es: "+banco);
        System.out.println("El dinero a pedir a credito con el fabricante es : "+prestamo);
        System.out.println("El dinero a pedir en credito con el fabricante mas el interes es: "+interes);
       
        
    }
    
}
