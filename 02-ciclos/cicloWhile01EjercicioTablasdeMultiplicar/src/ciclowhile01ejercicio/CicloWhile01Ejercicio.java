/* 
 * Mostraarme en pantalla cualquier tabla de
multiplicar en sus 10 primeros terminos.
el numero de la tabla debe ser 
introducido por el teclado.
 */
package ciclowhile01ejercicio;

import java.util.Scanner;

/**
 * @author Emmanuel
 * no.de control: 21700198
 * 12-oct-2021
 */
public class CicloWhile01Ejercicio {

    public static void main(String[] args) {
        Scanner tabla=new Scanner(System.in);
        
        int n=0,b=1;
        while(b==1){
        System.out.println("ingrsa el numero de la tabla que necesites: ");
        n=tabla.nextInt();
             while(b<=10){
              System.out.println(n+"x"+b+"="+(b*n));
               b=b+1;  }//fin del ciclo
             
        System.out.println("quieres continuar (1.-si 2.- no) :");
        b=tabla.nextInt();
        System.out.println(" ");
        }//02while
            
       
     //   
    }
    
}
