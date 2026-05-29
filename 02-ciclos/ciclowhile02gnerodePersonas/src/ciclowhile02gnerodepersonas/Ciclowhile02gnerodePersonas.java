/*
 * determina cuantos hombres y cuantas mujeres
 * se encuentran en un grupo de N personas,
 * suponiendo que los datos son extraidos
 * alumnos por alumnos
 */
package ciclowhile02gnerodepersonas;

import java.util.Scanner;

/**
 *13-octubre-2021
 * @author Emmanuel
 * 
 */
public class Ciclowhile02gnerodePersonas {

 
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int tp=0,H=0,M=0,a;
        a=1;
        while(a==1){
        System.out.println("cual es tu genero (1.-Hombre 2.- Mujer ): ");
        
        tp=leer.nextInt();
       
                switch(tp){
                 case 1: H=H+1;  break;
                 case 2: M=M+1;  break;                
                 default: System.out.println("ingresa correctamente los numeros");
               }
          System.out.println("el total de Hombre es:"+H);
          System.out.println("El total de mujeres es: "+M);
         
            System.out.println(" ");
         System.out.println("deseas continuar(1.- si 2.- no): ");
        a=leer.nextInt();
        }//fin del ciclo while
       tp=H+M;
        System.out.println("el total de personas son: "+tp);
       
    //    
    }
    
}
