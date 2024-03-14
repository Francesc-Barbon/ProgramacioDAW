package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 24/11/2023               *
 * Tema: 5 Exercicis de classe    *
 * Programa que omple un array    *
 * de longitut dita per l'usuari  *
 * i mostra per pantalla el       *
 * major nombre introduit         *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
  
        
        System.out.println("Quants numeros vols instroduir?");
        
        Scanner sc = new Scanner(System.in);
        int major = 0;
        int posicions = sc.nextInt();
        int array [] = new int [posicions];
        for(int i = 0; i < array.length; i++){
            System.out.println("Escriu un numero: ");
            int numero = sc.nextInt();
            array[i] = numero;
             if(array[i] > major){
                major = array[i];
             }
        }
         System.out.println("El major nombre de l'array es: "+major);
     }     
 }