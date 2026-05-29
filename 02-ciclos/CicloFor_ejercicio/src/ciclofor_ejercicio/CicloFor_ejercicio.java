/*
Se desea obtener el promedio de G gripos que estan en un mismo año escolar;
siendo que cada grupo puede tener N alumnos de cada alumno puede llevar
M materias y que en todas las materias se promedia 3 calificaciones para obtener
el promedio de la materia lo que se desea desplegar es el promedio de los grupos, el 
promedio de cada grupo y el promedio de cada alumno

 */
package ciclofor_ejercicio;

import java.util.Scanner;

/**@author Emmanuel   19/oct/2021
 *no.control:21700198
 * primer Semestre Grupo"A"
 * 
 */
public class CicloFor_ejercicio {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        int g,a,m,grupos,materias,alumnos;
        float c1,c2,c3,promedioM = 0,promedioC,acumuladorM,acumuladorA,promedioA = 0;
        
        System.out.println("cuantos grupos son? ");
        g=leer.nextInt();
        
        for(grupos=1;grupos<=g;grupos++){
            System.out.println("Grupo"+grupos+"cuantos alumnos son?");
            a=leer.nextInt();
            
            acumuladorA=0;
            for(alumnos=1;alumnos<=a;alumnos++){
                System.out.println("Alumno "+alumnos+"cuantas materias tienes?");
                m=leer.nextInt();
           //   acumuladorA=acumuladorA+promedioA;
             //   promedioM=acumuladorA/alumnos;
                
                acumuladorM=0;
                for(materias=1;materias<=m;materias++){
                    System.out.println("materia: "+materias);
                     System.out.println("cul fue tu primera calificacion");
                     c1=leer.nextFloat();
                     System.out.println("cul fue tu primera calificacion");
                     c2=leer.nextFloat();
                     System.out.println("cul fue tu primera calificacion");
                     c3=leer.nextFloat();
                     promedioC=c1+c2+c3/3;
                     
                     acumuladorM=acumuladorM+promedioC;
                     promedioA=acumuladorM/m;
                    
                
                }//fin for materias
                  System.out.println("alumno"+alumnos+"tu calificacin de las materias son:"+promedioA);
                 acumuladorA=acumuladorA+promedioA;
                promedioM=acumuladorA/alumnos;
            
            }//fin for alumnos
             System.out.println("dentron de los "+a+"alumnos el promedio del grupo "+g+" es :"+promedioM);
        
        
        
        
        
        }//fin del ciclo
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
