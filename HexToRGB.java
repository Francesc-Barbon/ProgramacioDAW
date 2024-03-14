//https://www.codewars.com/kata/5282b48bb70058e4c4000fa7
import java.util.HashMap;

public class HexToRGB {
  
  public static int hexToDec(String hex){
    String a = "0123456789ABCDEF";
    String d = "0123456789abcdef";
    int sum = 0;
    int count = 0;
    for(int i = hex.length() - 1; i >= 0; i--){
      for(int j = 0; j < a.length(); j++){
        if(hex.charAt(i) == a.charAt(j)||hex.charAt(i) == d.charAt(j)){
          sum += (j*Math.pow(16,count));
          count++;
        }
      }
    }
    
    return sum; 
  }
  
  public static HashMap<String, Integer> hexStringToRGB(String hex) {
    String r = hex.substring(1,3);
    String g = hex.substring(3,5);
    String b = hex.substring(5,7);

    
    HashMap<String, Integer> solution = new HashMap<String, Integer>();
    solution.put("r",hexToDec(r));
    solution.put("g",hexToDec(g));
    solution.put("b",hexToDec(b));

    return solution;
  }
  
}
