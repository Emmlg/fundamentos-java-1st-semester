/**
 * PRÁCTICA INTEGRADORA: Control de Calcomanías (Vialidad)
 * ---------------------------------------------------------------
 * Concepto: Estructuras de control (while) y condicionales anidados (if-else).
 * 
 * DESCRIPCIÓN: 
 * El Departamento de Vialidad clasifica autos por el color de su 
 * calcomanía según el último dígito de la placa. 
 * (1-2: Amarillo, 3-4: Rosa, 5-6: Rojo, 7-8: Verde, 9-0: Azul).
 * El programa contabiliza cuántos autos de cada color entran a la ciudad.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 15 de Octubre 2021
 */
package integradoras;

import java.util.Scanner;

public class PA06ControlCalcomanias04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int digito, numAutos, contador = 1;
        int cAmarillo = 0, cRosa = 0, cRojo = 0, cVerde = 0, cAzul = 0;
      
        System.out.print("¿Cuántos autos desea registrar?: ");
        numAutos = leer.nextInt();

        while (contador <= numAutos) {
            System.out.print("Auto #" + contador + " - Último dígito de placa: ");
            digito = leer.nextInt();

            if (digito == 1 || digito == 2) cAmarillo++;
            else if (digito == 3 || digito == 4) cRosa++;
            else if (digito == 5 || digito == 6) cRojo++;
            else if (digito == 7 || digito == 8) cVerde++;
            else if (digito == 9 || digito == 0) cAzul++;
            else System.out.println("Dígito inválido (usar 0-9)");
            
            contador++;
        }

        System.out.println("
--- REPORTE DE CALCOMANÍAS ---");
        System.out.println("Amarillo: " + cAmarillo);
        System.out.println("Rosa: " + cRosa);
        System.out.println("Rojo: " + cRojo);
        System.out.println("Verde: " + cVerde);
        System.out.println("Azul: " + cAzul);
    }
}
