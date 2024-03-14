package javaapplication2;
import java.util.Scanner;

/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 21/11/2023               *
 * Tema: 3 Exercicis Voluntaris   *
 * Donades hores, minuts          *
 * i segons calcula l'hora N      *
 * segons despres                 *
 *                                *
 **********************************/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica l'hora: ");
        int hora = sc.nextInt();
        System.out.println("Indica els minuts: ");
        int minut = sc.nextInt();
        System.out.println("Indica els segons: ");
        int segons = sc.nextInt();
        System.out.println("Indica el nombre de segons a incrementar: ");
        int aument = sc.nextInt();
        if(hora > 23 || minut > 59 || segons > 59){
            System.out.println("L'hora introduida no es valida");
        } else {
            for(int i = 0; i < aument; i++){
             segons++;
             if(segons == 60){
                segons = 0;
                minut++;
                if(minut == 60){
                    minut = 0;
                    hora++;
                    if(hora == 24){
                        hora = 0;
                    }
                }
            }
        }
        System.out.println("L'hora introduida "+aument+" segon/s mes tard es: "+hora+":"+minut+":"+segons);
       }
   }
}