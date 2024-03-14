//https://www.codewars.com/kata/5853213063adbd1b9b0000be
import java.util.ArrayList;
public class Solution{
  
  public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
    int posX = position[1];
    int posY = position[0];
    ArrayList<String> solution = new ArrayList<String>();
    for(int i = 0; i < moves.length; i++){
      
      if(posY == 0){
        
        switch(moves[i]){
            case "up":
              solution.add(fighters[posY][posX]);
              break;
            case "down":
              posY++;
              solution.add(fighters[posY][posX]);
              break;
            case "left":
              if(posX == 0){
                posX = fighters[0].length - 1;
              }else{
                posX--;
              }
              solution.add(fighters[posY][posX]);
              break;
            case "right":
              if(posX == fighters[0].length - 1){
                posX = 0;
              }else{
                posX++;
              }
              solution.add(fighters[posY][posX]);
              break;
            default:
              break;
        }
        
      } else {
        
         switch(moves[i]){
             case "up":
              posY--;
              solution.add(fighters[posY][posX]);
              break;
             case "down":
              solution.add(fighters[posY][posX]);
              break;
             case "left":
              if(posX == 0){
                posX = fighters[0].length - 1;
              }else{
                posX--;
              }
              solution.add(fighters[posY][posX]);
              break;
             case "right":
              if(posX == fighters[0].length - 1){
                posX = 0;
              }else{
                posX++;
              }
              solution.add(fighters[posY][posX]);
              break;
             default:
              break;
         }
      }
    }
    
    String[] sol = new String[solution.size()];
    for(int i = 0; i < solution.size(); i++){
      sol[i] = solution.get(i);
    }

    return sol;
  }
}
