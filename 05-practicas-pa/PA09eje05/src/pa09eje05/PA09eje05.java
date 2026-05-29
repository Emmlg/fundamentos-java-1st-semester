/*
Escriba una función y su respectiva llamada que devuelva el valor de un número elevado a la n
potencia.
 */
package pa09eje05;

import java.util.Scanner;

/**@author Emmanuel de jesus  lopez gomez 12/05/2021
 *no. control 21700198
 *  Primer semestre grupo A

 */
public class PA09eje05 {
    public static Scanner leer=new Scanner(System.in);//se crea una variable para poder leer nuestro codigo
    
    public static int potencia(int potencia){//inicio del modulo con retorno de valor tipo entero
        int numb,nump;//inicio de variables que se usan dentro de este modulo
    
        System.out.print("escribe el numero base :");//muestra una etiqueta de salida
        numb=leer.nextInt();//recibe el dato ingresado
        System.out.print("escribe el numero a la potencia que necesitas: ");//muestra una etiqueta de salida
        nump=leer.nextInt();//recibe el dato ingresado
        potencia=1;//inicio de un valor entero con vlor 1
        for(int i=0; i<nump; i++){//incio de ciclo for  para multiplicar
        potencia=potencia*numb;//operacion matematica para calcular el factorial
        
        }
        System.out.println("El resultado es:"+potencia);//etiqueta de salida
        return potencia;//retorno del valor del modulo
    }
    
    

    public static void main(String[] args) {
        int potencia = 0,sino;//inicio de variables para el programa
       do{ //inicio del do while
           potencia(potencia);//se llama al modulo
           System.out.print("desea continuar\n 1.-Si 2.- No   : ");//texto de salida
           sino=leer.nextInt();//se gurda el dato entero
       }while(sino==1);//condicion para segiur el ciclo do while
        
        // TODO code application logic here
    }
    
}
