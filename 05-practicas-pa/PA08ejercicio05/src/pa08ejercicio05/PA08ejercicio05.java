/*
 Hacer un programa con matriz que resuelva el siguiente planteamiento. El departamento de policía
de la ciudad de ha acumulado información referente a las infracciones de los límites de velocidad
durante un determinado periodo de tiempo. El departamento ha dividido la ciudad en cuatro
cuadrantes y desea realizar una estadística de las infracciones a los límites de velocidad en cada
uno de ellos. Para cada infracción se ha preparado una tarjeta que contiene la siguiente información:
a) número de registro del vehículo;
b) cuadrante en el que se produjo la infracción
c) límite de velocidad en kilómetros por hora (kph)
Diseñe un programa para producir el siguiente informe:
Una lista de la multa de velocidad recolectadas, donde la multa se calcula como la suma del costo:
$1,000.00, más $ 250.00 por cada kph que exceda la velocidad limite. Prepare una tabla con los
siguientes resultados:

INFRACCIONES A LOS LÍMITES DE VELOCIDAD
Registro 	Velocidad	Velocidad	Multa
del vehículo  registrada (kph)  límite          Arreglo

 */
package pa08ejercicio05;

import java.util.Scanner;// Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**@author Emmanuel de jesus lopez Gomez   13/nov/2021
 *no.control:21700198
 * ing.en sistemas computacionales 1ro A
 */
public class PA08ejercicio05 {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in); //se crea una variable para poder leer desde el teclado
        
        int fil,col,car,curante,lim = 0,mul,reco;//son las ariables que se usara en el programa de tipo entero
        
        System.out.println("cuantos carros son?");
        car=leer.nextInt();
        // A) declaracion de una matriz
        int poli[][];//creacion de una matriz
        poli=new int[car][5];//creacion de una matriz
 // B) inicializar la matriz
     for(fil=0;fil<car;fil++){ // ciclo for para que inicie con numeros neutros nuestra matriz
         for(col=0;col<=4;col++){
          poli[fil][col]=0;//declarar neutro el valor de cada matriz
         
         }
      }    
       
 // C)   llenado de la matriz      
       
     for(fil=0;fil<car;fil++){//nos ayudara  a pedir los datos de los vehiculos 
         System.out.print("#registro:");  //etiqueta que pide dato   
        poli[fil][0]=leer.nextInt();//ayuda almacenar los datos pedido
        do{//inicio del cilo para regular los datos del usuario
          System.out.print("#cuadrante:");     //etiqueta que pide dato   
        poli[fil][1]=leer.nextInt();//ayuda almacenar los datos pedido
        }while(poli[fil][1]<=0 || poli[fil][1]>4);//fin del cilo para regular los datos del usuario
      
        System.out.print("velocidad registrada(kph)  :");    //etiqueta que pide dato    
        poli[fil][2]=leer.nextInt();//ayuda almacenar los datos pedido
         System.out.println("velocidad limite?"); //etiqueta que pide dato  
        poli[fil][3] =leer.nextInt();//ayuda almacenar los datos pedido
         // D)solucion del problema
        reco=poli[fil][2]-poli[fil][3];//operacion para crear la multa
          mul=1000+(250)*(reco);//operacion para crear la multa
        poli[fil][4]=mul;//almacena el valor de la multa
         System.out.println("   ");//imprime un espacio
      }   
       
      
    
   // E) salida de la matriz y resultado     
     
     System.out.println("#registro  #cuadrante    velocidad registrada     limite          multa  "); //muestra una etiqueta de salida que nos ayuda a visualizar los resultados
      for(fil=0;fil<car;fil++){//inicio del for para mostrar resultadoss
        for(col=0;col<=4;col++){//inicio del for de columnas para saber resultados
           System.out.print(poli[fil][col]+"               ");//imprime espacio en columnas
        } //
        System.out.println(" ");
    }//for fianl  
     
     
     
        // TODO code application logic here
    }
    
}
