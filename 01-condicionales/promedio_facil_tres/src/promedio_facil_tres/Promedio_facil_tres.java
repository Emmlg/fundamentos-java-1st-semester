/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio_facil_tres;
import java.util.Scanner;
/**
 *
 * @author emmanuel
 */
public class Promedio_facil_tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        float p1,p2,p3,ex,tfinal, parcial,pa,tfinal0,exam,trabajo,calificacion;
        System.out.println("ingresa la calificacion del parcial uno?");
        p1=leer.nextFloat();
        System.out.println("ingresa la calificacion del parcial dos?");
        p2=leer.nextFloat();
        System.out.println("ingresa la calificacion del parcial tres?");
        p3=leer.nextFloat();     
        System.out.println("ingresa la calificacion de tu examen?");
        ex=leer.nextFloat();        
        System.out.println("ingresa la calificacion de tu trabajo final?");
        tfinal=leer.nextFloat();
        
        parcial=(float) ((p1+p2+p3)/3);
        pa=(float) (parcial*0.55);
        exam=(float) (ex*.30);
        tfinal0=(float) (tfinal*0.15);
        
        calificacion= pa+exam+tfinal0;
        System.out.println("la calificacion del alumno es : "+calificacion);
        
        
        
        
        
        
        
        
        
    }
    
}
