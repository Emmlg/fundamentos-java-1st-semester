/*
 Escriba una función y su respectiva llamada que devuelva el factorial de un número.

 */
package pa09eje04;

import java.util.Scanner;

/**@author Emmanuel de jesus  lopez gomez 12/05/2021
 *no. control 21700198
 *  Primer semestre grupo A
 */
public class PA09eje04 {

public static Scanner leer=new Scanner(System.in);//se crea una variable para poder leer nuestro codigo de manera publica

public static int factorial(int factor){//inicio de modulo con retorno de dato tipo entero
int num,i;//inicio de variables para usarlo en este modulo
    System.out.print("Escribe el numero de factorial que necesite: ");//muestra una etiqueta de salida
    num=leer.nextInt();
    factor=1;
  for( i=1; i<=num; i++){//inicio del for
  factor=factor*i; //operacion parasacar la factorial
  }//fin del for
   System.out.println("El resultado es: "+factor);//muestra una etiqueta de salida con un resultado
    
    return factor;//retorno del valor del modulo tipo entero
}
    
    public static void main(String[] args) {
       int factor = 0;//creacion de variable tipo entero
       factorial( factor);//se llama al modulo
          // TODO code application logic here
    }
    
}
