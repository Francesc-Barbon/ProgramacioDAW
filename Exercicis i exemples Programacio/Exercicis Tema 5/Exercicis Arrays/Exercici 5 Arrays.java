package Contanum_2;

import java.util.Scanner;
import java.util.Arrays;

/*********** Descripció ***********
 *                                *
 * Autor: Francesc                *
 * Data: 1/12/2023                *
 * Tema: 5 Arrays                 *
 * Programa que omple un          *
 * array amb nombres aleatoris    * 
 * entre 0 i N i els mostra       *
 * per pantalla                   *
 *                                *
 **********************************/

class Contanum_2{
    
    static int[] omplirParells(int longitut, int fi){
        int[] array = new int[longitut];
        int i = 0;
        while(i < longitut){
            int aleatori = (int) ((Math.random()*(fi + 1));
            if (aleatori%2 == 0){
                array[i] = aleatori;
                i++;
            } 
        }
        return array;
    }
    
    
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int longitut, fi;
       System.out.println("Introdueix la longitut de l'array: ");
       longitut = sc.nextInt();
       System.out.println("Introdueix el maxim nombre aleatori: ");
       fi = sc.nextInt();
       
       System.out.println(Arrays.toString(omplirParells(longitut, fi)));
       
    }
}