//https://www.codewars.com/kata/592e830e043b99888600002d
public class Solution{
  public static int[] encode(String message, int key) {
    String keys = Integer.toString(key);
    int a;
    int count = 0;
    int[] solution = new int[message.length()];
    for(int i = 0; i < message.length(); i++){

      a = message.charAt(i) - 96;
      a = a + Character.getNumericValue(keys.charAt(count));
      count++;
      if(count == keys.length()) count = 0;
      solution[i] = a;
      
    }
    return solution;
  }
}
