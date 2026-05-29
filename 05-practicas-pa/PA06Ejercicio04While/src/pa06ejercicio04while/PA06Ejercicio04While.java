/* 1.
El Departamento de Viabilidad desea saber,
de los n autos que entran a la ciudad,
cuantos entran con calcomanía de cada color.
Conociendo el último dígito de la placa de cada automóvil
se puede determinar el color de la calcomanía
utilizando la siguiente relación:
        Dígito     Color
        1 o 2     Amarillo
        3 o 4     Rosa
        5 o 6     Rojo
        7 u 8     Verde
        9 o 0     Azul
 */
package pa06ejercicio04while;

import java.util.Scanner; //Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**@author Emmanuel de Jesus López Gómez   15/oct/2021
 * no.control:21700198
 * primer Semestre Grupo"A"
 */
public class PA06Ejercicio04While {

    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);//se crea una variable para poder leer desde el teclado
      int nP,cC=1,nA=0,cA=0,cR=0,cRO=0,cV=0,cAZ=0;//son las variables que usaremos en el programa tipo Entero
      
        System.out.println("cuantos carros son:");//se muestra una etiqueta en la pantalla para recopilar informacion
        nA=leer.nextInt();//es la variable que guarda informacion para la solucion del problema
       while(cC<=nA){//inicio del ciclo while
           System.out.println("carro numero: "+cC+" ingrsa el ultimo numero de la placa:");//se muestra una etiqueta en la pantalla para recopilar informacion
           nP=leer.nextInt();//es la variable que guarda informacion para la solucion del problema
           if(nP==1||nP==2)//inicio de la condicion para aber el conteo de los autos
           cA=cA+1;//es el acumulador de la etiqueta amarilla
             else 
             if(nP==3||nP==4)//es la condicion anidada que nos ayuda a sumar el totl de las etiquetas rosados
               cR=cR+1; //es el acumulador de la etiqueta rosa
                else
                if(nP==5||nP==6)//la condicion que nos ayuda a sumar la cantidad de los carros rojo
                cRO=cRO+1;//es el acumulador de la etiqueta roja
                  else
                    if(nP==7||nP==8)//condicion que nos ayuda a sumar etiquetas Azules
                    cAZ=cAZ+1;//es el acumulador de la etiqueta azules
            else
               System.out.println("solo numeros del 1-8\n");  //se muestra una etiqueta en la pantalla mostrar un error
           cC++;// es el acumulador que nos permite avanzar en el ciclo while
       }//while
        System.out.println("-----------------------------------------------------");//se muestra una etiqueta en la pantalla para mostrar el total de los resultados
        System.out.println("El total de carros con calcomania Amarillo son:"+cA);//se muestra una etiqueta en la pantalla para mostrar el total de los resultados
        System.out.println("El total de carros con calcomania Rosa son:"+cR);//se muestra una etiqueta en la pantalla para mostrar el total de los resultados
        System.out.println("El total de carros con calcomania Rojo son:"+cRO);//se muestra una etiqueta en la pantalla para mostrar el total de los resultados
        System.out.println("El total de carros con calcomania Azul son:"+cAZ);//se muestra una etiqueta en la pantalla para mostrar el total de los resultados
        
     //
    }
    
}
