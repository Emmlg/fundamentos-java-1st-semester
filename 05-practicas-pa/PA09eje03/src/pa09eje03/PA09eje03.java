/*
Escribir un método y su respectiva llamada, que termine si argumento entero positivo se trata de un
numero primo o no
 */
package pa09eje03;

import java.util.Scanner;

/**@author Emmanuel de jesus  lopez gomez 12/05/2021
 *no. control 21700198
 *  Primer semestre grupo A
 */
public class PA09eje03 {
public static Scanner leer=new Scanner(System.in);//se crea una variable para poder leer nuestro codigo

public static int primo(int Ac){//creacion de un modulo con retorno de una variable tipo entera
    int num = 0;//creacion de la variable que ayuda a guardar un valor entero
    
      System.out.print("escribe un numero:");//texto que se muestr al uuario
      num=leer.nextInt();//se guarda el dato
     Ac=0;//inicializacion de la variable
     for(int i=1; i<=num;i++){//inicio del for
       if(num%i==0){//condicion para iniciar el acumulador
       Ac++;//acumulador
       }
     }   
   return Ac;
}
    
    
    
        
    
    
    
    public static void main(String[] args) {
        int num = 0,Ac = 0;//inicio de variables que nos ayudara en
    int sino = 0;
        
     do{//inicio del ciclo do while
                     num= primo(Ac);  //inicia el modulo
        if(num==2){//creacion de condicion para evaluar el valor del modulo
          System.out.println("el numero es PRIMO"); //como fue parte verdadera de la condicion mostramos un un texto al usuario
        }else{//parte falsa de la condicion
        System.out.println("el numero No es primo");//mostramos un texto al usuacio
         }
         System.out.print("quiere ingresar otro numero? \n 1.-si  2.-No   : ");//mostramos un texto al usuario
         sino=leer.nextInt();//variable que guarda el dato
     }while(sino==1);//fin del ciclo
        // TODO code application logic here
    }
    
}
