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
public class Piramide {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
    
    //crea la cantidad de * que escribas  creando una piramide
    
 /*   int l,can;
    
         System.out.print("escribe la cantidad de estrelleas que quieres que cree: ");
         can=leer.nextInt();
    for(l=0;l<=can;l++){
        
        for(int s=1;s<=l;s++ )
            System.out.print("*");
    
            System.out.println( );
    }
    
         * 
         ** 
         *** 
    
    
    */
 
 // *-*-*-*-*-*--*-*-*-*-*-*-*-*-
    //crea la cantidad de * que escribas formando una piramide inversa
    
  /*  int n = 0;
    
         System.out.print("escribe la cantida de lineas * :");
        n=leer.nextInt();
    for(int  i=1;i<=n;i++){// este for sirve para el salto de linea
       for(int j=n;j>=i;j--)// este for es para los *
            System.out.print("*");
        System.out.println( );
    }
        *** 
        ** 
        *
    */
 // *-**-*-*-*-*-*-*-*-*-*-*--* 
  
 /* 
  // CREA UNA PIRAMIDE CON LA CANTIDAD QUE QUIERA
  
  int n;
  
   System.out.print("escribe la cantida de lineas * :");
        n=leer.nextInt();
        
  for(int i=1;i<=n;i++){// for de salto de  lineas
      
    for(int j=1; j<=n-i;j++)// crea espacio pero en realidad es coomo crear una piramide de espacio inverso
          System.out.print(" ");  
    
      for(int s=1; s<=i;s++)//for para imprimir *
          System.out.print("*");
  
      System.out.println();
  }
  
  */
  
  // *-*-*-*-*-*-*-*-*-*-*-*-*
 /* 
  int n;
  
         System.out.print("ingresa la cantidad de lineas d * :");
         n=leer.nextInt();
       
         
         for(int i=1;i<=n;i++){
      
          for(int j=n; j>n-i;j--)
          System.out.print(" ");  
    
           for(int k=n; k>=i;k--)
            System.out.print("*");
  
      System.out.println();
  }  
    
   ****
    ***
     **
      *
  */
  
  //*-*-*-*-*-*-*-*-*-*-*-*-*-*-
  
  // crea una piramide NORMAL
  
 int n;
 
         System.out.print("ingrese las lineas de las piramides: ");
       n=leer.nextInt();

           for(int i=1; i<=n;i++){
            for(int j=n;j>=i;j--)
                   System.out.print(" ");
               for(int k=1;k<=i*2;k++)
                   System.out.print("*");
               
               System.out.println();
           }

        
        
        
        
        //Done
    }
 
}
