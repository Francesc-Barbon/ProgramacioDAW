package javaapplication2;
import java.util.Scanner;

/*--------------------------------*
 *                                |
 * Autor: Francesc                |
 * Data: 15/11/2023               |
 * Tema: 4 Funcions               |
 * Mostra tots els numeros        |
 * entre N i I de major a menor   |
 *                                |
 *--------------------------------*/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introdueix un altre numero: ");
        int numero2 = sc.nextInt();
        numerosEntre(numero1, numero2);
       
     }
     
       static void numerosEntre(int n, int i){
		 if(n == i){
			  System.out.println("No siguis trampos!!");
		 }
         else if(n > i){
             n--;
             while(n > i){
                 System.out.println(n);
                 n--;
             }
         } else {
             i--;
             while(i > n){
                System.out.println(i);
                i--;
           }
         }
      }
   }