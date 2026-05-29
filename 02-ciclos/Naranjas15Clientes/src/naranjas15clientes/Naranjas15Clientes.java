/*
Al cerrar un expedio de naranjas ,15 clients que aun no han
pagado rcibiran un 15% de dscuento si compra masw de 10kg.
Determinar cuanto pagara cada cliente y caunto percibira la tienda por cada compra
 */
package naranjas15clientes;

import java.util.Scanner;

/**@author Emmanuel de jesus lopez
 *No. de control: 21700198    21/10/2021
 */
public class Naranjas15Clientes {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int personas,kilos;
        float precio,total,descuento,pago,pagofinal;
                
           pagofinal=0;     
        for(personas=1;personas<=15;personas++){
        
        System.out.println("Cliente numero: "+personas+" ¿cuántos kilos compro?");
        kilos=leer.nextInt();
            System.out.println("digita el precio por kilo: ");
            precio=leer.nextFloat(); 
            total=precio*kilos;
        if(kilos>10){
            descuento=total*15/100;}
            else 
            descuento=0;
        
           pago=total-descuento;
            System.out.println("El precio a pagar es: "+pago);
        
            pagofinal=pagofinal+pago;
        }
        System.out.println("La ganancia del dia de hoy es: "+pagofinal);
        
        
        
        
        //
    }
    
}
