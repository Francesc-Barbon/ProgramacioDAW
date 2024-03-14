package javaapplication2;
import java.util.Scanner;
import java.lang.Math;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 24/11/2023               *
 * Tema: 5 Exercicis de classe    *
 * Programa que ostra tots els    *
 * numeros entre 0 i 99999 que    *
 * els seus digits sumen 28       *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
         
        int numero = 0, decMil = 0, mil = 0, cent = 0, dec = 0, un = 0, total = 0;
        
        for(int i = 0; i <= 9; i++){
            
                for(int j = 0; j <= 9; j++){
                    
                    for(int k = 0; k <= 9; k++){
                        
                        for(int l = 0; l <= 9; l++){
                            
                            for(int m = 0; m <= 9; m++){
                                
                                numero++;
                                decMil = numero/10000;
                                mil = (numero%10000)/1000;
                                cent = (numero%1000)/100;
                                dec = (numero%100)/10;
                                un = numero%10;
                                
                                if(decMil+mil+cent+dec+un == 28){
                                    System.out.println(numero);
                                    
                                }                       
                            }
                        }
                    }
                }
            }  
        }     
     }