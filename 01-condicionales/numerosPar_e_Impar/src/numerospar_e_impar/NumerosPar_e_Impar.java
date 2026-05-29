/*
 * Leer un numero desde el teclado, si el numero
  es par y mayor que 10 o impar y menor que 5
  escribir la palabra CORRECTO,
  en caso contrario scribir la palabra INCORRECTO
 */
package numerospar_e_impar;

import java.util.Scanner;

/** 12 de octubre 2021
 * @author Emmanuel
 * no-21700198
 * SALA 3
 */
public class NumerosPar_e_Impar {
  
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        int numeros;
        System.out.println("ingresa un numero:");
        numeros=leer.nextInt();
        
        if(numeros%2==0&& numeros>10 || numeros%2==1&&numeros<5)
            System.out.println("el numero es CORRECTO");
        else
            System.out.println("El numero es INCORRECTO");
        
        
        
        
        
        
        
        
     //   
    }
    
}
