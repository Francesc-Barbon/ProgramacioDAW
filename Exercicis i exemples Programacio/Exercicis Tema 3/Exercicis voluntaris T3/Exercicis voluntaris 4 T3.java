package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 21/11/2023               *
 * Tema: 3 Exercicis Voluntaris   *
 * Programa que calcula el MCM    *
 * entre dos numeros              *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiple, i = 1;
        System.out.println("Introdueix un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introdueix un altre numero: ");
        int numero2 = sc.nextInt();
        multiple = numero1*i;
        while(multiple/numero2 != numero1){
            multiple = numero1*i;
            i++;
        }
        System.out.println("El minim comu multiple es: "+multiple);
   
    }     
 }