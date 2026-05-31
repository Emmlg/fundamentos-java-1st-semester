/**
 * EJERCICIO: Validador de Números Pares e Impares
 * ---------------------------------------------------------------
 * Concepto: Operador residuo (%), lógica booleana y operadores relacionales.
 * 
 * DESCRIPCIÓN: 
 * Leer un número desde el teclado. Si el número es par y mayor que 10,
 * o si es impar y menor que 5, mostrar "CORRECTO". 
 * En cualquier otro caso, mostrar "INCORRECTO".
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Octubre 2021
 */
package condicionales;

import java.util.Scanner;

public class ValidadorParImpar {
  
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int numeros;
        System.out.println("ingresa un numero:");
        numeros=leer.nextInt();
        
        if(numeros%2==0&& numeros>10 || numeros%2==1&&numeros<5)
            System.out.println("el numero es CORRECTO");
        else
            System.out.println("El numero es INCORRECTO");
        
    }
    
}
