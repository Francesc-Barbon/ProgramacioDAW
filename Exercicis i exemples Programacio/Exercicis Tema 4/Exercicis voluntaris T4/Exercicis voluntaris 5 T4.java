package javaapplication2;
import java.util.Scanner;


/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 25/11/2023               *
 * Tema: 4 Exercicis voluntaris   *
 * Programa que calcula elsminuts *        
 * que han passat entre dues      *
 * hores introduides per l'usuari *       
 *                                *
 **********************************/


   public class JavaApplication2{
    
     static int diferencia(int hora1, int minuts1, int hora2, int minuts2){
         int totals1 = (minuts1*60) + (hora1*60*60);
         int totals2 = (minuts2*60) + (hora2*60*60);
         int diferencia = (totals1 - totals2)/60;
         return diferencia;
         
     }
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la primera hora: ");
        int hora1 = sc.nextInt();
        System.out.println("Introdueix els primers minuts: ");
        int minuts1 = sc.nextInt();
        System.out.println("Introdueix la segona hora: ");
        int hora2 = sc.nextInt();
        System.out.println("Introdueix els segons minuts: ");
        int minuts2 = sc.nextInt();
        if(hora1 > 23 || minuts1 > 59 || hora2 > 24 || minuts2 > 59 || hora1 < 0 || minuts1 < 0 || hora2 < 0 || minuts2 < 0){
            System.out.println("Hora introduida no valida");
        } else {
            System.out.println("Hora introduida no valida");
            int diferencia = diferencia(hora1, minuts1, hora2, minuts2) > 0 ? diferencia(hora1, minuts1, hora2, minuts2):-diferencia(hora1, minuts1, hora2, minuts2);
            System.out.println("La diferencia es de: "+diferencia+" minut/s");
        }
     }     
  }