package Contanum_2;

import java.util.Scanner;
import java.util.Arrays;

/*********** Descripció ***********
 *                                *
 * Autor: Francesc                *
 * Data: 1/12/2023                *
 * Tema: 5 Arrays                 *
 * Programa que omple 2 arrays    *
 * amb nombres entre 0 i 99       *
 * i compara quants nombres       *
 * han sortit iguals              *
 *                                *
 **********************************/

class Contanum_2{
   
    static int nombreEncerts(int[] nombres, int[] guanyadors){
        int guanyador = 0;
        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < guanyadors.length; j++){
                if(nombres[i] == guanyadors[j]){
                    guanyador++;
                }
            }
        }
        return guanyador;
    }
    
    
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] nombres = new int[6];
       int[] guanyadors = new int[6];
       for(int i = 0; i < 6; i++){
           nombres[i] = (int) (Math.random()*100);
           guanyadors[i]= (int) (Math.random()*100);
       }
       System.out.println("Numeros: "+Arrays.toString(nombres));
       System.out.println("Guanyadors: "+Arrays.toString(guanyadors));
       System.out.println("Has tengut "+nombreEncerts(nombres, guanyadors)+" encert/s");
    }
}