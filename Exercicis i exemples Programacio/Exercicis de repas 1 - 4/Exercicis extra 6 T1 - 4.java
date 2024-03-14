package javaapplication2;
import java.util.Scanner;


/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 25/11/2023               *
 * Tema: 1 - 4 exercicis extra    *
 * Programa que crea una figura   *
 * de N files i M columnes        *
 * amb asteriscos                 *
 *                                *
 **********************************/


   public class JavaApplication2{
    
     
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix l'altura del rectangle: ");
        int altura = sc.nextInt();
        System.out.println("Introdueix l'amplada del rectangle: ");
        int amplada = sc.nextInt();
        for(int i = 0; i < altura; i++){
          
            for(int j = 0; j < amplada; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

     }     
  }