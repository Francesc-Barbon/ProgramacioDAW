//https://www.codewars.com/kata/550f22f4d758534c1100025a
import java.util.ArrayList;
public class DirReduction {
  
    public static boolean isOpposite(String a, String b){
      
      String north = "NORTH";
      String south = "SOUTH";
      String west = "WEST";
      String east = "EAST";
      
      if((a == north && b == south)||(b == north && a == south)){
        return true;
      } else if((a == west && b == east)||(b == west && a == east)){
        return true;
      }
      return false;
    }
  
    public static String[] dirReduc(String[] arr) {
        // Your code here.
      ArrayList<String> dir = new ArrayList<String>();
      int len = arr.length;
      int count = 0;
      
      //Fill the arrayList
      for(int i = 0; i < len; i++){
        dir.add(arr[i]);
      }
      
  

      System.out.println(dir);
      
      while(count < dir.size()){
        //If we get to the end of the list without coincidences
        if(dir.size() - 1 == count){
          break;
        }
        
        if(isOpposite(dir.get(count), dir.get(count + 1))){
          dir.remove(count);
          dir.remove(count);
          count = 0;
          
        } else {

          count++;

        }
        
      }
      
      
      
      
        String[] array = dir.toArray(new String[dir.size()]);
        return array;
    }
}
