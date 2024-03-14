package javaapplication2;
import java.util.Scanner;


/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 25/11/2023               *
 * Tema: 4 Exercicis voluntaris   *
 * Programa amb una funcio amb    *
 * sobrecarrega sobre l'exercici  *
 * anterior que ara calcula tambe *
 * X numeros aleatoris            *
 * entre 0 i 1                    *
 *                                *
 **********************************/


   public class JavaApplication2{
    
     static void aleatoris(int minim, int maxim, int quantitat){
         for(int i = 0; i < quantitat; i++){
             int aleatori = (int) (Math.random()*(maxim - minim + 1) + minim);
             System.out.println("Numero aleatori "+(i+1)+": "+aleatori);
         }
         
     }
     //No he empleat la funció només l'he deixat indicada sobre el codi
     //de l'exercici anterior
     static void aleatoris(int quantitat){
         for(int i = 0; i < quantitat; i++){
             double aleatori = Math.random();
             System.out.println("Numero aleatori "+(i+1)+": "+aleatori);
         }
     }
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el valor minim: ");
        int minim = sc.nextInt();
        System.out.println("Introdueix el valor maxim: ");
        int maxim = sc.nextInt();
        System.out.println("Introdueix la quantitat de numeros: ");
        int quantitat = sc.nextInt();
        
        if(minim < 0 || maxim < 0 || quantitat < 0){
            System.out.println("Algun parametre no es valid");
           
        } else {
            aleatoris(minim, maxim, quantitat);
            
        }
     }     
  }