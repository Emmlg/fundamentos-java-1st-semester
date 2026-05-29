/*
Planteamiento:Hacer un programa, con array de registros, que gestione las calificaciones 
de los estudiantes de Secundaria en la materia de Matemáticas. 
Los datos del estudiante son:
*Número de lista Nombre
*Apellido paterno
*apellido materno
*calificación de la unidad 1
*calificación de la unidad 2
*calificación de la unidad 3
*calificación de la unidad 4
*calificación de la unidad 5
* y Promedio final (calculado). 
La calificación en cada unidad debe ser entre 0 y 100,
(debemos controlar que el usuario ingrese una calificación valida).
El programa debe incluye un Menú de Operaciones:
1. Añadir
2. Buscar
3. Eliminar
4.Informe General
5. Termina
 */
package pa10registro;

import java.util.Scanner;

/**@author Emmanuel de jesus  lopez gomez 12/06/2021
 *no. control 21700198
 *  Primer semestre grupo A
 */
public class PA10Registro {//
  static Scanner leer=new Scanner(System.in);//creacion una variable para poder leer nuesro codigo de manera publica
  
static int noreg;  //creacion de variable
static final int tamanio=10; //creacion de una variable para el tamanio del vector   
private static String vec;//es la creacionde de variable tipo privado
private static Object[] registro;//creacion del vector

//declaracion del registro, se declarar todo los componentes del registro
  static class materegisto{
       
