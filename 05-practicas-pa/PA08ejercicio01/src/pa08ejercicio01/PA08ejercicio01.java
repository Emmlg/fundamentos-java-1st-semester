/*
Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene
en un arreglo. El programa debe ser capaz de pasar todos los números pares a las primeras
posiciones del arreglo (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza
arreglos auxiliares si es necesario.
 */
package pa08ejercicio01;

import java.util.ArrayList;// ayuda para crear un vector en lista para los numeros aleatorios
import java.util.Scanner;// Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**@author Emmanuel de jesus lopez Gomez   13/nov/2021
 *no.control:21700198
 * ing.en sistemas computacionales 1ro A
 */
public class PA08ejercicio01 {

    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);//se crea una variable para poder leer desde el teclado
      
// A) declaracion del vector
 int fil = 0;  //son las ariables que se usara en el programa de tipo entero
      
int Naleatorio [];//creacion de un vector
Naleatorio= new int[20];//creacion de un vector
int par [];//creacion de un vector
par= new int[20];//creacion de un vector


// B) inicializar el vector
for(fil=0;fil<10;fil++){// ciclo for para que inicie con numeros neutros vector
Naleatorio[fil]=0;
par[fil]=0;

}

// C)   llenado del vector

for(fil=0;fil<10;fil++){//for que nos servira para almacenar los numeros
    
//numero aleatorio 
     int numero = 0;//creacion de variable tipo entero para  los numeros aleatorio
ArrayList numeros = new ArrayList();//esto nos servira para poder generar los numeros aleatorio

for (int i = 1; i <=10; i++) {//for que nos genera 10 numeros aleatorio
numero = (int) (Math.random() * 100 + 1);//creacion del numero aleatorio tipo entero entre el 1 y el 100
if (numeros.contains(numero)) {//condicional para que no se repita el numero
i--;
} else {
numeros.add(numero);//conddicional para que  no se repita el numero

}
// D)solucion del problema
if(numero%2==0){// evalua si el numero es par
   par[fil]=numero;//guarda el numero par generado

}
else{  //parte conrtraria por si el numero es impar   
Naleatorio[fil]=numero;     }//guarda los numeros impares

}//
}//fin del for 

// E) salida del vector y resultado

for(fil=0;fil<10;fil++){//muestra los numeros pares
    System.out.println(par[fil]); //muestra numeros pares   
  System.out.println(Naleatorio[fil]);//muestra numeros impares
}




// TODO code application logic here
    }
    
}
