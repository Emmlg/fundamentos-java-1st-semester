/*
Hacer un programa que almacene en una matriz M (30,7) la información sobre las calificaciones de
las 5 unidades de la materia de PROGRAMACIÓN. El programa debe imprimir:
a) Cantidad de alumnos que aprobaron la materia (70 es la calificación mínima aprobatoria).
b) Cantidad de alumnos que tienen derecho a segunda oportunidad (quien tenga 3 o más unidades
reprobadas NO tiene derecho a segunda oportunidad).
c) El número o números de lista de estudiante o estudiantes que hayan obtenido el máximo
promedio.
 */
package pa08ejercicio04;

import java.util.Scanner;// Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/** @author Emmanuelde jesus lopez Gomez
 *   no.control:21700198
 * ing.en sistemas computacionales 1ro A
 */
public class PA08ejercicio04 {


    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);//se crea una variable para poder leer desde el teclado
              
// A) declaracion de una matriz
      int col=0,fil=0,ap = 0,rp = 0,pro = 0,total=30;//son las ariables que se usara en el programa de tipo entero
   
   int fprog[][];//creacion de una matriz
   fprog=new int [30][7];//creacion de una matriz
   
 // B) inicializar la matriz
      for(fil=0;fil<30;fil++){ // ciclo for para que inicie con numeros neutros nuestra matriz
         for(col=0;col<=6;col++){
          fprog[fil][col]=0;// numero neutro 
         
         }
      }  
        
// C)   llenado de la matriz

    for(fil=0;fil<30;fil++){
          
        System.out.print("#numero de lista:");    //etiqueta de salida que nos ayua a pedir datos 
        fprog[fil][0]=leer.nextInt();//guarda los datos pedidos
        
        
         for(col=1;col<=5;col++){// como se agrego una columna 
             
         do{//ciclo que nos ayudara a controlar la inf del usuario
          System.out.print("escribe tu calificacion de la inidad["+(col)+"] : ");//etiqueta de salida que nos ayua a pedir datos 
         fprog[fil][col]=leer.nextInt();
        
        }while(fprog[fil][col]<0||fprog[fil][col]>10);//condicion que nos ayuda a controlar los datos del usuario
         
         
      
         }//fin del for anidado de columna
       
      }//fin del for filas       
        
        
 // D)solucion del problema  
 
 //cantidad de aprobados y reprobados y se guarda el promedio final
 int Asuma = 0;//inicio de variables
    for(fil=0;fil<30;fil++){//inicio del for
        Asuma=0;//acumulador 
        for(col=1;col<=5;col++){
            
            if(fprog[fil][col]>=7){//condicion para saber si aprobaron 
            
            Asuma=Asuma+fprog[fil][col];//acumula las calificaciones de las unidades
            pro=Asuma/5;//saca promedio
          
           fprog[fil][6]=pro;//guarda el valor del promedio
           
          if(fprog[fil][6]>=7){//condicion para saber si aprobaron
            ap=ap+1; //acumulador del los aprobados
          }
        } //
        }
    }//for fianl    
  //solucion de los alumnos con mayor promedio 
  
    int max= -32767; int posf=0; int posC=0;int nV=0;// variables que nos ayuda a saber los numeros grandes
  
   for(fil=0;fil<30;fil++){//inicio del for para recorrer las filas
       for(col=6;col<=6;col++){//inicio del for
       if(max<fprog[fil][col]){//condicion para saber que numero es mas grnade
           max=fprog[fil][col];//almacena el mavor mas grande
         //  nV=matriz [f][c];
           posf=fil;//muestra la posicion de del dato de la matriz
          // posC=col; 
       }// fin del if
       }
    }

      
  // E) salida de la matriz y resultado 
  int dos;//inicio de variable
  dos=total-ap;//nos ayuda a saber cuantos reprobaron
  
        System.out.println("#lista  u1      u2     u3      u4      u5     "); //etiqueta de salida que nos ayua a v,isualizar mejor las respuesta
      for(fil=0;fil<30;fil++){//inicio del for para imprimir datos
        for(col=0;col<6;col++){
           System.out.print(fprog[fil][col]+"       ");//imprime datos de columnas
        } //
        System.out.println(" ");
    }//for fianl      
      
      System.out.println("la cantidad de aprobados son: "+ap);//muestra etiqueta de salida con resultados
      System.out.println("la cantidad de Alumno que no tienen derecho a segunda oportunidad son: "+dos);//muestra etiqueta de salida con resultados
      System.out.println("el promedio mas alto es: "+max+"con numero de lista: "+(posf+1));//muestra etiqueta de salida con resultados
      
  
        // TODO code application logic here
    }
    
}
