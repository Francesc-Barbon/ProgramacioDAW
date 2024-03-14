//https://www.codewars.com/kata/5a86073fb17101e453000258
import java.util.HashMap;
public class Solution {

    public static String[] sortEmotions(boolean order,String[] emotions) {
        // (ง •̀_•́)ง
      HashMap<String, Integer> emotion = new HashMap<String, Integer>();
      String[] solution = new String[emotions.length];
      boolean found = false;
      emotion.put(":D",5);
      emotion.put(":)",4);
      emotion.put(":|",3);
      emotion.put(":(",2);
      emotion.put("T_T",1);
      
      while(!found){ //Bubble sort
        found = true;
        for(int i = 0; i < emotions.length - 1; i++){
          if(emotion.get(emotions[i]) > emotion.get(emotions[i + 1])){
            String temp = emotions[i];
            emotions[i] = emotions[i + 1];
            emotions[i + 1] = temp;
            found = false;
          }
        }
      } 
      
       if(order){
        for(int i = solution.length - 1; i >= 0; i--){
          solution[i] = emotions[solution.length - 1 - i];
        }
        return solution;
      }
    return emotions;
    }
  }
