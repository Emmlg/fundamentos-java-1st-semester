/**
 * EJERCICIO: Descuento por Fichas
 * ---------------------------------------------------------------
 * Concepto: Control Structures (Switch/Conditional)
 * 
 * DESCRIPCIÓN: 
 * En una tienda de descuento se afecta una promoción en la cual 
 * se hace un descuento sobre el valor de la compra total según el 
 * color de la ficha que el cliente saque de una urna oscura.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: October 2021
 */
package practicas;

import java.util.Scanner;

public class DescuentoPorFichas {

    public static void main(String[] args) {
        Scanner nuevo=new Scanner(System.in);
        
       int monto,descuento = 0,total,fr=0,fa=0,fv=0,fn=0,faz=0,fb=0,ficha;
       
        System.out.println("ingresa el total del monto de compra:");
         monto=nuevo.nextInt();
         System.out.println("colocar 1-rojo,2-Amarillo,3-verde,4-Negro,5-Azul,6-Blanco.");
         System.out.println("¿Que color de ficha obtuvo?");
         ficha=nuevo.nextInt();
         
  /*       //cascada 
        if(ficha==1){
         descuento=monto*1;}
        if(ficha==2){
         descuento=(int) (monto*.75);}
        if(ficha==3){
         descuento=(int) (monto*.50);}
        if(ficha==4){
         descuento=(int) (monto*.25);}
        if(ficha==5){
         descuento=(int) (monto*.10);}
        if(ficha==6){
         descuento=0;}
        total=monto-descuento;
        System.out.println("El total de la compra es:"+total);   */
        ///*
         //switch
        switch(ficha){
            case 1:descuento=monto*1;  break;
            case 2: descuento=(int) (monto*.75); break;
            case 3:descuento=(int) (monto*.50); break;
            case 4:descuento=(int) (monto*.25);break;
            case 5:descuento=(int) (monto*.10);break;
            case 6:descuento=0;break;
            default: System.out.println("Error!! solo numeos del 1 al 6..."); }
        total=monto-descuento;
        System.out.println("el total de la compra es:"+total);  // */
        
    /*    //anidado  
        if(ficha==1){
        descuento=monto*1;
        }
        else{
            if(ficha==2)
                descuento=(int) (monto*.75);
            else
                if(ficha==3)
                 descuento=(int) (monto*.50);
                 else
                    if(ficha==4)
                    descuento=(int) (monto*.25);
                    else
                        if(ficha==5)
                          descuento=(int) (monto*.10);
                         else
                            descuento=0;
        }
                             total=monto-descuento;
        System.out.println("el total de la compra es:"+total);  */
        
        
    
     //noo  
    }
    
}





