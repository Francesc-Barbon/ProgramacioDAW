package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 21/11/2023               *
 * Tema: 3 Exercicis Voluntaris   *
 * Programa que calcula el MCD    *
 * entre dos numeros              *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero: ");
        int reste1, reste2;
        int numero1 = sc.nextInt();
        System.out.println("Introdueix un altre numero: ");
        int numero2 = sc.nextInt();
        int menor = numero1 < numero2? numero1:numero2;
        for(int i = menor; i > 0; i--){
            reste1 = numero1%i;
            reste2 = numero2%i;
            if(reste1 == 0 && reste2 == 0){
                   System.out.println("El maxim comu divisor es: "+i);
                   break;
                
            } 
        }
    }     
 }