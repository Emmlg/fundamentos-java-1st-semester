/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolar;
import java.util.Scanner;
/**
  autor: Emmanuel de Jesús López Gómez
    matricula:21 700 198
    plantamiento del problema: Dada una cantidad en pesos,
    obtener la equivalencia en dólares, asumiendo que la unidad
    cambiaría (precio del dólar) es un dato desconocido.

 */
public class Dolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
