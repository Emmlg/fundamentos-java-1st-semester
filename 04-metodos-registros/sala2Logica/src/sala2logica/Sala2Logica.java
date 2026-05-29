/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala2logica;

import java.util.Scanner;

/**
 *Autor: Emmanuel de jesus Lopez Gomez
 * no.de control:21700198
 * problema: almacenes esteban ofrece un descuentodel 10%
 * a todos los clientes del sexo femenino cuyo monto de compra
 * sea de $2000 o mas. calcular el total a pagar de un cliente
 * 
 * infresa el monto de la compra:
 * ingresa tu genero
 * 
 * @author Emmanuel
 */

public class Sala2Logica {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
        
        int g = 0;
        float monto,descuento = 0,total=0;
        
        System.out.println("ingresa el monto de la comprea: ");
        monto=leer.nextInt();
        System.out.println("ingresa tu genero 1-Masculino 2-femenino:");
        g=leer.nextInt();
        
       if(g==2 && monto>=200){
                  descuento=(float) (monto*.10);
                 total=monto-descuento;
        System.out.println("el total a pagar es:"+total);
       }
        else{
        System.out.println("el total es:"+monto);
                } 
          /*
       if(g==2 && monto>=2000)
               descuento=monto*.10;
       else
       descuento=0;
        
       total=monto-descuento;
       System.out.println("el total a pagar es:"+total);
       
       
       */
       
       /*switch(g){    //corregir el float por int
       case 1:  System.out.println("el total es:"+monto);
          break;
      case 2: if(monto>=2000)
          descuento=(int) (monto*.10);
                        total=monto-descuento;
                       System.out.println("el total a pagar es:"+total);
                     break;
       default:    System.out.println("error!..solo numeros 1 y 2.");
       }
           */
        
        
   //no tocar     
    }
    
}
