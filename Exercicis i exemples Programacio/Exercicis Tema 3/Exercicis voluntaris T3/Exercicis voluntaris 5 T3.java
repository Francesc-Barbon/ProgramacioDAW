package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 21/11/2023               *
 * Tema: 3 Exercicis Voluntaris   *
 * Programa que calcula l'arrel   *
 * quadrada d'un numero i el      *
 * seu reste                      *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  i = 1;
        System.out.println("Introdueix un numero: ");
        int numero = sc.nextInt();
        double potencia = 0;
        while(potencia < numero){
            i++;
            potencia = Math.pow(i,2); 
        }
        if(numero - potencia == 0){
            System.out.println("L'arrel de "+numero+" es "+i+" amb reste "+(numero-potencia));
        } else {
            i--;
            potencia = Math.pow(i, 2);
            System.out.println("L'arrel de "+numero+" es "+i+" amb reste "+(numero-potencia));
        }
   
    }     
 }