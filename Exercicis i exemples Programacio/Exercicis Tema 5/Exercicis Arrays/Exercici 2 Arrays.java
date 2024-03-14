package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 23/11/2023               *
 * Tema: 5 Exercicis de classe    *
 * Programa que demana a l'usuari *
 * que ompli un array de 5        *
 * posicions i les mostri         *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        
        int array [] = new int [5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Escriu un numero: ");
    
            array[i] = sc.nextInt(); 
            
        }
         for(int i = 0; i < array.length; i++){
            System.out.println("Contingut de la posicio "+i+" de l'array: "+array[i]);    
        }
     }
 }