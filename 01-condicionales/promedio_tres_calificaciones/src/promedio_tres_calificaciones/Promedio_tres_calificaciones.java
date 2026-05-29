/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio_tres_calificaciones;
import java.util.Scanner;

/** autor: Emmanuel de Jesús López Gómez
    matricula:21 700 198
     Un alumno desea saber cuál será su promedio general en las tres materias más difíciles que cursa y
     cuál será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se muestra a continuación:
     La calificación de Matemáticas se obtiene de la sig. manera:Examen 90%.Promedio de tareas 10%. En esta materia se pidió un total de tres tareas.
     La calificación de Física se obtiene de la sig. manera:Examen 80%.Promedio de tareas 20%.En esta materia se pidió un total de dos tareas.
     La calificación de Química se obtiene de la sig. manera:Examen 85%.Promedio de tareas 15%.En esta materia se pidió un promedio de tres tareas.

 */
public class Promedio_tres_calificaciones {

    /**
     * @param args the command line arguments
     */
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
