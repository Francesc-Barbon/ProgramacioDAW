//https://www.codewars.com/kata/57b6f5aadb5b3d0ae3000611
import java.io.*; 
import java.util.*; 
public class Kata
{
  
  
  public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
  {
    boolean order = false;
    int missing = 0;
    int menor = 100000000;
    int actual = 0;
    
    if(arrayOfArrays == null){
      return 0;
    }
    
    try{
      
    for(int i = 0; i < arrayOfArrays.length; i++){
      if(arrayOfArrays[i] == null){
       return 0;
      }
      
      menor = arrayOfArrays[i].length >= menor? menor:arrayOfArrays[i].length;
      if(menor == 0){
        return 0;
      }
    }
    
    int[] lengths = new int[arrayOfArrays.length];
    for(int i = 0; i < arrayOfArrays.length; i++){
      lengths[i] = arrayOfArrays[i].length;
    }
    
    int len = lengths.length;
    while(!order){
      order = true;
      for(int i = 0; i < len - 1; i++){
       
            if(lengths[i] > lengths[i + 1]){
              int aux = lengths[i + 1];
              lengths[i + 1] = lengths[i];
              lengths[i] = aux;
              order = false;
            
          }
        }
      }
      int miss= 0;
      for(int i = 0; i < len - 1; i++){
        if(lengths[i + 1] != lengths[i] + 1){
          miss = lengths[i] + 1;
          break;
        }
      }
        System.out.println("El valor pedido es "+miss);
        return miss;
       }catch (NullPointerException e) {
            return 0;
      }
    
  }

}
