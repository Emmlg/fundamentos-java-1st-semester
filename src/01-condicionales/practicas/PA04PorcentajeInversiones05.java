/**
 * EJERCICIO: Porcentaje de Inversiones
 * ---------------------------------------------------------------
 * Concepto: Percentages / Proportions
 * 
 * DESCRIPCIÓN: 
 * Tres personas deciden invertir su dinero para fundar una 
 * empresa. Obtener el porcentaje que cada quien invierte con 
 * respecto a la cantidad total invertida.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: October 2021
 */
package practicas;
import java.util.Scanner;

public class PA04PorcentajeInversiones05 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        float inv1,inv2,inv3,pv1,pv2,pv3,total;
        System.out.println("¿cual es la inversion de la  primer persona ?");
        inv1=leer.nextFloat();
        System.out.println("¿cual es la inversion de la  segunda persona ?");
        inv2=leer.nextFloat();
        System.out.println("¿cual es la inversion de la  tercer persona ?");
        inv3=leer.nextFloat();
        total= inv1+inv2+inv3;
	pv1=(inv1*100)/total;
	pv2=(inv2*100)/total;
	pv3= (inv3*100)/total;
        
        System.out.println("La inversion total de $"+total);
        System.out.println("El porcentaje de la persona uno es : "+ pv1 + "%");
        System.out.println("El porcentaje de la persona dos es : "+pv2 + "%");
        System.out.println("El porcentaje de la persona tres es: "+pv3 + "%");
    }
    
}