       String nombre=" ";// variable del registro tipo cadena de palabras
       String Ncontrol=" ";// variable del registro tipo cadena de palabras
       String apema=" ";// variable del registro tipo cadena de palabras
       String apepa="0";// variable del registro tipo cadena de palabras
       int cal1=0,cal2=0,cal3=0,cal4=0,cal5=0;// variable del registro tipo entero
       float prom=0;// variable del registro tipo flotante
}            
  //lectura de registro        
   // llenado de cada  campo del registro
 static void leerregistro( materegisto[]  vecregistro ){
    float calfinal;//uso de variable ttipo flotante que servira para almacenar el promedio
     char resp='s';// creacion de variable tipo caracter     
  do{  //inicia del do-while
      materegisto regiestudiantes = new materegisto(); //creacion del modulo para poder acceder
     
        System.out.print("Nombre: ");//muestra una etiqueta de salida que le muestra al usuario
        regiestudiantes.nombre=leer.next();//recopilacion de datos
        System.out.print("\nApellido materno:  ");//muestra una etiqueta de salida que le muestra al usuario
        regiestudiantes.apema=leer.next();//recopilacion de datos
        System.out.print("\napellido paterno: ");//muestra una etiqueta de salida que le muestra al usuario
        regiestudiantes.apepa=leer.next();//recopilacion de datos
        System.out.print("\nNumero de control:");//muestra una etiqueta de salida que le muestra al usuario
        regiestudiantes.Ncontrol=leer.next();//recopilacion de datos
        System.out.print("\n Escriba las calificaciones del 0 a 100 ");//muestra una etiqueta de salida que le muestra al usuario
        do{//inicio del do-while para que se repita si el usuario coloca un dato invalido
          System.out.print("\ncalificacion de unidad 1 : ");//muestra una etiqueta de salida que le muestra al usuario
          regiestudiantes.cal1=leer.nextInt();}//recopilacion de datos
          while(regiestudiantes.cal1<0|| regiestudiantes.cal1>100); //fin del do-while       
        do{//inicio del do-while para que se repita si el usuario coloca un dato invalido
            System.out.print("\ncalificacion de unidad 2 : ");//muestra una etiqueta de salida que le muestra al usuario
            regiestudiantes.cal2=leer.nextInt();}//recopilacion de datos
        while(regiestudiantes.cal2<0|| regiestudiantes.cal2>100);//fin del do-while
        do{//inicio del do-while para que se repita si el usuario coloca un dato invalido
          System.out.print("\ncalificacion de unidad 3 : ");//muestra una etiqueta de salida que le muestra al usuario
          regiestudiantes.cal3=leer.nextInt();}//recopilacion de datos
          while(regiestudiantes.cal3<0|| regiestudiantes.cal3>100);//fin del do-while
        do{//inicio del do-while para que se repita si el usuario coloca un dato invalido
            System.out.print("\ncalificacion de unidad 4 : ");//muestra una etiqueta de salida que le muestra al usuario
            regiestudiantes.cal4=leer.nextInt();}//recopilacion de datos
        while(regiestudiantes.cal4<0|| regiestudiantes.cal4>100);//fin del do-while
        do{//inicio del do-while para que se repita si el usuario coloca un dato invalido
          System.out.print("\ncalificacion de unidad 5 : ");//muestra una etiqueta de salida que le muestra al usuario
          regiestudiantes.cal5=leer.nextInt();}//recopilacion de datos
        while(regiestudiantes.cal5<0|| regiestudiantes.cal5>100);//fin del do-while
       
        //Se pasan los datos de registro a una casilla del Vector
        vecregistro[noreg]=regiestudiantes;
          noreg++;//va umentando uno en uno
        
       calfinal=(regiestudiantes.cal1+regiestudiantes.cal2+regiestudiantes.cal3+regiestudiantes.cal4+regiestudiantes.cal5)/5;//calcula el promedio
       regiestudiantes.prom=calfinal;//guarda elpromedio en el campo de promedio
          
          if(noreg==tamanio-1){//condicion que ayuda a checar si la casilla esta lleno
              System.out.println("Ya no hay espacio Disponible");//muestra una etiqueta de salida que le muestra al usuario
              resp=leer.next().charAt(0);//guarda el dato
          }else{//parte falsa de la condicion
              System.out.print("Desea incluir un nuevo registro? \n [S/N] :");//muestra una etiqueta de salida que le muestra al usuario
              resp=leer.next().charAt(0);//guarda el dato
              }        
            
  }while(resp=='s'||resp=='S'&& noreg<tamanio-1);//fin del do-while
          
}
 
 
 static void buscarregistro(materegisto[]  vecregistro){//creacion del modulo de busqueda de datos 
 
 int numcas;//variable tipo entero que funciona para checar las casillas
 String Ncontrol_1;// variable tipo cadena de caracter
 char ans='s';//variable tipo caracter
 
    do{ //inicio del Do-while
          numcas=-1;//declaramos que el numero de casilla es igual a menos 1 porque el subindice del vector inicia en 0
          System.out.print("Escriba el numero de contol que desea buscar: ");//muestra una etiqueta de salida que le muestra al usuario
          Ncontrol_1=leer.next();////guarda dato tipo pedido anteriormente
           for(int i=0; i<noreg; i++){//inicio del for para la busqueda de la casilla
               if(vecregistro[i].Ncontrol.equals(Ncontrol_1)){//esta condicion de  sirve para indicar que cuando el numero de control lo encuentra sera igual a la variable de Ncontrol_1
                  numcas=i; break; }//termina el for
           }//for
      
          if(numcas>-1){//inicio del if
          
         System.out.print("\nsu posicion es:"+numcas);//muestr una etiqueta al usuario con el dato de casillas
         System.out.print("\nNumero de control:"+vecregistro[numcas].Ncontrol); //muestr una etiqueta al usuario con el dato de numero de control  
         System.out.print("\nNombre completo: "+vecregistro[numcas].nombre+" "+vecregistro[numcas].apepa+" "+vecregistro[numcas].apema);//muestr una etiqueta al usuario con el dato de nombre,apellido materno,apellido paterno
         System.out.print("\ncalificacion de la unidad 1: "+vecregistro[numcas].cal1); //muestr una etiqueta al usuario con el dato de calificaciiones de la unidad 1
         System.out.print("\ncalificacion de la unidad 2 : "+vecregistro[numcas].cal2);//muestr una etiqueta al usuario con el dato de calificaciiones de la unidad 2
         System.out.print("\ncalificacion de la unidad 3 : "+vecregistro[numcas].cal3); //muestr una etiqueta al usuario con el dato de calificaciiones de la unidad 3
         System.out.print("\ncalificacion de la unidad 4 : "+vecregistro[numcas].cal4);//muestr una etiqueta al usuario con el dato de calificaciiones de la unidad 4
         System.out.print("\ncalificacion de la unidad 5 : "+vecregistro[numcas].cal5);//muestr una etiqueta al usuario con el dato de calificaciiones de la unidad 5
         System.out.println("\n con un promedio de: "+vecregistro[numcas].prom);//muestr una etiqueta al usuario con el dato de promedio
         System.out.println("Desea buscar otro numero de control [S/N]: ");//muestra una etiqueta de salida que le muestra al usuario
         ans=leer.next().charAt(0);//guarda el dato que se pidio
          }else{//parte falsa
              System.out.println("El numero de control no esta disponible");//muestra una etiqueta de salida que le muestra al usuario
              System.out.println("Desea buscar otro numero de control [S/N]: ");//muestra una etiqueta de salida que le muestra al usuario
              ans=leer.next().charAt(0);//guarda dato
          }      
      }while(ans=='s'||ans=='S');//fin del cilo Do-while
 
 }// busqueda
 
 
 static void eliminar(materegisto[]  vecregistro){//creacion del modulo que elimina los datos
  int numcas;// creacion de variables tipo entero
 String Ncontrol_1;// creacion de variables tipo cadena de caracter
 char ans='s';// creacion de variables tipo caracter
 
 do{//inicio de do_while
        numcas=-1;
         System.out.print("Introduzca el No. de control a Eliminar: ");//muestra una etiqueta de salida que le muestra al usuario
         Ncontrol_1=leer.next();//guarda el dato pedido
         for(int i=0; i<noreg; i++){//inicia el recorrido con FOR
            if(vecregistro[i].Ncontrol.equals(Ncontrol_1)){//en esta condicion cuarda el valor de la casilla del vector encontrado
               numcas=i; break;//el valor de la casilla encontrada se pasa a numcas
                    }
             }
          if(numcas>-1){//inicio de condicion
            System.out.print("Está seguro de Eliminar los datos del Registro [S/N]? ");//muestra una etiqueta de salida que le muestra al usuario
            ans=leer.next().charAt(0);//guarda el dato
            
          if(ans=='S'||ans=='s'){//inicio de condicion
          vecregistro[numcas].Ncontrol=" "; //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].nombre=" "; //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].apepa=" ";  //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].apema=" "; //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].cal1=0; //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].cal2=0; //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].cal3=0; //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].cal4=0; //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].cal5=0; //le da un nuevo valor neutro a ese campo de registro
          vecregistro[numcas].prom=0; //le da un nuevo valor neutro a ese campo de registro
          
          System.out.println("Registro ELIMINADO");//muestra una etiqueta de salida que le muestra al usuario
                }
               } else
              System.out.println("El numero Control solicitado No se encuentra");//muestra una etiqueta de salida que le muestra al usuario
              System.out.print("Desea Eliminar otra Registro [S/N]? ");//muestra una etiqueta de salida que le muestra al usuario
              ans=leer.next().charAt(0);//guarda el dato
           }while(ans=='S'||ans=='s');//fin del Do while
 
 }
 
