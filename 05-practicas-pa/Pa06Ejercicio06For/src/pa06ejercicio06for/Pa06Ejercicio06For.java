/*5.-
Cinco miembros de un club contra la obesidad desean saber cuánto han bajado o subido de peso o si
siguen con el mismo peso desde la última vez que se reunieron. Para esto se debe realizar un ritual de
pesaje en donde cada uno se pesa en diez básculas distintas para así tener el promedio más exacto de
su peso. Si existe diferencia positiva entre este promedio de peso y el peso de la última vez que se
reunieron, significa que subieron de peso. Si la diferencia es negativa, significa que bajaron. Lo que el
problema requiere es que por cada persona se imprima un letrero que diga: “SUBIO”, “BAJO” o “IGUAL”
y la cantidad de kilos que subió o bajo de peso.

 */
package pa06ejercicio06for;

import java.util.Scanner;//Esta seccion se encarga de importar la utileria que nos permite ingresar datos de entrada y salida.


/**@author Emmanuel de Jesus López Gómez   15/oct/2021
 * no.control:21700198
 * primer Semestre Grupo"A"
 */
public class Pa06Ejercicio06For {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in); //se crea una variable para poder leer desde el teclado
        
        int fpeso = 0,pbascula = 0,sumab,diez,peso = 0,i;//son las variables que usaremos en el programa tipo entero
        
        for(i=1;i<=5;i++){//se inicia el for para el inicio de las cinco personas
            System.out.println("¡Bien venido!");//se muestra una etiqueta en la pantalla
            
            System.out.println("persona "+i);//se muestra una etiqueta en la pantalla con el numero de la persona
            System.out.print("¿cuál fue tu peso anterior? ");//se muestra una etiqueta en la pantalla
            fpeso=leer.nextInt();//es la variable que guarda informacion para comparar el peso
                  sumab=0;//es la variable que guarda informacion para la funcion del ciclo for
                 for(pbascula=1;pbascula<=10;pbascula++){// inicio de l ciclo for para sumar la cantidad de la bascula
                       System.out.println("¿cuál es tu peso en la bascula "+pbascula+":");//se muestra una etiqueta en la pantalla para verificar cuales con sus peso en las diferentes basculas
                       diez=leer.nextInt();//es la variable que guarda informacion del peso de la basculas
                         sumab=sumab+diez;//es un acumulador que sirve para guardar el peso de las basculas
                         peso =sumab/10;//es una ecuacion para sacar el promeio de las basculas
                   
                   
                 }//for de bascula
                              if(fpeso==peso){// inicio de condicional para evalual el resultado final
                                System.out.println("Tu peso es IGUAL");}//se muestra una etiqueta en la pantalla para mostrar el resultado de peso
                                else// inicio de condicional para evalual el resultado final
                                 if(fpeso>peso){// inicio de condicional para evalual el resultado final
                                   System.out.println("Tu peso BAJO");}//se muestra una etiqueta en la pantalla para mostrar resultado
                                  else  System.out.println("tu peso SUBIO");//se muestra una etiqueta en la pantalla para mostrar el resultado
                 
                 
            /*  switch(i){
                    case 1:  if(fpeso==peso){
                                System.out.println("Tu peso es IGUAL");}//se muestra una etiqueta en la pantalla para mostrar el resultado
                              else
                               if(fpeso>peso){
                                  System.out.println("Tu peso BAJO");}//se muestra una etiqueta en la pantalla para mostrar el resultado
                                  else  System.out.println("tu peso SUBIO");break;//se muestra una etiqueta en la pantalla para mostrar el resultado
                    case 2: if(fpeso==peso){
                             System.out.println("Tu peso es IGUAL");}//se muestra una etiqueta en la pantalla para mostrar el resultado
                              else{ 
                                if(fpeso>peso)
                                 System.out.println("Tu peso BAJO");//se muestra una etiqueta en la pantalla para mostrar el resultado
                                   else  System.out.println("tu peso SUBIO");}break;//se muestra una etiqueta en la pantalla para mostrar el resultado
                    case 3:  if(fpeso==peso){
                                System.out.println("Tu peso es IGUAL");}//se muestra una etiqueta en la pantalla para mostrar el resultado
                               else{
                                if(fpeso>peso)
                                  System.out.println("Tu peso BAJO");//se muestra una etiqueta en la pantalla para mostrar el resultado
                                  else  System.out.println("tu peso SUBIO");}break;//se muestra una etiqueta en la pantalla para mostrar el resultado
                    case 4:  if(fpeso==peso)
                               System.out.println("Tu peso es IGUAL");//se muestra una etiqueta en la pantalla para mostrar el resultado
                             else{
                               if(fpeso>peso)
                                  System.out.println("Tu peso BAJO");//se muestra una etiqueta en la pantalla para mostrar el resultado
                                  else System.out.println("tu peso SUBIO");}break;//se muestra una etiqueta en la pantalla para mostrar el resultado
                     case 5: if(fpeso==peso)
                               System.out.println("Tu peso es IGUAL");//se muestra una etiqueta en la pantalla para mostrar el resultado
                             else{
                             if(fpeso>peso)
                                 System.out.println("Tu peso BAJO");//se muestra una etiqueta en la pantalla para mostrar el resultado
                                 else  System.out.println("tu peso SUBIO ");}break; //se muestra una etiqueta en la pantalla para mostrar el resultado               
                    }//switch*/
        }//for general
        
        
        //
    }
    
}
