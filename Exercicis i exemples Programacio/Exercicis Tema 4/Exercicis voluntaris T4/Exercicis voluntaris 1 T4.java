package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 24/11/2023               *
 * Tema: 4 Exercicis voluntaris   *
 * Programa que demana el radi    *
 * d'una esfera i calcula         *
 * el volum i la superficie       *
 *                                *
 **********************************/


   public class JavaApplication2{
    
     static void esfera(int radi){
         double superficie, volum;
         superficie = 4*Math.PI*radi*radi;
         volum = ((4*Math.PI)/3)*radi*radi*radi;
         System.out.println("La superficie de l'esfera es: "+superficie+" i el volum es: "+volum);
     }
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el radi de l'esfera");
        int numero = sc.nextInt();
        esfera(numero);
       
        }     
     }