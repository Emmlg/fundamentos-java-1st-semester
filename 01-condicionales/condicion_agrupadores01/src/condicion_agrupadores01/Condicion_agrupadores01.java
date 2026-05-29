/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicion_agrupadores01;

import java.util.Scanner;

/**
 *
 * @author Emmanuel
 */
public class Condicion_agrupadores01 {

    /**
     * @param args the command line arguments
     */
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
