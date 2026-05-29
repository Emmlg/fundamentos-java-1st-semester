/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoarray;

import java.util.Scanner;

/**@author Emmanuel 26/oct/2021
 *no.Control:
 * 
 */
public class DemoArray {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        final int c=10;
        int i=0,Asuma=0,promedioF;
       
        
        int promedio[];
        promedio=new int [c];
        
         
         
         for( i=0;i<c;i++){
         promedio[i]=0;
         
         
         }
       Asuma=0;
       for( i=0;i<c;i++){
           System.out.println("escribe los elementos no. "+i+":");
           promedio[i]=leer.nextInt();
         Asuma=Asuma+promedio[i];
         }
       
       promedioF=Asuma/10;
       
        System.out.println("el promedio es:"+promedioF);
       
       
     /*  for( i=0;i<c;i++){
           System.out.println(promedio[i]);
          
         
         
         }*/
        
        //
        
    }
    
}
