/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author lopez
 */
public class Metodos {
    
    public static void main(String[] args) {
            
printprimeBetween(10,30);
           
        
//       NombreUsuario();
//       edad();    
        
    }
    
    
//
//   public static String NombreUsuario (){
//       
//       Scanner input=new Scanner(System.in);
//        String nombre;
//              
//       System.out.print("Escribe tu numbre: ");
//       nombre=input.nextLine();
//   
//   return nombre;
//   }
//   
//    public static int edad(){
//        
//        Scanner input=new Scanner(System.in);
//    int edad;
//    
//        System.out.print("Escribe tu edad: ");
//        edad=input.nextInt(); 
//    
//    return edad;
//    }
//   
   
   

   
     public static boolean isPrime(int nn){
     
     
     for(int i=2; i<=nn/2;i++){
     if(nn%i==0)
         return false;
     
     
     }
         
   return true;
     }
   
   
   public static void printprimeBetween(int start, int end){
       
    for(int i=start;i<= end;i++){
    
    if(isPrime(i))
       System.out.print(i+" ");
    
    }
    
   }
    //Done
}
