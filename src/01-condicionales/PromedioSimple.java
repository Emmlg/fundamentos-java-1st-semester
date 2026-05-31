/**
 * EJERCICIO: Promedio Simple y Ponderado
 * ---------------------------------------------------------------
 * Concepto: Cálculos aritméticos ponderados y manejo de variables tipo float.
 * 
 * DESCRIPCIÓN: 
 * Calcula la calificación final de un alumno basada en:
 * - 55% del promedio de tres parciales.
 * - 30% del examen final.
 * - 15% del trabajo final.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package condicionales;

import java.util.Scanner;

public class PromedioSimple {

    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        float p1,p2,p3,ex,tfinal, parcial,pa,tfinal0,exam,trabajo,calificacion;
        System.out.println("ingresa la calificacion del parcial uno?");
        p1=leer.nextFloat();
        System.out.println("ingresa la calificacion del parcial dos?");
        p2=leer.nextFloat();
        System.out.println("ingresa la calificacion del parcial tres?");
        p3=leer.nextFloat();     
        System.out.println("ingresa la calificacion de tu examen?");
        ex=leer.nextFloat();        
        System.out.println("ingresa la calificacion de tu trabajo final?");
        tfinal=leer.nextFloat();
        
        parcial=(float) ((p1+p2+p3)/3);
        pa=(float) (parcial*0.55);
        exam=(float) (ex*.30);
        tfinal0=(float) (tfinal*0.15);
        
        calificacion= pa+exam+tfinal0;
        System.out.println("la calificacion del alumno es : "+calificacion);
        
    }
    
}
