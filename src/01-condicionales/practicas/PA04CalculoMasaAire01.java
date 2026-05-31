/**
 * EJERCICIO: Cálculo de Masa de Aire
 * ---------------------------------------------------------------
 * Concepto: Sequential Logic / Formulas
 * 
 * DESCRIPCIÓN: 
 * Calcule la masa de aire si esta se calcula por la presión, el 
 * volumen y la temperatura de acuerdo a la fórmula: 
 * masa = (presión * volumen) / (0.37 * (temperatura + 460))
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: October 2021
 */
package practicas;
import java.util.Scanner;

public class PA04CalculoMasaAire01 {
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);    // se crea una variable para poder leer dsde el teclado
        float masa,volumen,temperatura,presion; // son las variables que usaremos en el programa tipo flotante
        
        System.out.println("Para poder medir la masa del aire se recomienda lo siguiente");//se muestra una etiqueta en la pantalla
        System.out.println("¿cual es la presion del Aire? ");// semuestra una etiqueta en la pantalla que nos ayuda a recolectar datos
        presion= leer.nextFloat();//es una variable que guarda informacion para la solucion del problema
        System.out.println("¿cuál es el volumen?");// es una etiqueta que se muestra en la pantalla
        volumen= leer.nextFloat();//es la variable que guarda informacion para la solucion del problema
        System.out.println("¿cuál es el la temperatura");// es una etiqueta que se mustra en la pantalla
        temperatura= leer.nextFloat();//es la variable que guarda informacion para la solucion del problema
        masa = (float) ((presion * volumen) / (0.37 * (temperatura + 460)));// es la operacion que soluciona de manera logica el problema                          
        System.out.println("la masa del aire es:"+masa);// muestra una etiqueta en la pantalla y el dato de salida.
    }
    
}
