package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 21/11/2023               *
 * Tema: 3 Exercicis Voluntaris   *
 * Programa que converteix un     *
 * numero decimal a binari        *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  reste;
        System.out.println("Introdueix un numero: ");
        int numero = sc.nextInt();
         System.out.println("El numero en binari es llegeix de baix a dalt");
         switch (numero) {
             case 0 -> System.out.println("Zero en binari es 0");
             case 1 -> System.out.println("Un en binari es 1");
             default -> {
                 while(numero != 1){
                     reste = numero%2;
                     numero = numero/2;
                     System.out.println("Numero en binari= "+reste);
                 }    
                 System.out.println("Numero en binari= "+1);
             }
         }
     }   
 }