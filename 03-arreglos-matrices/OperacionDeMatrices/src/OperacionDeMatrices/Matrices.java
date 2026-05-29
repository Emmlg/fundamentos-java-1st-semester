
package OperacionDeMatrices;





public class Matrices {
   
    //atributos
    int matriz1[][];
    int matriz2[][];
    int rmatriz[][];
    int aux1matriz[][];
    int aux2matriz[][];
    int tamanio;
  //metodo constructor
    public Matrices(int tamanio,int matriz1[][],int matriz2[][]){
    this.tamanio=tamanio;
    this.matriz1= matriz1;
    this.matriz2=matriz2;
    
    }



   
    
   // metodo


public void mostrarDatos(){


    for(int i=0;i<tamanio;i++){
     for(int j=0;j<tamanio;j++){
     System.out.print(matriz1[i][j]+" "); 
    }System.out.println(" ");}  
    
    System.out.println(" -*-*-*-");
    for(int i=0;i<tamanio;i++){
     for(int j=0;j<tamanio;j++){
     System.out.print(matriz2[i][j]+" ");    
    }System.out.println(" ");}  
    
}

// inicio metodo suma de matriz
public void sumaDeMatrices(){
   rmatriz=new int[tamanio][tamanio]; 
    System.out.println("la suma de la matriz es: \n");
      for(int i=0;i<tamanio;i++){
     for(int j=0;j<tamanio;j++){
     System.out.print(rmatriz[i][j]=rmatriz[i][j]+matriz1[i][j]+matriz2[i][j]);System.out.print(" ");
    }System.out.println(" ");}  
}
   
public void restaDeMatrices(){
   rmatriz=new int[tamanio][tamanio]; 
    System.out.println("la resta de la matriz es: \n");
      for(int i=0;i<tamanio;i++){
     for(int j=0;j<tamanio;j++){
     System.out.print(rmatriz[i][j]=rmatriz[i][j]+ matriz1[i][j]-matriz2[i][j]);System.out.print(" "); 
    }System.out.println(" ");}  

}
   
  public void multiplicacionDeMatrices(){
   rmatriz=new int[tamanio][tamanio]; 
    System.out.println("la multiplicacion de la matriz es: \n");
    

} 
   
   
    
    
    
}//fin de la clase
