/**
 * EJERCICIO: Generador de Pirámides
 * ---------------------------------------------------------------
 * Concepto: Lógica de ciclos for anidados y manejo de espacios/caracteres.
 * 
 * DESCRIPCIÓN: 
 * Programa versátil que puede generar diferentes tipos de pirámides 
 * con asteriscos (Normal, Inversa, con espacios). La versión activa 
 * genera una pirámide centrada con base proporcional al número de líneas.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package ciclos;

import java.util.Scanner;

public class GeneradorPiramide {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int n;
        
        System.out.print("ingrese las lineas de las piramides: ");
        n=leer.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=n;j>=i;j--)
                System.out.print(" ");
            for(int k=1;k<=i*2;k++)
                System.out.print("*");
            
            System.out.println();
        }
    }
}
