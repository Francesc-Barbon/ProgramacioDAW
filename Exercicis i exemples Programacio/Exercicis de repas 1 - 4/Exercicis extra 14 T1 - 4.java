package javaapplication2;
import java.util.Scanner;


/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 28/11/2023               *
 * Tema: 1 - 4 exercicis extra    *
 * Programa complet que calcula   *
 * l'area d'un ciindre, un cub    *
 * i uns esfera i diu a l'usuari  *
 * si un volum donat per ell      *
 * cap dins la figura elegida amb *
 * les mesures elegides           *
 *                                *
 **********************************/


   public class JavaApplication2{
       
      
      static double volumCilindre(double radi, double altura){
          double volum = Math.PI*Math.pow(radi,2)*altura;
          return volum;
      }
      
      static double volumCub(double costat1, double costat2, double costat3){
          double volum = costat1*costat2*costat3;
          return volum;
      }
      
      static double volumEsfera(double radi){
          double volum = (4*Math.PI*Math.pow(radi, 3))/3;
          return volum;
      }
     
     
     public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
        System.out.println("Tria una opcio: ");
        System.out.println("Prem 1 per treballar amb un cilindre ");
        System.out.println("Prem 2 per treballar amb un cub ");
        System.out.println("Prem 3 per treballar amb una esfera ");
        int opcio = sc.nextInt();
        switch(opcio){
            case 1:
                System.out.println("Introdueix el radi del cilidre: ");
                double radi = sc.nextDouble();
                System.out.println("Introdueix l'altura del cilindre: ");
                double altura = sc.nextDouble();
                System.out.println("Introdueix el teu volum: ");
                double volum = sc.nextDouble();
                
                if(volum > volumCilindre(radi, altura)){
                    System.out.println("El volum introduit NO cap al cilindre");
                } else {
                    System.out.println("El volum introduit SI cap al cilindre");
                }
                break;
                
            case 2:
                System.out.println("Introdueix els 3 costats del cub: ");
                double costat1 = sc.nextDouble();
                double costat2 = sc.nextDouble();
                double costat3 = sc.nextDouble();
                
                System.out.println("Introdueix el teu volum: ");
                double volum2 = sc.nextDouble();
                
                if(volum2 > volumCub(costat1, costat2, costat3)){
                    System.out.println("El volum introduit NO cap al cub");
                } else {
                    System.out.println("El volum introduit SI cap al cub");
                }
                break;
                
            case 3:
                System.out.println("Introdueix el radi de l'esfera: ");
                double radi2 = sc.nextDouble();
                System.out.println("Introdueix el teu volum: ");
                double volum3 = sc.nextDouble();
                
                if(volum3 > volumEsfera(radi2)){
                    System.out.println("El volum introduit NO cap a l'esfera");
                } else {
                    System.out.println("El volum introduit SI cap a l'esfera");
                }
                
                break;
                
            default:
                System.out.println("No has introduit una opcio correcta");
                break;
        }
    }
}