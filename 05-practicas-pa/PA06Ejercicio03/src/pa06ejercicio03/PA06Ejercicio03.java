/*3. Una frutería ofrece las manzanas con descuento según la siguiente tabla:

No. de Kilos Comprados % de Descuento
    0 – 2                  | 0%
    2.01 – 5               | 10%
    5.01 – 10              | 15%
    10.01 en adelante      | 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.
 */
package pa06ejercicio03;

import java.util.Scanner;  //Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

/**@author Emmanuel de Jesus López Gómez   15/oct/2021
 * no.control:21700198
 * primer Semestre Grupo"A"

 */
public class PA06Ejercicio03 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);//se crea una variable para poder leer desde el teclado
        
        int Nk,opcion;//son las variables que usaremos en el programa tipo Entero
        float des = 0,pago=0,pK,to = 0;//son las variables que usaremos en el programa tipo flotante
        System.out.println("Digite el precio por kilo :");//se muestra una etiqueta en la pantalla para recolectar informacion
        pK=leer.nextInt();//es la variable que guarda informacion para la solucion del problema
        System.out.println("¿cuántos kilos compro?");//se muestra una etiqueta en la pantalla para recolectar informacion
        Nk=leer.nextInt();//es la variable que guarda informacion para ver cuanto de descuento se aplicara
        System.out.println("para aplicar le un descuento dependiendo la cantidad de kilogramos comprados");//se muestra una etiqueta en la pantalla 
        System.out.println(" Digite "+"\n"+"1.- 0-2kg \n2.- 2.1–5Kg\n3.- 5.01–10kg\n4.- 10.01Kg en adelante");//se muestra una etiqueta en la pantalla para recolectar informacion
        System.out.print("REspuesta:");//se muestra una etiqueta en la pantalla 
        opcion=leer.nextInt();//es la variable que guarda informacion para ver que descuento debe aplicar
        switch(opcion){//inicio de una condicion para ver que descuento se debe de aplicar
            case 1: to=pK*Nk; //Es una ecucion que nos ayuda aplicar cuanto se debe pagar sin descuento
                    pago=to;break;//Es una ecucion que nos ayuda aplicar cuanto se debe pagar con descuento
            case 2: to=pK*Nk;//Es una ecucion que nos ayuda aplicar cuanto se debe pagar sin descuento
                    des=to*10/100; break;//Es una ecucion que nos ayuda aplicar cuanto se debe pagar con descuento
            case 3: to=pK*Nk;//Es una ecucion que nos ayuda aplicar cuanto se debe pagar sin descuento
                    des=to*15/100;break;//Es una ecucion que nos ayuda aplicar cuanto se debe pagar con descuento
            case 4: to=pK*Nk;//Es una ecucion que nos ayuda aplicar cuanto se debe pagar sin descuento
                    des=to*20/100;break;//Es una ecucion que nos ayuda aplicar cuanto se debe pagar con descuento
            default: System.out.println("solo los numeros del 1-5!!!");//se muestra una etiqueta en la pantalla para mostrar el error
        }
        pago=to-des;//Es una ecucion que nos ayuda aplicar cuanto se debe pagar con descuento
        System.out.println("El total a pagar es: "+pago);//se muestra una etiqueta en la pantalla para mostrar el resultado
        
      //  
    }
    
}
