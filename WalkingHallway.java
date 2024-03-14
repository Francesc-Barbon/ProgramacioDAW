//https://www.codewars.com/kata/6368426ec94f16a1e7e137fc
public class Hallway {
  public static int contact(String hallway) {
    char right = '>';
    char left = '<';
    int count = 0;
    int lastDistance = 0;
    int newDistance = 0;
    int minDistance = 0;
    for(int i = 0; i < hallway.length() - 1; i++){
      if(hallway.charAt(i) == '>' && hallway.charAt(i+1) != '>'){

        
        for(int j = i; j < hallway.length(); j++){
          if(j == hallway.length() - 1)break;
          if(hallway.charAt(j) == '<'){
            if(count == 0){
              newDistance = j -i;
              minDistance = j -i;
              count++;

              break;
            }

            newDistance = j - i;

            minDistance = newDistance < minDistance? newDistance:minDistance;

            break;
          }
        }
      }

    }
    if(minDistance == 1) return minDistance;
    if(minDistance == 0) return -1;
    if(minDistance == 2) return 1;
    if(minDistance%2 == 0)return minDistance/2;
    if(minDistance%2 != 0) return Math.round(minDistance/2) + 1;
   
    return minDistance;
    //Good luck :D
  }
}
