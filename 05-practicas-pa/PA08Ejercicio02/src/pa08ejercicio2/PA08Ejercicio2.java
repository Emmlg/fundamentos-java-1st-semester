/*
Escribe un programa que lea 15 números por teclado y que los almacene en un arreglo. Rota los
elementos de ese arreglo, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la
1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0.
Finalmente, mostrar el arreglo original y el arreglo rotado.
 */
package pa08ejercicio2;

import java.util.Scanner;// Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**@author Emmanuel de jesus Lopez Gomez
 *no.control:21700198
 * ing.en sistemas computacionales 1ro A
 */
public class PA08Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);//se crea una variable para poder leer desde el teclado
        
        int lin=0,nu=0;//son las ariables que se usara en el programa de tipo entero
       // A) declaracion del vector 
        int va[];//creacion de un vector
        va= new int[15];//creacion de un vector
        
        // B) inicializar el vector
       for(lin=0;lin<15;lin++){// ciclo for para que inicie con numeros neutros nuestro vector
       va[lin]=0;//valor neutro de todo los indices
       
       } 
        
// C)   llenado del vector        
  for(lin=0;lin<15;lin++){
      System.out.print("escribe los numeros para el vecotor ["+lin+"]:");//pedimos al usuarionumeros
       va[lin]=leer.nextInt();//los datos pedidos se almacenan en un vector
       
       }      
        
  nu=va[14];//guardamos el valor de la posicion del ultimo numero
 // D)solucion del problema
 
         for(lin=0;lin<15;lin++){//este for sirve para mostrar  los numeros que se pidieron
          System.out.println( va[lin]);
       
       } 
 
        System.out.println("  -------------");  //genera un espacio para diferenciar 
  // E) salida del vector y resultado      
        System.out.println(nu);//imprimrme el ultimo numero
      for(lin=0;lin<14;lin++){//for para imprimir los numeros
          
          System.out.println( va[lin]);//imprime los numeros guardados
       
       }  
  
  
  
  
        // TODO code application logic here
    }
    
}
