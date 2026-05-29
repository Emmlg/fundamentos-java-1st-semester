/*
Hacer un programa que gestione las calificaciones de los estudiantes de Secundaria en la materia
de Matemáticas. Almacenar en vectores el Número de lista, calificación de la unidad 1, calificación
de la unidad 2, calificación de la unidad 3, calificación de la unidad 4, calificación de la unidad 5, y
Promedio final (calculado). La calificación en cada unidad debe ser entre 0 y 10, (debemos controlar
que el usuario ingrese una calificación valida). Determinar:
a) Cuántos estudiantes Reprobaron (el promedio mínimo aprobatorio es 6).
b) Cuántos estudiantes Aprobaron (el promedio mínimo aprobatorio es 6).
c) El número de lista y promedio del estudiante que obtuvo el promedio más Bbajo
d) El número de lista y promedio del estudiante que obtuvo el promedio más Alto
 */
package pa08ejercicio03;

import java.util.Scanner;// Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**@author Emmanuel de jesus lopez Gomez
 *   no.control:21700198
 * ing.en sistemas computacionales 1ro A
 * 
 */
public class PA08Ejercicio03 {

    public static void main(String[] args) {
        
      Scanner leer=new Scanner(System.in);  //se crea una variable para poder leer desde el teclado
      
      
// A) declaracion del vector
      int col,pp,ap = 0,rp = 0,al,na;//son las ariables que se usara en el programa de tipo entero
      
       do{ //este ciclo nos ayuda a controlar los numeros que ingrsa el usuario
           System.out.print("cuantos alumnos son?");//pedimos al usuario datos
        na=leer.nextInt();//guarda los datos pedido 
       }while (na<1);//condicion del ciclo para que no escriba numeros negativos
        al=na+1;//nos serve para controlar el numero que ingreso el usuario
   int nl[],u1[],u2[],u3[],u4[],u5[],pro [];//creacion de los vectores
   nl=new int [al];//creacion de un vector
   u1=new int [al]; //creacion de un vector
   u2=new int [al];     //creacion de un vector     
   u3=new int [al];    //creacion de un vector
   u4=new int [al]; //creacion de un vector           
   u5=new int [al];//creacion de un vector
   pro=new int [al];   //creacion de un vector    
               
  // B) inicializar el vector          
 for(col=1;col<al;col++){// ciclo for para que inicie con numeros neutros nuestro vector
     nl[col]=0;//valores neutro del vector
     u1[col]=0;//valores neutro del vector
     u2[col]=0;//valores neutro del vector
     u3[col]=0;//valores neutro del vector
     u4[col]=0;//valores neutro del vector
     u5[col]=0;//valores neutro del vector
     pro[col]=0;   //valores neutro del vector
    }       
// C)   llenado del vector        
        for(col=1;col<al;col++){
         do{ //este ciclo nos ayuda a controlar los numeros que ingrsa el usuario 
        System.out.print("escribe tu numero de lista:");// nos ayuda arecolectar datos del usuario
        nl[col]=leer.nextInt();//nos ayuda almacenar el numero de lista
        
        }while(nl[col]<=0);//fin del ciclo que nos ayuda a controlar el usuario a traves de la condicion
         do{ //este ciclo nos ayuda a controlar los numeros que ingrsa el usuario 
          System.out.print("escribe tu calificacion de la u1:");// nos ayuda arecolectar datos del usuario
         u1[col]=leer.nextInt();//nos ayuda almacenar las calificaciones
        
        }while(u1[col]<0||u1[col]>10);//fin del ciclo que nos ayuda a controlar el usuario a traves de la condicion
      do{ //este ciclo nos ayuda a controlar los numeros que ingrsa el usuario 
           System.out.print("escribe tu calificacion de la u2:");// nos ayuda arecolectar datos del usuario
         u2[col]=leer.nextInt();//nos ayuda almacenar las calificaciones
        
        }while(u2[col]<0||u2[col]>10);//fin del ciclo que nos ayuda a controlar el usuario a traves de la condicion
       do{ //este ciclo nos ayuda a controlar los numeros que ingrsa el usuario 
          System.out.print("escribe tu calificacion de la u3:");// nos ayuda arecolectar datos del usuario
         u3[col]=leer.nextInt();//nos ayuda almacenar las calificaciones
        
        }while(u3[col]<0||u3[col]>10);//fin del ciclo que nos ayuda a controlar el usuario a traves de la condicion
       do{ //este ciclo nos ayuda a controlar los numeros que ingrsa el usuario 
           System.out.print("escribe tu calificacion de la u4:");// nos ayuda arecolectar datos del usuario
         u4[col]=leer.nextInt();//nos ayuda almacenar las calificaciones
        
        }while(u4[col]<0||u4[col]>10);//fin del ciclo que nos ayuda a controlar el usuario a traves de la condicion
        do{ //este ciclo nos ayuda a controlar los numeros que ingrsa el usuario 
        System.out.print("escribe tu calificacion de la u5:");// nos ayuda arecolectar datos del usuario
         u5[col]=leer.nextInt();//nos ayuda almacenar las calificaciones
            System.out.println("   ");
        
        }while(u5[col]<0||u5[col]>10);//fin del ciclo que nos ayuda a controlar el usuario a traves de la condicion
      
        
        }//fin del for
        
       
        
// D)solucion del problema 

ap=0;//inicializacion de la variable
 rp=0;//inicializacion de la variable
 for(col=1;col<al;col++){//for para sumar las columnas con las calificaciones
 pp=(u1[col]+u2[col]+ u3[col]+u4[col]+u5[col])/5;//suma y promedio de las columnas
 pro[col]=pp;//almacenamiento del valor de cada columna
 
 
 if(pro[col]>=6){//condicion para guardar el valor que acumula los aprobados
ap=ap+1;
}else{
 
rp=rp+1; //condicion para guardar el valor que acumula los reprobados
 }
 
 
 }       
    int max= -32767; int posc=0; //variables
  
   for(col=1;col<al;col++){//condicion que me ayuda a buscar el promedio mas alto
       
       if(max<pro[col]){//condicion para saber si es mayor el numero en ese vector
           max=pro[col];//identifica el numero mayor y lo guarda
         
           posc=col;//posicion de la calificacion
            }// fin del if
       }
    
int min=32767; int poxf=0; //variables 
for(col=1;col<al;col++){//for para recorrer los vectores del numero mayor
       
       if(min>pro[col]){//condicion que me ayuda a buscar el promedio mas bajo el numero en ese vector
           min=pro[col];//identifica el numero mayor y lo guarda
        
           poxf=col;
            }// fin del if
       }
   
 
 

 

// E) salida del vector y resultado

System.out.println("#lista   u1       u2    u3      u4     u5    promedio");//imprime una etiqueta de salida que nos ayuda a visualizar
 for(col=1;col<al;col++){//inicio de un for para imprimir los resultados
     
System.out.println( nl[col]+"        "+u1[col]+"        "+u2[col]+"     "+ u3[col]+"        "+u4[col]+"     "+u5[col]+"     "+pro[col]);
  } 
        System.out.println("  ");       
    
        System.out.println("cantidad de a probados: "+ap);//imprime aprobados
        System.out.println("cantidad de reprobados: "+rp);//muestra etiqueta de salida con resultados
        System.out.println("el promedio mas alto es: "+max+" , con numero de lista: "+posc);//muestra etiqueta de salida con resultados
        System.out.println("el promedio mas bajo es: "+min+", con numero de lista: "+poxf);//muestra etiqueta de salida con resultados
        
        // TODO code application logic here
    }
    
}
