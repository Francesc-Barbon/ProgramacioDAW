package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 23/11/2023               *
 * Tema: 5 Exercicis de classe    *
 * Programa que omple un array    *
 * amb numeros aleatoris i        *
 * les suma                       *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
  
        int array [] = new int [10];
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100 + 1);
            System.out.println(array[i]);
            
            suma += array[i];
        } 
        System.out.println("He creat 10 numeros random entre 1 i 100 i els he sumat: "+suma);
        
     }
 }