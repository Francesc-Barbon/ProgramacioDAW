//https://www.codewars.com/kata/525caa5c1bf619d28c000335
public class Solution {
  /*Metodo no usado*/
  public static boolean outOfBounds(int x, int y, int[][] arr){
    try{
      int a = arr[y][x];
      return true;
    } catch(IndexOutOfBoundsException e){
      return false;
    }

  }
  
  /*METODOS QUE COMPRUEBAN UNA FILA, UNA COLUMNA Y LAS DIAGONALES*/
  public static boolean diag1(int[][] arr){
    return (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2]);
  }
  
  public static boolean diag2(int[][] arr){
    return (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0]);
  }
  
  public static boolean hor(int x, int y, int[][] arr){
    if(arr[y][x] == arr[y][x+1]&&arr[y][x] == arr[y][x+2]){
      return true;
    }
    return false;
  }
  
  public static boolean ver(int x, int y, int[][] arr){
    if(arr[y][x] == arr[y+1][x]&&arr[y][x] == arr[y+2][x]){
      return true;
    }
    return false;
  }

    public static int isSolved(int[][] board) {
      /*Comprueba las filas*/
      for(int i = 0; i < board.length; i++){
        if(hor(0, i, board)&&board[i][0] == 1) return 1;
        if(hor(0, i, board)&&board[i][0] == 2) return 2;
      }
      /*Comprueba las columnas*/
      for(int i = 0; i < board[0].length; i++){
        if(ver(i,0,board)&&board[0][i] == 1) return 1;
        if(ver(i,0,board)&&board[0][i] == 2) return 2;
      }
      /*Comprueba las diagonales*/
      if(diag1(board)&&board[0][0] == 1) return 1;
      if(diag1(board)&&board[0][0] == 2) return 2;
      if(diag2(board)&&board[0][2] == 1) return 1;
      if(diag2(board)&&board[0][2] == 2) return 2;
      
      for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[0].length; j++){
          if(board[i][j] == 0) return -1;
        }
      }
      return 0;
    }

}
