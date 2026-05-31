/**
 * EJERCICIO: Verificador de Números Primos (Modular)
 * ---------------------------------------------------------------
 * Concepto: Modularidad (métodos con retorno) y ciclo do-while.
 * 
 * DESCRIPCIÓN: 
 * Determina si un número entero positivo es primo utilizando un 
 * método que retorna la cantidad de divisores. Incluye un ciclo 
 * que permite al usuario verificar múltiples números.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 12 de Mayo 2021
 */
package practicas;

import java.util.Scanner;

public class PA09CalculadoraAreas03 {
    public static Scanner leer = new Scanner(System.in);

    /**
     * Cuenta los divisores de un número.
     */
    public static int contarDivisores(int num) {
        int contador = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) contador++;
        }
        return contador;
    }
    
    public static void main(String[] args) {
        int num, divisores, sino;
        
        do {
            System.out.print("Escribe un número entero positivo: ");
            num = leer.nextInt();
            divisores = contarDivisores(num);
            
            if(divisores == 2) System.out.println("El número es PRIMO");
            else System.out.println("El número NO es primo");
            
            System.out.print("¿Quieres ingresar otro número? (1-Si, 2-No): ");
            sino = leer.nextInt();
        } while(sino == 1);
    }
}
