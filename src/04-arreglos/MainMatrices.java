
package OperacionDeMatrices;
import java.util.Scanner;


public class MainMatrices {
 static   Scanner leer= new Scanner(System.in);  
    static int tamanio;
    static  int getMatriz1[][];
   static  int getMatriz2[][];
   
 public static void getDatos(){

      System.out.print("ingresa el tamaño de la matriz: ");
     tamanio=leer.nextInt();

     
     getMatriz1=new int [tamanio][tamanio];
     getMatriz2=new int [tamanio][tamanio];
 // inicio de la matrices
     
    for(int i=0;i<tamanio;i++){
     for(int j=0;j<tamanio;j++){
    getMatriz1[i][j]=0;
    getMatriz2[i][j]=0;
    }}
    // pedir datos de la primera matriz
    System.out.println("ingrese los datos de la primera matriz");
     for(int i=0;i<tamanio;i++){
      for(int j=0;j<tamanio;j++){
   System.out.print("inserte los digitos ["+i+","+j+"] :");
    getMatriz1[i][j]=leer.nextInt();
    }} 
     
 // pedir datos de la segunda matriz
     System.out.println("ingrsa los datos de la segunda matriz");
     for(int i=0;i<tamanio;i++){
      for(int j=0;j<tamanio;j++){
   System.out.print("inserte los digitos ["+i+","+j+"] :");
    getMatriz2[i][j]=leer.nextInt();
    }}
     
 }
    
      
      
     
    
  public static void main (String[] arg){
     

         getDatos();
         Matrices op= new Matrices(tamanio,getMatriz1,getMatriz2);
         op.mostrarDatos();
         op.sumaDeMatrices();
         op.restaDeMatrices();
         op.multiplicacionDeMatrices();
                   
      
            
      
      
      
      
      
      
      
      
  }//      
}//fin de la clase
