/**
 * EJERCICIO: Acumulador de Promedios Escolares
 * ---------------------------------------------------------------
 * Concepto: Ciclos for anidados, acumuladores y promedios complejos.
 * 
 * DESCRIPCIÓN: 
 * Obtiene el promedio de G grupos escolares. Cada grupo tiene N alumnos,
 * y cada alumno cursa M materias con 3 calificaciones cada una.
 * Despliega el promedio por alumno, por grupo y el promedio general.
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: 19 de Octubre 2021
 */
package practicas;

import java.util.Scanner;

public class AcumuladorConFor {
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
                acumuladorM=0;
                for(materias=1;materias<=m;materias++){
                    System.out.println("materia: "+materias);
                    System.out.println("cual fue tu primera calificacion");
                    c1=leer.nextFloat();
                    System.out.println("cual fue tu segunda calificacion");
                    c2=leer.nextFloat();
                    System.out.println("cual fue tu tercera calificacion");
                    c3=leer.nextFloat();
                    promedioC=(c1+c2+c3)/3;
                    acumuladorM=acumuladorM+promedioC;
                }
                promedioA=acumuladorM/m;
                System.out.println("alumno "+alumnos+" tu calificacion de las materias son: "+promedioA);
                acumuladorA=acumuladorA+promedioA;
            }
            promedioM=acumuladorA/a;
            System.out.println("dentro de los "+a+" alumnos el promedio del grupo "+grupos+" es: "+promedioM);
        }
    }
}
