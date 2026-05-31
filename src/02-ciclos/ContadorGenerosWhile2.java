/**
 * EJERCICIO: Contador de Géneros (While)
 * ---------------------------------------------------------------
 * Concepto: Ciclo while, condicionales anidados y acumuladores.
 * 
 * DESCRIPCIÓN: 
 * Determina cuántos hombres y cuántas mujeres se encuentran en un 
 * grupo de N personas, extrayendo los datos persona por persona.
 * Permite repetir el proceso mediante un menú de continuación.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 13 de Octubre 2021
 */
package ciclos;

import java.util.Scanner;

public class ContadorGenerosWhile2 {

    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        
        int contador=1,tp,H=0,M=0,g;
        int sino=1;
        while(sino==1){
            System.out.println("cuantas personas son: ");
            tp=leer.nextInt();        
            
            while(contador<=tp){
                System.out.println("persona "+contador+" ¿Que genero eres? (1.-Mujer 2.-Hombre) :");
                g=leer.nextInt();
                contador=contador+1;
                if(g==1){
                    M=M+1;             
                } else {
                    H=H+1;
                }
                System.out.println("El total de mujeres es: "+M);
                System.out.println("el total de Hombre es:"+H);
                System.out.println(" ");
            }
            
            tp=H+M;
            System.out.println("el total de personas son: "+tp);
            System.out.println(" ");
            System.out.println("deseas continuar:(1.-si 2.-no ):");
            sino=leer.nextInt();
        }
    }
}
