package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 15/11/2023               *
 * Tema: 4 Funcions               *
 * Funcio que fa Eco N vegades    *
 *                                *
 **********************************/


   public class JavaApplication2{
    
    
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int numero = sc.nextInt();
        eco(numero);
    }


     static void eco(int n){
         for(int i = 0; i < n; i++){
            System.out.println("Eco");
         }
     }
  }