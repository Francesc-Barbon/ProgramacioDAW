package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 21/11/2023               *
 * Tema: 3 Exercicis Voluntaris   *
 * Programa que mostra tots els   *
 * numeros primers entre          *
 * 1 i N                          *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int numero = sc.nextInt();
        boolean esPrimer;
        for(int i = numero; i > 1; i--){
            esPrimer = true;
            for(int j = (int)(Math.sqrt(i - 1)); j > 1; j--){
                int primer = i%j;
                if(primer == 0){
                    esPrimer = false;
                    break;
                } 
                
            }
            if(esPrimer){
                System.out.println(""+i+" es primer");
            } else {
                System.out.println(""+i+" no es primer");
            }
        }
        if(numero > 0){
            System.out.println("1 es primer");
        } else {
            System.out.println("Has introduit 0 o negatiu");
        }
   }
}
   
   