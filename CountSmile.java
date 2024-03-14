//https://www.codewars.com/kata/583203e6eb35d7980400002a
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      // Just Smile :)
      int count = 0;
      String patron = "^[:;][-~]?[\\)D]$";
      Pattern patern = Pattern.compile(patron);
      for(int i = 0; i < arr.size(); i++){
        Matcher match = patern.matcher(arr.get(i));
        if(match.find()){
          count++;
        }
      }
    
      return count;
  }
}
