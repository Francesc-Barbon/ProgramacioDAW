package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 24/11/2023               *
 * Tema: 4 Exercicis voluntaris   *
 * Programa que calcula           *
 * la distancia entre 2 punts     *
 *                                *
 **********************************/


   public class JavaApplication2{
    
     static double distancia(double x1, double y1, double x2, double y2){
         double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
         return distancia;
     }
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la primera coordenada X");
        double x1 = sc.nextDouble();
        System.out.println("Introdueix la primera coordenada Y");
        double y1 = sc.nextDouble();
        System.out.println("Introdueix la segona coordenada X");
        double x2 = sc.nextDouble();
        System.out.println("Introdueix la segona coordenada Y");
        double y2 = sc.nextDouble();
        double distancia = distancia(x1, y1, x2, y2);
        System.out.println("La distancia entre els dos punts es: "+ distancia);
        
       
        }     
     }