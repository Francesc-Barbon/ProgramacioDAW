import java.util.HashMap; 

//https://www.codewars.com/kata/59377c53e66267c8f6000027
public class Kata{
    public static String alphabetWar(String fight){
      HashMap<Character, Integer> sideA = new HashMap<Character, Integer>();
      HashMap<Character, Integer> sideB = new HashMap<Character, Integer>();
      
      sideA.put('w',4);
      sideA.put('p',3);
      sideA.put('b',2);
      sideA.put('s',1);
      
      sideB.put('m',4);
      sideB.put('q',3);
      sideB.put('d',2);
      sideB.put('z',1);
      
      int left = 0;
      int right = 0;
      
      for(int i = 0; i < fight.length(); i++){
        if(sideA.containsKey(fight.charAt(i))){
          left += sideA.get(fight.charAt(i));
        }else if(sideB.containsKey(fight.charAt(i))){
          right += sideB.get(fight.charAt(i));
        }else{
          continue;
        }
      }

        if(left > right){
          return "Left side wins!";
        }else if(right > left){
          return "Right side wins!";
        }
       
        return "Let's fight again!";
    }
}
