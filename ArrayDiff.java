//https://www.codewars.com/kata/523f5d21c841566fde000009
import java.util.ArrayList;
import java.util.Arrays;
public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    // Your code here
    if(b.length == 0)return a;
    if(a.length == 0) return a;
    boolean found = false;
    
    ArrayList<Integer> arrayListA = new ArrayList<>();
        for (int value : a) {
          for(int i = 0; i < b.length; i++){
            if(b[i] == value){
              System.out.println("b = "+b[i]);
              found = true;
            } 
          }
           if(!found){
              System.out.println("añadido = "+value);
              arrayListA.add(value);
            }
            found = false; 
        }
    int[] array = new int[arrayListA.size()];
    
    for (int i = 0; i < arrayListA.size(); i++) {
            array[i] = arrayListA.get(i);
        }
    return array;
  }
}
