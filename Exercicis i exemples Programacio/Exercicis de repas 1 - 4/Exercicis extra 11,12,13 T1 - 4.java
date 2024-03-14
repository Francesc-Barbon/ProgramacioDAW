package javaapplication2;
import java.util.Scanner;


/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 28/11/2023               *
 * Tema: 1 - 4 exercicis extra    *
 * Programa amb tres funcions     *
 * una que comprova si un  numero *
 * es senar i dos amb             *
 * amb sobrecarrega que compten   *
 * parells i senars entre M i N   *
 *                                *
 **********************************/


   public class JavaApplication2{
       
      static boolean senar(int numero){
        boolean esSenar = true;
        if(numero%2 != 0){
            
            return esSenar;
        }  
        return !esSenar;   
    }
      
      static void sonSenars(int numero1, int numero2){
          for(int i = numero1; i <= numero2; i++){
              if(senar(i)){
                  System.out.println("El nuemro "+i+" es senar");
              }
          }
      }
      
      static void sonSenars(int numero1, int numero2, boolean parell){
          for(int i = numero1; i <= numero2; i++){
              if(!senar(i)){
                  System.out.println("El nuemro "+i+" es parell");
              }
          }
      }
     
     
     public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introdueix un altre numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Introdueix true per parells i false per senars: ");
        boolean numero3 = sc.nextBoolean();
        if(numero3){
           sonSenars(numero1, numero2, numero3);
        } else {
          sonSenars(numero1, numero2);
     }  
   }
}