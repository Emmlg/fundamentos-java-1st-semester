// demostracion del paquete matriz
//1)encontrrar el valor mas alto almacenado
//2) mostrar en que reglon y en que columna se encuentra
//3)encontrrar el valor minimo almacenado
package demo_matriz0;

import java.util.Scanner;

/* @author Emmanuel de jesus Lopez Gomez  11/3/2021
 * no.de control: 21700198
 */
public class Demo_Matriz0 {


    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        
     // A) declaracion de la matriz
     final int tf=3;
     final int tc=3;
     int f=0,c=0;
     
     int matriz [][];  
     matriz = new int [tf][tc];
     
     
  // B) inicializar la matriz
      for(f=0;f<tf;f++){ 
         for(c=0;c<tc;c++){
           matriz [f][c]=0;
         }//fin del for anidado de columna
      }//fin del for filas
     
 // C)   llenado de la matriz    
     for(f=0;f<tf;f++){
         for(c=0;c<tc;c++){
             System.out.print("escribe los datos ["+f+","+c+"] :");
             matriz[f][c]=leer.nextInt();
         }//fin del for anidado de columna     
     }//fin del for filas
                     
        
     

   
   
   // D) solucion del problema
   
   int max= -32767; int posf=0; int posC=0;int nV=0;
  
   for(f=0;f<tf;f++){
       for(c=0;c<tc;c++){
       if(max<matriz[f][c]){
           max=matriz[f][c];
         //  nV=matriz [f][c];
           posf=f;
           posC=c; }// fin del if
       }
    }
int min=32767; int poxf=0; int poxc=0;
for(f=0;f<tf;f++){
       for(c=0;c<tc;c++){
       if(min>matriz[f][c]){
           min=matriz[f][c];
         //  nV=matriz [f][c];
           poxf=f;
           poxc=c; }// fin del if
       }
    }
   
   
  // E) salida de la matriz y resultado
        
         for(f=0;f<tf;f++){
             for(c=0;c<tc;c++){
             System.out.print(matriz[f][c]+"  ");         
                }//fin del for anidado de columna    
             System.out.println(" ");
          }//fin del for filas
        
        System.out.println("el valor mas alto es: "+max);
        System.out.println("el valor minimo es: "+min);
        System.out.println("la posicion de la matriz es :"+posf+posC);
        System.out.println("la posicion de la matriz es :"+poxf+poxc);
       // System.out.println("el valor es "+nV);
       
       
       
       
    //   
    }
    
}
