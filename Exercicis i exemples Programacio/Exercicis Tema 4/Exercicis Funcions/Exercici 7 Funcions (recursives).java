package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 22/11/2023               *
 * Tema: 3 Exercicis Voluntaris   *
 * Programa que calcula el term   *
 * n-essim de la serie de         *
 * Fibonacci                      *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int numero = sc.nextInt();
        System.out.println("El terme "+numero+" de la serie de Fibonacci es: "+fibonacci(numero));
     } 
     
     
     static int fibonacci(int n){
         
         if(n == 0){
             return n;
         } else if(n == 1) {
             return n;
         }
        
         return fibonacci(n - 1) + fibonacci (n - 2);
         
     }
 }