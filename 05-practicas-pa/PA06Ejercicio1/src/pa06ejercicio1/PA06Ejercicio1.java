/*
Determinar la cantidad de dinero que recibirá un trabajador
que trabaja por horas, sabiendo que cuando las horas de trabajo
exceden de 40, el resto se consideran horas extras y que estas 
se pagan al doble de una hora normal cuando no exceden de 8;
si las horas extras exceden de 8 se pagan las primeras 8
al doble de lo que se pagan las horas normales y el resto al triple.
 */
package pa06ejercicio1;

import java.util.Scanner;// Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**@author Emmanuel de Jesus López Gómez   14/oct/2021
 * no.control:21700198
 * primer Semestre Grupo"A"
 */
public class PA06Ejercicio1 {

    public static void main(String[] args) {
        
       Scanner leer= new Scanner(System.in);//se crea una variable para poder leer desde el teclado
       int h;//son las variables que usaremos en el programa tipo Entero
       float sh,salario=0;//son las variables que usaremos en el programa tipo flotante
        
        System.out.println("¿cuántas horas trabajo?");//se muestra una etiqueta en la pantalla  para reolectar datos
        h=leer.nextInt();//es la variable que guarda informacion para poder ejecutar el problema
        System.out.println("¿cuánto gana por hora?");//se muestra una etiqueta en la pantalla  para recolectar datos
        sh=leer.nextFloat();//es la variable que guarda informacion para la solucion del problema
        if(h>48){//inicio de la condicion
            salario=( (sh*40)+(sh*8*2) )+( (h-48)*(sh*3) );//es la operacion de la ecuacion para determinar
             }else if(h>40&&h<=48){// inicio de un if anidado
                     salario=(sh*40)+((h-40)*(sh*2));}// ecuacion donde nos ayuda a saber el salario de las personas si esta en el rango de 40 a 48
        else {
         salario=h*sh; }//es la ultima condicion que nos ayuda a evaluar la ultima condicion porque no fue cumplida las dos anteriore
            
            System.out.println("Su salario es de: "+salario);//se muestra una etiqueta en la pantalla  para mostrar resultados
            
         
        
        //
    }
    
}
