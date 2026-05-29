/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Scanner;

/**
 *
 * @author lopez
 */
public class Loops {
    public static void main(String[] args) {
        
             Scanner leer=new Scanner(System.in);
        
        
        int i,j,n;
        
        
            System.out.println("ingresa la cantidad de asterisco que desee:");
        n=leer.nextInt();
        
        for(i=1;i<=n;i++){
          for(j=1;j<=i;j++)
                System.out.print("*");
               System.out.println(" ");
        }
        
    //Done    
    }    
    
}
