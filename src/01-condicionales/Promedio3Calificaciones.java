/**
 * EJERCICIO: Promedio de Materias con Ponderación Específica
 * ---------------------------------------------------------------
 * Concepto: Fórmulas matemáticas complejas, uso de paréntesis y tipos flotantes.
 * 
 * DESCRIPCIÓN: 
 * Calcula el promedio general de las tres materias más difíciles (Matemáticas, Física y Química)
 * considerando que cada una tiene un sistema de evaluación distinto:
 * - Matemáticas: Examen 90%, Tareas 10% (3 tareas).
 * - Física: Examen 80%, Tareas 20% (2 tareas).
 * - Química: Examen 85%, Tareas 15% (3 tareas).
 * ---------------------------------------------------------------
 * Autor: Emmanuel López | Num. Control: 21700198
 * Fecha: Octubre 2021
 */
package condicionales;

import java.util.Scanner;

public class PromedioValidado {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        float p,cm,cf,cq,exm,tm,cem,tm1 = 0,tm2,tm3,exf,tf,cef,tf1,tf2,tf3,exq,tq,ceq,tq1,tq2,tq3;
        System.out.print("para calcular tu promedio favor de ingresa los siguientes datos:");
        System.out.println("¿cual es la calificacion de tu examen de matematicas ?");
        cem= leer.nextFloat();        
	System.out.println("¿cual es la calificacion de tu primer tarea de matematicas ?");
	tm1= leer.nextFloat();
       System.out.println("¿cual es la calificacion de tu segunda tarea de matematicas ?");
	tm2= leer.nextFloat();
        System.out.println("¿cual es la calificacion de tu tercera tarea de matematicas ?");
	tm3= leer.nextFloat();
        System.out.println("¿cual es la calificacion de tu examen de fisica ?");
	cef= leer.nextFloat();
	System.out.println("¿cual es la calificacion de tu primer tarea de fisica ?");
        tf1= leer.nextFloat();
	System.out.println("¿cual es la calificacion de tu segunda tarea de fisica ?");
	 tf2= leer.nextFloat();
	 System.out.println("¿cual es la calificacion de tu examen de Quimica ?");
	ceq= leer.nextFloat();
	System.out.println("¿cual es la calificacion de tu primer tarea de quimica ?");
	tq1= leer.nextFloat();
	 System.out.println("¿cual es la calificacion de tu segunda tarea de quimica ?");
	tq2=leer.nextFloat();
         System.out.println("¿cual es la calificacion de tu tercer tarea de quimica ? ");
        tq3=leer.nextFloat();
        
		
	
	exm=(float) (cem*0.90);
	tm =(float) (((tm1+tm2+tm3)/3)*0.10);
	cm=exm+tm;
	
	exf=(float) (cef*0.80);
	tf=(float) (((tf1+tf2)/2)*0.20);
	cf=exf+tf;
	
	exq=(float) (ceq*0.85);
	tq=(float) (((tq1+tq2+tq3)/3)*0.15);
	cq=exq+tq;
		
	p=(cm+cf+cq)/3;
	
	System.out.println("El promedio obtenido de la materia de fisica,quimica y matematicas es:"+p);
               
    }
    
}
