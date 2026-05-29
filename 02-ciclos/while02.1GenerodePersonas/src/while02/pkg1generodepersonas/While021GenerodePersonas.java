/*
 * determina cuantos hombres y cuantas mujeres
 * se encuentran en un grupo de N personas,
 * suponiendo que los datos son extraidos
 * alumnos por alumnos
 */
package while02.pkg1generodepersonas;

import java.util.Scanner;

/**
 *13-octubre-2021
 * @author Emmanuel
 */
public class While021GenerodePersonas {

    public static void main(String[] args) {
       
        Scanner leer= new Scanner(System.in);
        
        int contador=1,tp,H=0,M=0,g;
        int sino=1;
        while(sino==1){
        
        
        System.out.println("cuantas personas son: ");
        tp=leer.nextInt();        
        
        while(contador<=tp){
        
            System.out.println("persona "+contador+" ¿Que genero eres? (1.-Mujer 2.-Hombre) :");
             g=leer.nextInt();
             contador=contador+1;
             if(g==1){
                 M=M+1;             
             }//fin de if
             else{
               H=H+1;
             }//fin de else
             System.out.println("El total de mujeres es: "+M);
             System.out.println("el total de Hombre es:"+H);
             System.out.println(" ");
        }//fin de while111
        
        tp=H+M;
        System.out.println("el total de personas son: "+tp);
        System.out.println(" ");
        System.out.println("deseas continuar:(1.-si 2.-no ):");
        sino=leer.nextInt();
        }
        
        //
    }
    
}
