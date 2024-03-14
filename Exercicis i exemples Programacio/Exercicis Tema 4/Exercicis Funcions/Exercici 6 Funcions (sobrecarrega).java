/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 17/11/2023               *
 * Tema: 4 Exemples de clase      *
 * Mitjançant sobrecarrega mira   *
 * el major entre 2 o 3 numeros   *
 *                                *                              
 **********************************/                

 
 public class JavaApplication1{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quant numeros vols comparar 2 o 3?");
        int comparar = sc.nextInt();
		int major = 0;
        switch (comparar){
                case 2:
                     System.out.println("Introdueix els dos numeros: ");
					 int a = sc.nextInt();
					 int b = sc.nextInt();
                     major = esMajor(a, b);
                     break;
                case 3:
                     System.out.println("Introdueix els tres numeros: ");
                     int a = sc.nextInt();
					 int b = sc.nextInt();
					 int c = sc.nextInt();
                     major = esMajor(a, b, c);
                default:
                     System.out.println("Nomes es poden comparar 2 o 3 valors");
                     break;
        }
        
		System.out.println(major);
        
    }
        
           
    static int esMajor(int a , int b, int c){
        int major1 = esMajor(a, b);
		int major2 = esMajor(major1, c);
        return major2;
    }
        
    static int esMajor(int a, int b){
            int major = a > b? a:b;
            return major;
    }
 }