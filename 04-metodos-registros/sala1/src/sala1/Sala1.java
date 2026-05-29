/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sala1;

import java.util.Scanner;

/**
 *
 * @author Emmanuel
 */
public class Sala1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
                float a,b,c;
                int numero;
        System.out.println("ingresa el primer numero : ");
        a=leer.nextFloat();
        System.out.println("ingresa el segundo numero :");
        b=leer.nextFloat();
        System.out.println("Elige la operacion que necesites");
        System.out.println(" 1.- Suma");
        System.out.println(" 2.- Resta ");
        System.out.println(" 3.- Multiplicacion");
        System.out.println(" 4.- Division");
        System.out.println("Digita un numero del 1 al 4 :");
        numero=leer.nextInt();
        
        switch(numero){
            case 1:   c=a+b;
                      System.out.println("el resultado es: "+c);
                break;
            case 2:   c=a-b;
                      System.out.println("el resultado es: "+c);
                      break;
            case 3:   c=a*b;
                      System.out.println("el resultado es: "+c);
                       break;
            case 4:  c=a/b;
                      System.out.println("el resultado es: "+c);
                      break;
            default: System.out.println("Error!!!!! solo numeros del 1-4");             
                   
        }
        
    }
    
}
