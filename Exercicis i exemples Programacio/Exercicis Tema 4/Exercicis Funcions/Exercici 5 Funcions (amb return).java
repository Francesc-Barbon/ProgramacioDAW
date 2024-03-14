package javaapplication1;

import java.util.Scanner;


/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 17/11/2023               *
 * Tema: 4 Exemples de clase      *
 * Funció que comprova que una    *
 * hora introduida es correcta    *
 *                                *                              
 **********************************/                

 
 public class JavaApplication1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix les hores: ");
        int hores = sc.nextInt();
        System.out.println("Introdueix els minuts: ");
        int minuts = sc.nextInt();
        System.out.println("Introdueix els segons: ");
        int segons = sc.nextInt();
        if(esCorrecte(hores, minuts, segons)){
            System.out.println("Hora introduida correcta");
        } else {
            System.out.println("Hora introduida incorrecta");
        }
    }
        
          
    
    
    static boolean esCorrecte(int a , int b, int c){
        if(a < 0 || a > 23){
            return false;
        } else if (b < 0 || b > 59){
            return false;
        } else if (c < 0 || c > 59){
            return false;
        }
         return true;
    }
 }