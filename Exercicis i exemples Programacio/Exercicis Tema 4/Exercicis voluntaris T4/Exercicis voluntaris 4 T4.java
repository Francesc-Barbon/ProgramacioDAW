package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 24/11/2023               *
 * Tema: 4 Exercicis voluntaris   *
 * Programa que compta els        *
 * tots els segons que hi ha en   *
 * N dies N hores i N minuts      *
 *                                *
 **********************************/


   public class JavaApplication2{
    
     static int segons(int dies, int hores, int minuts){
         int totals = (minuts*60) + (hores*60*60) + (dies*24*60*60);
         return totals;
     }
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix els dies: ");
        int dies = sc.nextInt();
        System.out.println("Introdueix les hores: ");
        int hores = sc.nextInt();
        System.out.println("Introdueix els minuts: ");
        int minuts = sc.nextInt();
        
        if(dies > 0 && hores > 0 && minuts > 0){
            System.out.println(segons(dies, hores, minuts));
        } else {
            System.out.println("Algun dels parametres introduits es menor que zero");
        }
       
        }     
     }