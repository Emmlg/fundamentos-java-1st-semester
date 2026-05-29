/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmacia_del_ahorro;

import java.util.Scanner;

/**
 *
 * @author emmanuel
 */
public class Farmacia_del_Ahorro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
