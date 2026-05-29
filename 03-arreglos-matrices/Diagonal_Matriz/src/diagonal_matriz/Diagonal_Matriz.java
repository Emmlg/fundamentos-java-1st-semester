/*  hacer un origrama que llene una matriz de mx n. calcular
 la suma de diagonal principal(de la esquina superior izquierda
a la esquina superior derecha)almacenarla en la posicion
[m+1,n+1]. mostrar matriz.
 */
package diagonal_matriz;

import java.util.Scanner;

/** @author Emmanuel de jesus Lopez Gomez 21700198
 * 9 nov-2021
 */
public class Diagonal_Matriz {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       // A) declaracion de la matriz
        int m = 0,n = 0,f,c;
        
      System.out.println("digite el numero de columnasque desee:");
       m=leer.nextInt();
       System.out.println("digite el numero de Filas  que desee:");
       n=leer.nextInt();
       
       int Mdiagonal [][];  
Mdiagonal = new int [m+1][n+1];

// B) inicializar la matriz

for(f=0;f<=m;f++){ 
         for(c=0;c<=n;c++){// como se agrego una columna 
           Mdiagonal[f][c]=0;
         }//fin del for anidado de columna
      }//fin del for filas

// C)   llenado de la matriz

 for(f=0;f<m;f++){
         for(c=0;c<n;c++){
             System.out.println("Escribe los datos ["+f+","+c+" ] :");
             Mdiagonal[f][c]=leer.nextInt();
         }//fin del for anidado de columna     
     }//fin del for filas


// D)solucion del problema
//int Asuma=0;
              for(f=0;f<=m;f++){
               //   Asuma=0;
                  for(c=0;c<=n;c++){
                  if(f==c){
                      Mdiagonal[m][n]=Mdiagonal[m][n]+Mdiagonal[f][c];
                 // Asuma=Asuma+Mdiagonal[f][c];}
                  }
                 } //
              }//for fianl
              
                      
                     




// E) salida de la matriz y resultado
  

            for(f=0;f<=m;f++){
             for(c=0;c<=n;c++){
             System.out.print(Mdiagonal[f][c]+" ");         
                }//fin del for anidado de columna    
             System.out.println(" ");
             
          }//fin del for filas









// TODO code application logic here
              }
           
    
}
