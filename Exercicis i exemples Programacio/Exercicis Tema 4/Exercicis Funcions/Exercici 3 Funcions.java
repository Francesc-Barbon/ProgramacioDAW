package javaapplication2;
import java.util.Scanner;

/*--------------------------------*
 |                                |
 | Autor: Francesc                |
 | Data: 16/11/2023               |
 | Tema: 4 Funcions               |
 | Funcio que calcula l'area      |
 | i el volum d'un cilindre       |
 |                                |
 *--------------------------------*/


   public class JavaApplication2{
    
   
     
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el valor del radi: ");
        double radi = sc.nextDouble();
        System.out.println("Introdueix el valor de l'altura: ");
        double altura = sc.nextDouble();
        System.out.println("Introdueix un (1) per calcular l'area i un (0) per calcular el volum");
        int eleccio = sc.nextInt();
        if(eleccio == 1 || eleccio == 0){
            areaVolum(radi, altura, eleccio);
        } else {
            System.out.println("L'eleccio no es correcta");
        }  
     }
     
     
       static void areaVolum(double radi, double altura, int j){
        double area, volum;
        if(j == 1){
            area = 2*Math.PI*radi*(altura+radi);
            System.out.println("L'area del cilindre es: "+area);
        } else {
            volum = Math.PI*radi*radi*altura;
            System.out.println("L'area del cilindre es: "+volum);
        }
      }
   }