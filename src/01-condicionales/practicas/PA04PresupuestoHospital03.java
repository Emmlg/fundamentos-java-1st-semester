/**
 * EJERCICIO: Presupuesto de Hospital
 * ---------------------------------------------------------------
 * Concepto: Percentages / Budget Distribution
 * 
 * DESCRIPCIÓN: 
 * En un hospital existen tres áreas: Ginecología, Pediatría, 
 * Traumatología. El presupuesto anual del hospital se reparte 
 * conforme a la sig. tabla: 
 * Ginecología 40%, Traumatología 30%, Pediatría 30%.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: October 2021
 */
package practicas;

import java.util.Scanner;

public class PA04PresupuestoHospital03 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        float pa,r0,r1,r2;
        System.out.println("¿ cual es el presupuesto anual de este ano?");
        pa=leer.nextFloat();
        r0=(float) (pa*0.40);
	r1=(float) (pa*0.30);
	r2=(float) (pa*0.30);
        
        System.out.println("El presupuesto para el departamento de ginecologia es: $"+r0);
        System.out.println("El presupuesto para el departamento de pedriatria es: $"+r1);
        System.out.println("El presupuesto para el departamento de Traumatologia es: $"+r2);
    }
    
}
