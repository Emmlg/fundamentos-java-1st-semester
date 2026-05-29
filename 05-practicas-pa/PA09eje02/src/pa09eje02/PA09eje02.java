/*
En una escuela la colegiatura de los alumnos se determina según el número de materias que
cursan. El costo de todas las materias es el mismo. Se ha establecido un programa para estimular
a los alumnos, el cual consiste en lo siguiente: si el promedio obtenido por un alumno en el último
periodo es mayor o igual que 9, se le hará un descuento del 30% sobre la colegiatura y no se le
cobrara IVA; si el promedio obtenido es menor que 9 deberá pagar la colegiatura completa, la cual
incluye el 10% de IVA. Obtener cuanto debe pagar un alumno.

 */
package pa09eje02;

import java.util.Scanner;

/**@author Emmanuel de jesus  lopez gomez 12/05/2021
 *no. control 21700198
 *  Primer semestre grupo A
 */
public class PA09eje02 {
public static Scanner leer=new Scanner(System.in);//esta es la libreria que nos permite hacer entrada y salida de nuestro codigo


public static float materias(float colegiatura){//inicio de la funcion de materias
   int totamaterias;//creacion de variable tipo entero que sirve dentro del modulo
   float pagomateria;//creacion de variable tipo flotante que sirve dentro del modulo
  System.out.println("cuantas materias tienes?");//muestra un texto al usuario
  totamaterias=leer.nextInt();//recibe el dato del usuario que ingreso
  
  System.out.println("cuanto pagas por materia?");//muestra un texto al usuario
  pagomateria=leer.nextFloat();//recibe el dato del usuario que ingreso
  
  colegiatura=totamaterias*pagomateria;//hace una operacion que nos ayuda a calcular la colegiatura
   return colegiatura;//retorna un valor flotante llamado colegiatura

}
 public static float proColegiatura(float pago){
 
 float prom;//creacion de variable tipo flotante que sirve dentro del modulo
 float tocolegiatura,colegiatura = 0,pago0;//creacion de variable tipo flotante que sirve dentro del modulo
 tocolegiatura= materias(colegiatura);//sirve para iniciar el modulo
     System.out.println("cual es tu promedio?");//muestra un texto al usuario
     prom=leer.nextFloat();//recoge el dato del usuario
    if(prom>=9){//cracion de una condicion
      pago0=(float) (tocolegiatura*0.30);//parte verdadera de la condicion
       pago=tocolegiatura-pago0;//operacion que nos ayuda a saber cuanto debe de pagar
    }else{//parte falsa de la condicion
    pago0=(float) (tocolegiatura*.010);//nos ayuda a calcular el impuesto 
    pago=tocolegiatura+pago0;//nos da la cantidad de pago total
    }
 
    return pago;//retorna la variable flotante llamada pago
 }    
       
    
    public static void main(String[] args) {
    
      float pago = 0;//creacion de variable tipo flotante que sirve dentro del programa
    
     float pagoo = proColegiatura( pago);//nos ayuda a llamar a el modulo
        System.out.println("el pago de colegiatura es:"+pagoo);//nos da la salida de untexto con un valor operado
       
          
        // TODO code application logic here
    }
    
}
