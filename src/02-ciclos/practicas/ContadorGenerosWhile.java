/**
 * EJERCICIO: Contador de Géneros (While + Switch)
 * ---------------------------------------------------------------
 * Concepto: Ciclo while, estructura switch-case y contadores.
 * 
 * DESCRIPCIÓN: 
 * Determina cuántos hombres y cuántas mujeres se encuentran en un 
 * grupo de N personas usando un menú interactivo y switch para la selección.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 13 de Octubre 2021
 */
package practicas;

import java.util.Scanner;

public class ContadorGenerosWhile {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int tp=0, H=0, M=0, a=1;
        
        while(a==1){
            System.out.println("cual es tu genero (1.-Hombre 2.- Mujer): ");
            tp=leer.nextInt();
            switch(tp){
                case 1: H++; break;
                case 2: M++; break;
                default: System.out.println("Opción inválida");
            }
            System.out.println("Total Hombres: "+H);
            System.out.println("Total Mujeres: "+M);
            System.out.print("¿Deseas continuar? (1.- si 2.- no): ");
            a=leer.nextInt();
        }
        System.out.println("Total de personas procesadas: "+(H+M));
    }
}
