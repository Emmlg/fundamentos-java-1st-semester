/**
 * EJERCICIO: Censo Poblacional (Promedio de Pesos)
 * ---------------------------------------------------------------
 * Concepto: Ciclos for, condicionales múltiples y promedios por categoría.
 * 
 * DESCRIPCIÓN: 
 * Realiza un censo de personas clasificándolas por edad en cuatro categorías:
 * Niños (0-12), Jóvenes (13-29), Adultos (30-59) y Viejos (60+).
 * Calcula y muestra el promedio de peso para cada categoría.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package practicas;

import java.util.Scanner;

public class CensoCincuentaPersonas {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int persona, edad;
        float peso=0, ApesoJ=0, J=0, ApesoA=0, A=0, ApesoV=0, V=0, Apeso=0, n=0;
        float promedioJ, promedioA, promedioV, promedio;
        
        for(persona=1; persona<=50; persona++){
            System.out.println("persona "+persona+" ¿cuál es tu edad?");
            edad=leer.nextInt();
            System.out.println("¿cuál es tu peso?");
            peso=leer.nextFloat();
            
            if(edad <= 12){
                Apeso += peso; n++;
            } else if(edad <= 29){
                ApesoJ += peso; J++;
            } else if(edad <= 59){
                ApesoA += peso; A++;
            } else {
                ApesoV += peso; V++;
            }
        }
        
        promedio = (n>0) ? Apeso/n : 0;
        promedioJ = (J>0) ? ApesoJ/J : 0;
        promedioA = (A>0) ? ApesoA/A : 0;
        promedioV = (V>0) ? ApesoV/V : 0;
        
        System.out.println("Promedio pesos Niños: "+promedio);
        System.out.println("Promedio pesos Jóvenes: "+promedioJ);
        System.out.println("Promedio pesos Adultos: "+promedioA);
        System.out.println("Promedio pesos Viejos: "+promedioV);
    }
}
