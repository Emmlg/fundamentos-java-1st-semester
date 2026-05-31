/**
 * EJERCICIO: Demostración de Loops (Asteriscos)
 * ---------------------------------------------------------------
 * Concepto: Ciclos for anidados y representación visual básica.
 * 
 * DESCRIPCIÓN: 
 * Programa que solicita un número N e imprime una estructura de 
 * asteriscos en forma de triángulo rectángulo incrementando una 
 * unidad por cada línea.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package ciclos;

import java.util.Scanner;

public class DemoLoops {
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int i,j,n;
        
        System.out.println("ingresa la cantidad de asterisco que desee:");
        n=leer.nextInt();
        
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }    
}
