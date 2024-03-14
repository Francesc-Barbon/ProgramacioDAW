package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 24/11/2023               *
 * Tema: 4 Exercicis voluntaris   *
 * Programa que compta els        *
 * N primers numeros parells      *
 *                                *
 **********************************/


   public class JavaApplication2{
    
     static void nombresParells(int n){
         for(int i = 1; i <= n; i++){
             if(i%2 == 0){
                System.out.println(""+i+" es un numero parell");
             }
         }
     }
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int numero = sc.nextInt();
        nombresParells(numero);
       
        
       
        }     
     }