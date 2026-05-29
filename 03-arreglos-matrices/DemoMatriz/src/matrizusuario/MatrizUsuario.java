/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizusuario;

import java.util.Scanner;

/**
 *
 * @author Emmanuel
 */
public class MatrizUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        
        
        
// A) declaracion de la matriz

int m = 0,n = 0,f,c;

System.out.println("digite el numero de Filas que desee:");
       m=leer.nextInt();
       System.out.println("digite el numero de columnas que desee:");
       n=leer.nextInt();

int maUsuario [][];  
maUsuario = new int [m][n+1];

        
       
       
       
       
// B) inicializar la matriz

for(f=0;f<m;f++){ 
         for(c=0;c<=n;c++){// como se agrego una columna 
           maUsuario[f][c]=0;
         }//fin del for anidado de columna
      }//fin del for filas



// C)   llenado de la matriz


     for(f=0;f<m;f++){
         for(c=0;c<n;c++){
             System.out.println("Escribe los datos ["+f+","+c+" ] :");
             maUsuario[f][c]=leer.nextInt();
         }//fin del for anidado de columna     
     }//fin del for filas
     
     
     
     
// D)solucion del problema
    // int Asumaf=0;
        
             for(f=0;f<m;f++){
                 //Asumaf=0;
              for(c=0;c<n;c++){
             maUsuario[f][n]=maUsuario[f][n]+maUsuario[f][c];
             //Asumaf=Asumaf+maUsuario[f][c];
             
                }//fin del for anidado de columna    
             System.out.println(" ");
             // maUsuario[f][n]=Asumaf;
             }//fin del for filas

      



// E) salida de la matriz y resultado
  

            for(f=0;f<m;f++){
             for(c=0;c<=n;c++){
             System.out.print(maUsuario[f][c]+" ");         
                }//fin del for anidado de columna    
             System.out.println(" ");
          }//fin del for filas
        
        
    }
    
}
