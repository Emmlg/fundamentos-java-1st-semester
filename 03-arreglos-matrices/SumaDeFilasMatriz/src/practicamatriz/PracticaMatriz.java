/*
 crear una tabla que sume todo las columnas de ofma vertical y muestre cu resultado
asi como las filas y la suma diagonal.
 */
package practicamatriz;

import java.util.Scanner;

/**@author Emmanuel de Jesús lópez gómez 23/11/2021
 */
public class PracticaMatriz {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int col,fil,tam;
       do{ System.out.print("Digite el tamanio de su matriz,debe ser mayor a 2:");
        tam=leer.nextInt();}while(tam<2);
        //A)creacion  de la matrz
        int pmatriz[][];
        pmatriz=new int [tam+1][tam+1];
   //B)asignacion de los valores de la matriz     
        
       for(fil=0;fil<=tam;fil++){
         for(col=0;col<=tam;col++){
          pmatriz[fil][col]=0;   
             
         }//
         }//fin del for
       
       
 //C) lectura de la matriz
        for(fil=0;fil<tam;fil++){
         for(col=0;col<tam;col++){
             System.out.print("coloca los valores ["+fil+","+col+"]:"); 
             pmatriz[fil][col]=leer.nextInt();
         }//
         }//fin del for
 
 //D)solucion
//suma de columnas
         for(fil=0;fil<tam;fil++){
         for(col=0;col<tam;col++){
             pmatriz[fil][tam]=pmatriz[fil][tam]+pmatriz[fil][col];
         }//
         
         }//fin del for
         
         //suma filas
          for(fil=0;fil<tam;fil++){
         for(col=0;col<tam;col++){
             pmatriz[tam][col]=pmatriz[tam][col]+pmatriz[fil][col];
         }//
       }//fin del for
          
          //suma de diagonal
          
              for(fil=0;fil<tam;fil++){
         for(col=0;col<tam;col++){
             if(fil==col){
             pmatriz[tam][tam]=pmatriz[tam][tam]+pmatriz[fil][col];
             }
         }//
       }//fin del for      
          
        //busqueda de un numero mayor
        int mayor=-32767,pxf = 0,pxc = 0;
                  for(fil=0;fil<tam;fil++){
         for(col=0;col<tam;col++){
             if(mayor<pmatriz[fil][col]){
             mayor=pmatriz[fil][col];
             pxf=fil;
             pxc=col;
             }
         }//
       }//fin del for    
        //busqueda del numero menor
        
 int menor=32767,pc = 0,pf = 0;
                  for(fil=0;fil<tam;fil++){
         for(col=0;col<tam;col++){
             if(menor>pmatriz[fil][col]){
             menor=pmatriz[fil][col];
             pc=col;
             pf=fil;
             }
         }//
       }//fin del for           
          
          
 
 //E) salida de la matriz
        
          for(fil=0;fil<=tam;fil++){
         for(col=0;col<=tam;col++){
             System.out.print(pmatriz[fil][col]+"    ");
             
         }//
              System.out.println("");
         }//fin del for     
        System.out.println("el numero mayor es: "+mayor);
        System.out.println("esta en la posicion: "+pxf+","+pxc);
        System.out.println("el numero menor es: "+menor);
        System.out.println("esta en la posicion: "+pf+","+pc);
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
