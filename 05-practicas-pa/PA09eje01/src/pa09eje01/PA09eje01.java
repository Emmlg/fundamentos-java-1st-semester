/*
Diseñe un programa que calcule e imprima el pago de 102 trabajadores que laboran en la Cía.
GACMAN. Los datos que se leerán serán los siguientes:
a. Las horas trabajadas
b. El sueldo por hora
c. El tipo de trabajador (1.-obrero,2.-empleado)
Para calcular los pagos considerar lo siguiente:
• Los obreros pagan 10 % de impuesto
• Los empleados pagan 10 % de impuesto.
• Los trabajadores (obreros y empleados) que reciban un pago menor de 100,000 pesos no pagan
impuesto.
• Al final se deberá imprimir el total a pagar a los trabajadores y a los empleados.
 */
package pa09eje01;

import java.util.Scanner;//esta es la libreria que nos permite hacer entrada y salida de nuestro codigo

/**@author Emmanuel de jesus  lopez gomez 12/05/2021
 *no. control 21700198
 *  Primer semestre grupo A
 */
public class PA09eje01 {
public static Scanner leer=new Scanner(System.in);//se crea una variable para poder leer nuestro codigo de manera publica

public static int tipopersona(int persona){//se crea una funcion que retorna un valor entero
    do{//creacion del ciclo do while
        System.out.print("Escribe.. \n 1.-Obrero 2.-empleado  : ");//se crea una salida para adquirir dato
        persona=leer.nextInt();//guarda el dato ingresado
    }while(persona>2||persona<0);//nos ayuda a controlar el usuario para no digitar numero diferentes de 1 y 2
   
   return persona; //se retrna la funcion llamada persona
}

public static float sueldo(float pago){// creacion de una funcion para guardar datos del sueldo
int htrabajo;// variable  tipo entero que sirve dentro del modulo
float cpago,pp,iva;//creacion de variables tipo flotantes que nos ayuda en el modulo
    System.out.print("cuantas horas trabajas:");//sale un texto al usuario
    htrabajo=leer.nextInt();//guarda el dato que se le pide al usuario
    System.out.print("cuanto ganas por hora: ");//sale un texto al usuario
    cpago=leer.nextFloat();//guarda el dato que se le pide al usuario
    pp=htrabajo*cpago;// es una operacion que nos ayuda acalcular la cantidad de sueldo
    
    if(pp<100000){//es una condicion que nos ayuda a evaluar si aplicaremos impuesto a su salario
        pago=pp;// como la condicion es verdadera re-asignams valores
    System.out.println("tu sueldo es: "+pago);//mostrarmos un mensaje en la pantalla con el resultado
    }else{//parte falsa de la condicion
    iva=(float) (pp*0.1);// calcula el impuesto de la cantidad de sueldo
    pago=pp+iva;//es la operacion donde se agrega el impuesto
    System.out.println("tu sueldo es: "+pago);//mostrarmos un mensaje en la pantalla con el resultado
    }
    
    return pago;//es el valor de etorno tipo flotante
}

    public static void main(String[] args) {
        int persona = 0,sino=0,personaw;//creacion de variables tipo entero que nos ayuda en esta seccion.
        float pago = 0,sueldoOBe = 0,sueldoTra = 0,ob=0,tr=0;//creacion de variables tipo flotante que nos ayuda en esta seccion.
        
      sueldoOBe=0;//inicializamos estas variables
      sueldoTra=0;//inicializamos estas variables
      
        do {//inicio de do-while
            personaw=tipopersona(persona);//inicializamos a los modulos
            
            if(personaw==1){//creacion de condiciones
              ob=sueldo( pago);//esta parte guarda el valor calculado dentro de los modulos
              sueldoOBe=sueldoOBe+ob;//acumulador de los sueldos de os obreros
             } else{//parte falsa de la condiciones
               tr=sueldo( pago);//guarda el valor calculado dentro del modulo de sueldo
               sueldoTra=sueldoTra+tr;//acumulador de los sueldos de los trabajadores
                }
          
            do{//inicia un do-while para regular al usuario
                System.out.print("desea continuar \n 1.-si 2.-NO :");//sale un texto al usuario
                sino=leer.nextInt();//recibe un valor del usuario
                }while(sino>2);//controla el ciclo
            
        }while(sino==1);//controla el ciclo prinicipal para continuar el programa
        
        System.out.println("la cantidad a pagar de obrero es: "+sueldoOBe);// muestra el resultado acumulado de la cantidad de sueldo de los obreros
        System.out.println("la cantidad a pagar a los trabajadores es: "+sueldoTra);// muestra el resultado acumulado de la cantidad de sueldo de los trabajadores
               
        // TODO code application logic here
    }
    
}
