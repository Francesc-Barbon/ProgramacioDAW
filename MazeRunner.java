//https://www.codewars.com/kata/58663693b359c4a6560001d6
public class MazeRunner {
  public static String walk(int[][] maze, String[] directions) {
    // here be dragons
    int startX = 0;
    int startY = 0;
    
    for(int i = 0; i < maze.length; i++){
      for(int j = 0; j < maze.length; j++){
        if(maze[i][j] == 2){
          startX = i;
          startY = j;
          break;
        }
      }
    }
    
    for(int i = 0; i < directions.length; i++){
      if(directions[i] == "N"){
        startX = startX - 1;
      }else if(directions[i] == "E"){
        startY = startY + 1;
      }else if(directions[i] == "W"){
        startY = startY - 1;
      }else{
        startX = startX + 1;
      }
      try{
        if(maze[startX][startY] == 0){
          continue;
        }else if(maze[startX][startY] == 1){
          return "Dead";
        }else if(maze[startX][startY] == 2){
          continue;
        }else if(maze[startX][startY] == 3){
          return "Finish";
        }
        
        } catch(IndexOutOfBoundsException ex){
          return "Dead";
      }
        
    }
    return "Lost";
  }
}
