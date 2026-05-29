/* hacer un programa que lleve una matriz de m*n.
sumar las columnas e imprimir que columna tuvo la maxima suma 
y la suma de esa columna.
sumar los reglones e imprimir que renglon tuvo la maxima
suma y la sua de ese reglon.
 */
package sumacolyfil;

import java.util.Scanner;

/**@author Emmanuel 
 * no control: 21700198
 * Noviembre/12/2021
 * 
 */
public class SumaColyFil {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      
       // A) declaracion de la matriz
      int tamanio,f,c;
      
     do{ System.out.println("digite el tamanio de la matriz:");
       tamanio=leer.nextInt();
     }while(tamanio<3);
      int Mcolyfil [][];  
Mcolyfil = new int [tamanio+1][tamanio+1];
      


// B) inicializar la matriz

for(f=0;f<=tamanio;f++){ 
         for(c=0;c<=tamanio;c++){// como se agrego una columna 
           Mcolyfil[f][c]=0;
         }//fin del for anidado de columna
      }//fin del for filas

// C)   llenado de la matriz


 for(f=0;f<tamanio;f++){
         for(c=0;c<tamanio;c++){
             System.out.println("Escribe los datos ["+f+","+c+" ] :");
             Mcolyfil[f][c]=leer.nextInt();
         }//fin del for anidado de columna     
     }//fin del for filas

// D)solucion del problema


// numero maximo
 int max= -32767; int posf=0; int posC=0;int nV=0;
  
   for(f=0;f<=tamanio;f++){
       
       for(c=0;c<=tamanio;c++){
       if(max<Mcolyfil[f][c]){
           max=Mcolyfil[f][c];
           posf=f;
           posC=c; }// fin del if
       }
    }

 // diagonal
 for(f=0;f<=tamanio;f++){
              
   for(c=0;c<=tamanio;c++){
        if(f==c){
         Mcolyfil[tamanio][tamanio]=Mcolyfil[tamanio][tamanio]+Mcolyfil[f][c];
                 
                  }//fin del if
                 } //
              }//for fianl
 
   
   // suma columna
/*
int Asuma;
Asuma=0;
for( f=0;f<tamanio;f++){
        for(c=0;c<tamanio;c++){   
           
         Asuma=Asuma+Mcolyfil[tamanio][tamanio];
         }
}
      

*/


// E) salida de la matriz y resultado


            for(f=0;f<=tamanio;f++){
             for(c=0;c<=tamanio;c++){
             System.out.print(Mcolyfil[f][c]+" ");         
                }//fin del for anidado de columna    
             System.out.println(" ");
             
          }//fin del for filas

System.out.println(" la posicion de la matriz es :"+posf+" y el valor mas alto  de la fila es: "+max);
System.out.println(" la posicion de la matriz es :"+posC+" y el valor mas alto  de la columna es es: "+max);



// TODO code application logic here
    }
    
}
