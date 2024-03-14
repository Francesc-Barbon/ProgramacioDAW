//https://www.codewars.com/kata/52efefcbcdf57161d4000091
import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {

      Map<Character, Integer> count = new HashMap<Character, Integer>();
      for(int i = 0; i < str.length(); i++){
        if(!count.containsKey(str.charAt(i))){
          count.put(str.charAt(i),1);
        }else{
          count.put(str.charAt(i),count.get(str.charAt(i))+1);
        }
      }
        return count;
    }
}
