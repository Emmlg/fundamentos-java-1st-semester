/*2.
En un juego de preguntas a las que se responde
“Si” o “No” gana quien responda correctamente las tres
preguntas. Si se responde mal a cualquiera de ellas 
ya no se pregunta la siguiente y termina el juego.
Las preguntas son: 1. Colon descubrió América?
2. La independencia de México fue en el año 1810? 
3.The Doors fue un grupo de rock americano?
 */
package pa06ejericio02;

import java.util.Scanner; //Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**@author Emmanuel de Jesus López Gómez   15/oct/2021
 * no.control:21700198
 * primer Semestre Grupo"A"
 */
public class PA06Ejericio02 {


    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);//se crea una variable para poder leer desde el teclado
        
        int sino;//son las variables que usaremos en el programa tipo Entero
        
        System.out.println("     -------Bien venido!-----------");//se muestra una etiqueta en la pantalla 
        System.out.println(" preguntas a las que se responde\n" +"“Si” o “No” gana quien responda correctamente las tres preguntas.");//se muestra una etiqueta en la pantalla 
        System.out.println(" ");//se muestra una etiqueta en la pantalla para mostrar un espacio
        System.out.println("1. Colon descubrió América?"+"\n"+"1.- si 2.- no"+"\n");//se muestra una etiqueta en la pantalla para recolectar informacion
        System.out.print("Respuesta:");//se muestra una etiqueta en la pantalla para recolectar informacion
        sino=leer.nextInt();//es la variable que guarda informacion para la solucion del problema de las preguntas
        if(sino==1){//inicio de la condicion
            System.out.println("2. La independencia de México fue en el año 1810?"+"\n"+"1.- si 2.- no"+"\n");//se muestra una etiqueta en la pantalla para recolectar informacion y se hace una pregunta
            System.out.print("Respuesta:");//se muestra una etiqueta en la pantalla para recolectar informacion
            sino=leer.nextInt();//es la variable que guarda informacion para avanzar a otra pregunta
            if(sino==1){//inicio de una condicion anidada
                System.out.println("3.The Doors fue un grupo de rock americano?"+"\n"+"1.- si 2.- no"+"\n");//se muestra una etiqueta en la pantalla para recolectar informacion y hacer una pregunta
                System.out.print("Respuesta:");//se muestra una etiqueta en la pantalla para recolectar informacion
                sino=leer.nextInt();}////es la variable que guarda informacion para la solucion de la segunda pregunta
                else //la contraparte de un if anidado
                System.out.println(" has perdido!");//se muestra una etiqueta en la pantalla 
                if(sino==1){//inicio de un ultima condicion anidada
                    System.out.println("Felicidades!! has ganado!!"); }//se muestra una etiqueta en la pantalla
                else //la contraparte de un if anidado
            System.out.println(" has perdido!");//se muestra una etiqueta en la pantalla 
        }else //la contra parte del if original
           System.out.println(" has perdido!");//se muestra una etiqueta en la pantalla 
        
        
        
        
    //    
    }
    
}
