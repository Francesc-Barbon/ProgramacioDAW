package javaapplication1;

import java.util.Scanner;


/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 17/11/2023               *
 * Tema: 4 Exemples de clase      *
 * Funció que retorna el major    *
 * de dos numeros                 *
 *                                *                              
 **********************************/                


 public class JavaApplication1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Introdueix el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Introdueix el segon numero numero: ");
        numero2 = sc.nextInt();
        System.out.println("El major dels dos numeros es: "+major(numero1, numero2));
        
        
    }
    
    static int major(int a, int b){
        int major = a > b? a:b;
        return major;
    }
 }