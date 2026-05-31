/**
 * EJERCICIO: Conversor de Divisas
 * ---------------------------------------------------------------
 * Concepto: Operaciones aritméticas básicas y entrada de datos.
 * 
 * DESCRIPCIÓN: 
 * Dada una cantidad en pesos, obtener la equivalencia en dólares, 
 * asumiendo que la unidad cambiaria (precio del dólar) es un dato 
 * proporcionado por el usuario.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package condicionales;

import java.util.Scanner;

public class ConversorDivisas {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        float vda,cp,dolar;
        
        System.out.println("Este programa convierte la cantidad en pesos a dolar.");
	System.out.println("Antes de iniciar, ¿ cual es el precio del dolar actual ?"); 
	 vda= leer.nextFloat();
	System.out.println("¿cual es la cantidad en pesos que desea cambiar a dolares ?");
	 cp= leer.nextFloat();
	dolar=(cp/vda);
	System.out.println("la cantidad de peso a dolar es:"+dolar);	
        
    }
    
}
