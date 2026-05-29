/*

 */
package demoregistro;

import java.util.Scanner;

/**
 *
 * @author lopez
 */
public class DEmoregistro {
    
static Scanner leer = new Scanner(System.in);
static int NoReg;
static final int tamanio=10;

    private static String vecReg;
    private static Object[] Est;


//Declaración del Registro
static class datosEstudiante{
     String NoCtrl =" ";
     String Nombre = " ";
     String ApePat = "0";
     String ApeMat = " ";
     char Genero =' ';
      int Edad =0;
}


//Módulo: Llenado del array de registros
static void leerRegistro(datosEstudiante[] vecRegEst){
     char resp='S';
          do{
         datosEstudiante regEstud = new datosEstudiante();
         
        System.out.print(" No. Control: "); 
        regEstud.NoCtrl=leer.next();
        System.out.print(" Nombre: "); 
        regEstud.Nombre=leer.next();
        System.out.print("Apellido Paterno: "); 
        regEstud.ApePat=leer.next();
        System.out.print("Apellido Materno: "); 
        regEstud.ApeMat=leer.next();
        System.out.print(" Género: ");
        regEstud.Genero=leer.next().charAt(0);
        System.out.print(" Edad: "); 
        regEstud.Edad=leer.nextInt();
       //Se pasan los datos de registro a una casilla del Vector
             vecRegEst[NoReg]=regEstud;
                          NoReg++;
          if(NoReg==tamanio-1){
            System.out.println("Arreglo lleno. No hay espacio disponible!!");
            resp=leer.next().charAt(0);
            } else{
                System.out.print("Desea incluir un nuevo registro [S/N]? ");
                resp=leer.next().charAt(0);
               }
             }while(resp=='S'||resp=='s'&&NoReg<tamanio-1);
          
}

               //Módulo: Búsqueda de un registro dentro del arreglo de registros
static void buscarReg(datosEstudiante[] vecRegEst){
int NoCasilla;
String t_NoCtrl;
char resp='S';
        do{
            NoCasilla=-1;
            System.out.print("Introduzca el No. de control a buscar: ");
            t_NoCtrl=leer.next();
           for(int i=0; i<NoReg; i++){
                if(vecRegEst[i].NoCtrl.equals(t_NoCtrl)){
                  NoCasilla=i; break;
                      }
                    }
          if(NoCasilla>-1){
            System.out.println(" Posición: "+NoCasilla);
            System.out.println(" No. Control: "+vecRegEst[NoCasilla].NoCtrl);
            System.out.println(" Nombre: "+vecRegEst[NoCasilla].Nombre);
            System.out.println("Apellido Paterno: "+vecRegEst[NoCasilla].ApePat);
            System.out.println("Apellido Materno: "+vecRegEst[NoCasilla].ApeMat);
            System.out.println(" Género: "+vecRegEst[NoCasilla].Genero);
            System.out.println(" Edad: "+vecRegEst[NoCasilla].Edad);
           } else
             System.out.println("El No. Control solicitado No se encuentra ");
             System.out.print("Desea realizar otra búsqueda [S/N]? ");
             resp=leer.next().charAt(0);
         }while(resp=='S'||resp=='s');
}


           //Módulo: Eliminar de un registro dentro del arreglo de registros
static void eliminarReg(datosEstudiante[] vecRegEst){
int NoCasilla;
String t_NoCtrl;
char resp='S';
      do{
        NoCasilla=-1;
         System.out.print("Introduzca el No. de control a Eliminar: ");
         t_NoCtrl=leer.next();
         for(int i=0; i<NoReg; i++){
            if(vecRegEst[i].NoCtrl.equals(t_NoCtrl)){
               NoCasilla=i; break;
                    }
             }
          if(NoCasilla>-1){
            System.out.print("Está seguro de Eliminar los datos del Registro [S/N]? ");
            resp=leer.next().charAt(0);
            
          if(resp=='S'||resp=='s'){
          vecRegEst[NoCasilla].NoCtrl=" "; 
          vecRegEst[NoCasilla].Nombre=" ";
          vecRegEst[NoCasilla].ApePat=" ";
          vecRegEst[NoCasilla].ApeMat=" ";
          vecRegEst[NoCasilla].Genero=' '; 
          vecRegEst[NoCasilla].Edad=0;
          System.out.println("Registro ELIMINADO");
                }
               } else
              System.out.println("El No. Control solicitado No se encuentra");
              System.out.print("Desea Eliminar otra Registro [S/N]? ");
              resp=leer.next().charAt(0);
           }while(resp=='S'||resp=='s');
}
//Módulo: Informe. Muestra en pantalla todos los registros que están en el arreglo.
static void Informe(datosEstudiante[] vecRegEst){
    
System.out.println("No.Ctrl\tNombre\tPaterno\tMaterno\tGenero\tEdad");

   for(int i=0; i<NoReg; i++){
     System.out.println(vecRegEst[i].NoCtrl+"\t"+vecRegEst[i].Nombre+"\t"+vecRegEst[i].ApePat+"\t"+vecRegEst[i].ApeMat+"\t"+vecRegEst[i].Genero+"\t"+vecRegEst[i].Edad);
     } 
  
}


//PROGRAMA PRINCIPAL Se crea un Menú dónde se invocarán (llamar, ejecutar) los
//módulos: leerRegistro(), buscarReg(), eliminarReg e Informe().



//            *-*-*-*-*-* principal*-*-*-*

public static void main(String[] args) {
    
int opcion=0;
char tecla=' ';
//Creación de una variable (instancia) arreglo de tipo registro
 
datosEstudiante vecRegEst[] = new datosEstudiante[tamanio];
         do{
            System.out.println("-CONTROL DE ESTUDIANTES-");
            System.out.println(" MENÚ DE OPCIONES");
            System.out.println("1. Añadir");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Informe general");
            System.out.println("5. Salir");
            System.out.print("\nQue operción realizará? ");
            opcion=leer.nextInt();
             if(opcion<1||opcion>5){
              System.out.println("ERROR!! Precione -C- para continuar");
              tecla=leer.next().charAt(0);
               } else {
             switch(opcion){
             case 1: leerRegistro(vecRegEst); break;
             case 2: buscarReg(vecRegEst); break;
             case 3: eliminarReg(vecRegEst); break;
             case 4: Informe(vecRegEst); break;
             case 5: System.out.println("PROGRAMA TERMANDO");
             }
 
                       }
             
         }while(opcion!=5);
         
}
}

  