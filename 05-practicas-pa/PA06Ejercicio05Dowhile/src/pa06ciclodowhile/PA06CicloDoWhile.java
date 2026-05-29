/* En un supermercado un cajero captura 
los precios de los artículos que los clientes
compran e indica a cada cliente cual es el monto 
de lo que deben pagar. Al final del día le indica a su supervisor
cuanto fue lo que cobro en total a todos los clientes que pasaron por su caja
 */
package pa06ciclodowhile;

import java.util.Scanner; //Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**
 *@author Emmanuel de Jesus López Gómez   14/oct/2021
 * no.control:21700198
 * primer Semestre Grupo"A"
 */
public class PA06CicloDoWhile {

    public static void main(String[] args) {
        Scanner le=new Scanner(System.in);//se crea una variable para poder leer desde el teclado
        
        int numeroA=0,contadorA =0,sino=1;//son las variables que usaremos en el programa tipo Entero
        float sumapersona=0,montoT=0,precioA = 0;//son las variables que usaremos en el programa tipo flotante
      
  do{  System.out.println(" Bien venido!"); //se muestra una etiqueta en la pantalla
       System.out.println("¿cuántos Articulos compro?");//se muestra una etiqueta en la pantalla para recopilar informacion
       numeroA=le.nextInt(); //es la variable que guarda informacion para la solucion del problema
            sumapersona=0;//es la variable que nos sirve para crear un contador
            contadorA=1;//es la variable que nos sirve para iniciar el cilo
            while(contadorA<=numeroA){//inicio del cilo while anidado
            System.out.println("El articulo "+contadorA+": ¿cuánto costo?");//se muestra una etiqueta en la pantalla para recopilar informacion
            precioA=le.nextFloat();//es la variable que guarda informacion para la solucion de la suma de articulos
            sumapersona=sumapersona+precioA; // es un acumulador de los articulos creados            
            contadorA++;} //fin while 01 anidado  
          
        System.out.println("El total de la compra fue: "+sumapersona);//se muestra una etiqueta en la pantalla para mostrar el resultado
        montoT=montoT+sumapersona; // operacion de cada comprador
        System.out.println(" --------------------------------------------");//se muestra una etiqueta en la pantalla
        System.out.print("  ¿qué opción necesitas?: \n 1.- Nuevo usuario \n 2.-Monto Total del Dia\ncoloca:");//se muestra una etiqueta en la pantalla para dar a conocer las siguientes opciones
        sino=le.nextInt(); //es la variable que nos ayuda a decidir si iniciamos una segunda o mas veces  
     }while(sino==1);//inicio del While  para repetir el ciclo
        System.out.println("El dia de hoy se cobro un total de: "+ montoT);//se muestra una etiqueta en la pantalla para mostrar el total del dia
        
    //    
    }
    
}
