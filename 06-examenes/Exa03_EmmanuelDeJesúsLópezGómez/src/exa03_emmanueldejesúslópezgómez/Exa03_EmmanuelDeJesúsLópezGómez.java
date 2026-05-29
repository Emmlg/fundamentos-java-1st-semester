/*
@author Emmanuel dejesús López Gómez  25/oct/2021
 *no.Control:21700198
Una compañía de seguros tiene contratados a n vendedores. Cada uno hace tres ventas (con diferentes montos) a la semana.
Su política de pago es que un vendedor recibe un sueldo base, y un 10% extra por comisiones de sus ventas.
El gerente de la compañía desea saber cuánto dinero obtendrá en la semana cada vendedor
tomando en cuenta su sueldo base y sus comisiones, 
y cuanto dinero pagará a la semana por los n vendedores.
*/
package exa03_emmanueldejesúslópezgómez;

import java.util.Scanner;//Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.

public class Exa03_EmmanuelDeJesúsLópezGómez {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);//se crea una variable para poder leer desde el teclado
     float salario,v1,v2,v3,venta,comision,sueldoT,ATvendedor;//son las variables que usaremos en el programa tipo flotante,decimales
     int sino;//son las variables que usaremos en el programa tipo Entero
        ATvendedor=0;// aqui le damos un valor a esta variable que nos servira de contador en el programa
        do{//inicio del ciclo do-While
            System.out.println("Bienvenido!");//inicio del codigo con un mensaje de salida
            System.out.println("¿cuál es el salario del vendedor ?");//iniciamos con una pregunta para saber el sueldo base de la persona
            salario=leer.nextFloat();// esta variable nos sirve para guardar la cantidad de su sueldo
            System.out.println("¿cuál fue el monto de la primera venta?");// es una etiqueta de salida que nos ayuda a recopilar informacion para las operaciones futuras
            v1=leer.nextFloat();//es la variable que nos ayuda a guardar el valor de la primer venta que nos servira despues
            System.out.println("¿cuál fue el monto de la segunda venta?");// es una etiqueta de salida que nos ayuda a recopilar informacion para las operaciones futuras
            v2=leer.nextFloat();//es la variable que nos ayuda a guardar el valor de la segunda venta que nos servira despues
            System.out.println("¿cuál fue el monto de la tercera venta?");// es una etiqueta de salida que nos ayuda a recopilar informacion para las operaciones futuras
            v3=leer.nextFloat();//es la variable que nos ayuda a guardar el valor de la tercera venta que nos servira despues
            venta=v1+v2+v3;//en esta parte sumamos el total de las ventas para calcular la comision
           comision=venta*10/100;//aqui realizamos una operacion para calcular el cuanto corresponde de comision por las tres venta que realizo el vendedor
           sueldoT=salario+comision;//aqui calculamos el  sueldo final de la persona por medio de la suma de su sueldo base y la comision correspondiente
            System.out.println("El sueldo del vendedor mas la comision es:"+sueldoT);//es una etiqueta de salidad para indicar cuanto es su seldo final
            ATvendedor=ATvendedor+sueldoT;//este es un acumulador que nos ayudara para ir sumando el sueldo final de cada vendedor
            System.out.println("---------------------------------------------");//etiqueta de salida de lineas
            System.out.println("¿Quiere ingresar un nuevo vendedor?");//esta seccion del codigo es una etiqueta de salida que nos servira para recopilar informacion y saber si el programa seguira corriendo
            System.out.println("ingrese...");//etiqueta de salidad
            System.out.println("1.-Si, 2.-ver el total a pagar a la semana");//es una etiqueta de salidad que nos ayuda a mostrarle el usuario si desea  continuar
            sino=leer.nextInt();//es una variable importante ya que esta almacena la informacion que servira en la condicion del while para que funcione el codigo
        }while(sino==1);//fin del do-while, aunque esta parte es importante porque se evalua el cilo while, nos sirve para saber si se cumple la condicion o no
        System.out.println("El dinero a pagar a la semana por los n vendedores es: " +ATvendedor);// en el caso que nose cumplio la condicion delwhile, enesta parte el programa muestra el resultado del pago total de los vendedores
        
        
        
        
        
    //    
    }
    
}
