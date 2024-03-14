//https://www.codewars.com/kata/586c0909c1923fdb89002031
public class Connect4 {
  
  //Atributos de la clase
  private boolean start = true;
  private int column = 7;
  private int row = 6;
  private int[][] grid = new int[row][column];
  private int currentPlayer = 1;
  boolean gameWon = false;
  
  private void drawTable(int[][] table){
    for(int i = 0; i < grid.length; i++){
      System.out.println("");
     for(int j = 0; j < grid[0].length; j++){
       System.out.print(table[i][j]);
     }
    }
  }
  
  //Metodo que reinicia el juego rellenando el tablero con 0s
  private void startGame(){
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[i].length; j++){
        grid[i][j] = 0;
      }
    }
    start = false;

  }
  //Cambia de jugador
  private int switchPlayer(int player){
    return player == 1? 2:1;
  }
  //Comprueba si hay casilla disponible en la columna deseada.
  //Si lo hay coloca ficha y retorna true si no puede retorna false.
  private boolean diskPlaced(int column, int player){
    for(int i = grid.length - 1; i >= 0; i--){
      if(grid[i][column] == 0){
        grid[i][column] = player;
        drawTable(grid);
        
        return true;
      }
    }
    return false;
  }
  
 
  /*
  * Busca la fila donde se coloco la ultima ficha y busca en ella
  * recorriendola si hay 4 fichas colocadas iguales.
  * En caso afirmativo devuelve true sino devuelve false
  */
  private boolean checkHorizontal(int column, int player){
    int row = 0;
    int counter = 0;
    
    while(grid[row][column] == 0 && row < grid.length){
      row++;
    }
    
    for(int i = 0; i < grid[row].length; i++){
      if(grid[row][i] == player){
        counter++;
         if(counter == 4){
          return true;}
      } else {
        counter = 0;
      }
    }
    return false;
  }
  
  private boolean checkVertical(int column, int player){
    int counter = 0;
    for(int i = 0; i < grid.length; i++){
      if(grid[i][column] == player){
        counter++;
        if(counter == 4){
          System.out.println("vertical found");
          return true;}
      } else {
        counter = 0;
      }
    }
    return false;
  }
  /*
  * Comprueba las diagonales retornando true si hay 4 fichas iguales o false en caso contrario
  */
  private boolean checkDiagonals(int column, int player){
    int count = 0;
    int row = 0;
    
    while(grid[row][column] == 0 && row < grid.length){ //Comprueba en que fila cayo la ficha
      row++;
    }
    
    int tempCol = column;
    int tempRow = row;
    while(!outOfBounds(grid, tempRow, tempCol)){ //Va al principio de la diagonal izquierda
      tempRow--;
      tempCol--;
    }
    tempRow++;
    tempCol++;
    while(!outOfBounds(grid, tempRow, tempCol)){ //Comprueba toda la diagonal
      if(grid[tempRow][tempCol] == player){
        count++;
      }else{
        count = 0;
      }
      if(count == 4){
        return true;
      }
      tempRow++;
      tempCol++;
    }
    
    tempCol = column;
    tempRow = row;
    count = 0;
    while(!outOfBounds(grid, tempRow, tempCol)){ //Va al principio de la diagonal derecha
      tempRow++;
      tempCol--;
    }
    tempRow--;
    tempCol++;
    while(!outOfBounds(grid, tempRow, tempCol)){ //Comprueba toda la diagonal
      if(grid[tempRow][tempCol] == player){
        count++;
      }else{
        count = 0;
      }
      if(count == 4){
        return true;
      }
      tempRow--;
      tempCol++;
    }
    return false;
  }
  /*
  * Comprueba si alguna de la condiciones de victoria se cumple
  */
  private boolean checkWin(int column, int player){
    return checkDiagonals(column, player)||checkVertical(column, player)||checkHorizontal(column, player);
  }
  /*
   * Metodo que comprueba si hay algun indice que se sale de rango
   */
   public static boolean outOfBounds(int[][] array, int row, int col) {
        try {
            int value = array[row][col];
            return false; // No se lanzó ninguna excepción, el índice está dentro de los límites
        } catch (ArrayIndexOutOfBoundsException e) {
            return true; // Se lanzó una excepción, el índice está fuera de los límites
        }
    }
  
	public String play(int column) {
    //Inicializa la partida

     
    if(gameWon)return "Game has finished!";
    if(diskPlaced(column, currentPlayer)){
      if(checkWin(column, currentPlayer)){
        gameWon = true;
        return ("Player "+currentPlayer+" wins!");
      }  
      currentPlayer = switchPlayer(currentPlayer);
      return ("Player "+(3-currentPlayer)+" has a turn");
      
    }
      
    return "Column full!";
  } 
}
