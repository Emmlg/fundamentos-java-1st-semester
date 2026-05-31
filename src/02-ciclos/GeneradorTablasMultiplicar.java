/**
 * EJERCICIO: Generador de Tablas de Multiplicar
 * ---------------------------------------------------------------
 * Concepto: Ciclos while anidados y operadores aritméticos.
 * 
 * DESCRIPCIÓN: 
 * Muestra en pantalla cualquier tabla de multiplicar en sus 10 
 * primeros términos. El número de la tabla es introducido por 
 * teclado y permite repetir el proceso para múltiples números.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Octubre 2021
 */
package ciclos;

import java.util.Scanner;

public class GeneradorTablasMultiplicar {

    public static void main(String[] args) {
        Scanner tabla=new Scanner(System.in);
        
        int n=0,b=1;
        while(b==1){
            System.out.println("ingrsa el numero de la tabla que necesites: ");
            n=tabla.nextInt();
            int subContador = 1;
            while(subContador<=10){
                System.out.println(n+"x"+subContador+"="+(subContador*n));
                subContador++;
            }
             
            System.out.println("quieres continuar (1.-si 2.- no) :");
            b=tabla.nextInt();
            System.out.println(" ");
        }
    }
}
