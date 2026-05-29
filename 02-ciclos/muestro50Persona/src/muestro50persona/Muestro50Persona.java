/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestro50persona;

import java.util.Scanner;

/**
 *
 * @author LABORATORIO
 */
public class Muestro50Persona {

    public static void main(String[] args) {
       
        
        Scanner leer=new Scanner(System.in);
        
        int persona,edad;
        float peso=0,Apersona = 0,ApesoJ=0,ApersonaJ=0,ApesoA=0,ApersonaA=0,ApesoV=0,ApersonaV=0;
        float promedioJ = 0,promedioA = 0,promedioV = 0,promedio = 0,Apeso;
        float n = 0,A = 0,J = 0,V = 0;
            Apeso=0;
            Apersona=0;
            ApersonaJ=0;
            ApesoJ=0;
            ApesoA=0;
            ApersonaA=0;
            ApesoV=0;
            ApersonaV=0;
        
        for(persona=1;persona<=3;persona++){
            System.out.println("persona "+persona+" ¿cuál es tu edad?");
            edad=leer.nextInt();
            System.out.println("¿cuál es tu peso?");
            peso=leer.nextFloat();
            
             if(edad<=12){
              Apeso=Apeso+peso;
              n++;
             // Apersona=Apersona+persona;
             // promedio=(int) (Apeso/Apersona);
            
               }else
                  if(edad<=29){
                    ApesoJ=ApesoJ+peso;
                    J++;
                    //ApersonaJ=ApersonaJ+persona;
                    // promedioJ=ApesoJ/ApersonaJ;
                    }else
                      if(edad<=59){
                       ApesoA=ApesoA+peso;
                        A++;
                       // ApersonaA=ApersonaA+persona;
                      // promedioA=ApesoA/ApersonaA;
                        }else
                         ApesoV=ApesoV+peso;
                          V++;
                          // ApersonaV=ApersonaV+persona;
                         //promedioV=ApesoV/ApersonaV;
   
                           }//fin del for
        
                         // promedio=Apeso/n;
            promedio= Apeso/n;
            promedioJ=ApesoJ/J;
            promedioV=ApesoV/V;
            promedioA=ApesoA/A;
            System.out.println("el promedio de los niños es: "+promedio);
            System.out.println("el promedio de los Jovenes es: "+promedioJ);
            System.out.println("el promedio de los Adultos es: "+promedioA);
            System.out.println("el promedio de los viejos es: "+promedioV);
        
        
        
        
     //   
    }
    
}
