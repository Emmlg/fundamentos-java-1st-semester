/**
 * PRÁCTICA INTEGRADORA: Caja de Supermercado
 * ---------------------------------------------------------------
 * Concepto: Ciclos do-while y while anidados, acumuladores y menús.
 * 
 * DESCRIPCIÓN: 
 * Simula el proceso de cobro en un supermercado. Permite registrar 
 * múltiples clientes, capturando para cada uno el número de artículos 
 * y el precio de cada producto. Al finalizar el día, reporta el 
 * monto total recaudado en la caja.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 14 de Octubre 2021
 */
package integradoras;

import java.util.Scanner;

public class PA06CajaSupermercado05 {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int numeroA, contadorA, sino = 1;
        float sumapersona, montoT = 0, precioA;
      
        do {
            System.out.println("
--- BIENVENIDO A CAJA ---");
            System.out.print("¿Cuántos artículos compró el cliente?: ");
            numeroA = le.nextInt();
            
            sumapersona = 0;
            contadorA = 1;
            while (contadorA <= numeroA) {
                System.out.print("Precio Artículo " + contadorA + ": $");
                precioA = le.nextFloat();
                sumapersona += precioA;
                contadorA++;
            }
          
            System.out.println("Total de esta compra: $" + sumapersona);
            montoT += sumapersona;
            
            System.out.print("
Opción: (1: Nuevo Usuario, 2: Cerrar Caja): ");
            sino = le.nextInt();
        } while (sino == 1);
        
        System.out.println("
Total recaudado en el día: $" + montoT);
    }
}
