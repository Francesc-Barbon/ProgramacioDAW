package javaapplication2;
import java.util.Scanner;


/**********************************
 *                                *
 * Autor: Francesc                *
 * Data: 10/01/2024               *
 * Tema: Strings                  *
 * Programa que demana un usuari  *
 * i contrasenya i determina      *
 * si son correctes o incorrectes *
 * amb un maxim de 3 intents      *
 *                                *
 **********************************/


   public class JavaApplication2{
       
     static boolean login(String user, String pass){
         
         if(user.equals("usuario1")&& pass.equals("asdfg")){
             return true;
         }
         return false;
     }  
   
  
     
     
    
     
     
     public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu usuario");
        String user = sc.nextLine();
        System.out.println("Introduce la contraseña");
        String pass = sc.nextLine();
        int count = 0;
		
        while(!login(user,pass)&&count < 3){
            System.out.println("Vuelve a intentarlo");
            user = sc.nextLine();
            pass = sc.nextLine();
            count++;
        }
		
        if(count == 3){
            System.out.println("Mala suerte");
        } else {
            System.out.println("Correcto");
        }  
    }
}


/*
**Programa en pseudocodi**

boolean login(string user, string pass){

		if(user == "usuario1" && pass == "asdfg"){
			return true;
		}
		return false;
}
 main(){
	 write("Introduce tu usuario");
	 user = read();
	 write("Introduce tu contraseña");
	 pass = read();
	 int count = 0;
	 
	 while(!login(user,pass)&&count < 3){
		 write("Vuelve a intentarlo");
		 user = read();
		 pass = read();
		 count++;
	 }
	 if(count == 3){
		 write("Mala suerte");
	 } else {
		 write("Correcto");
	 }
	 
	 
 }

*/