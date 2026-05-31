/**
 * EJERCICIO: Promedio de Tiempos de Carrera
 * ---------------------------------------------------------------
 * Concepto: Sequential Logic / Averages
 * 
 * DESCRIPCIÓN: 
 * Todos los lunes, miércoles y viernes, una persona corre la 
 * misma ruta y cronometra los tiempos obtenidos. Determinar 
 * el tiempo promedio que la persona tarda en recorrer la ruta.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: October 2021
 */
package practicas;

import java.util.Scanner;

public class PA04PromedioTiemposCorrer04 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float t0,t1,t2,m;
        System.out.println("¿cuál fue el tiempo recorrido del día lunes?");
        t0=entrada.nextFloat();
        System.out.println("¿cuál fue el tiempo recorrido del día Miercoles?");
        t1=entrada.nextFloat();
        System.out.println("¿cuál fue el tiempo recorrido del día Viernes?");
        t2=entrada.nextFloat();
        m=(t0+t1+t2)/3;
        System.out.println("El tiempo promedio recorido de esta semana es: "+m);
    }
}
