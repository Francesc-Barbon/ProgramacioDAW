//Exercici 1 bucles encapsulats
//Mostra totes les taules de multiplicar de l'1 al 10   
   
	public class JavaApplication2{
    
		public static void main(String[] args) {
 
			for(int i = 1; i <= 10; i++){
				System.out.println("Taula del " + i);
        
				for (int j = 1; j <= 10; j++){
					System.out.println(i + " x " + j + " = " + i*j);     
				}   
				System.out.println("");    
                                                      
			}
		}
    }