 static void informe(materegisto[]  vecregistro){//inicio del modulo de informe
 
 System.out.println("#Control  Nombre  apellido_Materno    apellido_paterno    unidad_1    unidad_2    unidad_3    unidad_4    unidad_5    promedio ");//muestra una etiqueta de salida
 
 for(int i=0; i<noreg; i++){
 System.out.print("   "+vecregistro[i].Ncontrol+"\t   "+vecregistro[i].nombre+" \t "+vecregistro[i].apema+"       \t  "+vecregistro[i].apepa+"      \t       "+vecregistro[i].cal1+"        "+vecregistro[i].cal2+"         "+vecregistro[i].cal3+"          "+vecregistro[i].cal4+"          "+vecregistro[i].cal5+"          "+vecregistro[i].prom);//muestra una etiqueta de salida con datos de vector
     System.out.println("   ");   //salto de linea
 }
 
 }//
 // programa principal
    public static void main(String[] args) {
  
        int menu;//variable tipo entero
        char tecla=' ';//variable tipo caracter
         materegisto vecregistro[]=new materegisto[tamanio];//creacion del vector
      
         do{//inicio de do-while
             System.out.println("\n");
            System.out.println("                     --------Gestion de calificaciones-------");//muestra una etiqueta de salida que le muestra al usuario
            System.out.println("                      ****MENÚ DE OPCIONES****");//muestra una etiqueta de salida que le muestra al usuario
            System.out.println("                             1.Añadir");//muestra una etiqueta de salida que le muestra al usuario
            System.out.println("                             2. Buscar");//muestra una etiqueta de salida que le muestra al usuario
            System.out.println("                             3. Eliminar");//muestra una etiqueta de salida que le muestra al usuario
            System.out.println("                             4. Informe general");//muestra una etiqueta de salida que le muestra al usuario
            System.out.println("                             5. Salir");//muestra una etiqueta de salida que le muestra al usuario
               do{System.out.print("\n                     ¿Que operción realizará? ");//muestra una etiqueta de salida que le muestra al usuario
                menu=leer.nextInt();}while(menu<1||menu>5);//fin del do-While 
               
        switch(menu){//inicio de un switch para poder acceder a los modulos
             case 1: leerregistro(vecregistro); break;//accesa en el modulo de leer el registro cuando digite 1
             case 2: buscarregistro(vecregistro); break;//accesa en el modulo de leer el registro cuando digite 2
             case 3: eliminar(vecregistro); break;//accesa en el modulo de leer el registro cuando digite 3
             case 4: informe(vecregistro); break;//accesa en el modulo de leer el registro cuando digite 4
             case 5: System.out.println("*-** PROGRAMA TERMANDO *-*-*");}       //muestra una etiqueta de salida que le muestra al usuario
                          
          }while(menu!=5);//fin del ciclo del do-while
        
        // TODO code application logic here
    }
    
}
