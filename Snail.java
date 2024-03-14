//https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1
public class Snail {

    public static int[] snail(int[][] array) {
     //Array que vamos a ir llenando
      int finalLen = array.length*array[0].length;
      int[] finalArr = new int[finalLen];
      
       //Filas y columnas actuales que iremos modificando
      int filaSuperior = 0;
      int filaInferior = array[0].length;
      int columnaIzquierda = 0;
      int columnaDerecha = array.length;
      
      //Contador auxiliar
      int count = 0;
      //Caso de arrays vacios
      if(finalLen == 0)return finalArr;
      
      //Bucle que recorre el array
      while(count <= finalLen){
        //Recorre la fila de arriba
        for(int i = columnaIzquierda; i < columnaDerecha; i++){
          finalArr[count] = array[filaSuperior][i];
          count++;
        }
        if(count == finalLen)break;
        filaSuperior++;
        //Recorre la columna de la derecha
        for(int i = filaSuperior; i < filaInferior; i++){
          finalArr[count] = array[i][columnaDerecha - 1];
          count++;
        } 
        if(count == finalLen)break;
        columnaDerecha--;
        //Recorre la fila de abajo
        for(int i = columnaDerecha - 1; i >= columnaIzquierda; i--){
          finalArr[count] = array[filaInferior - 1][i];
          count++;
        }
        if(count == finalLen)break;
        filaInferior--;
        //Recorre la columna de la izquierda
        for(int i = filaInferior - 1; i >= filaSuperior; i--){
          finalArr[count] = array[i][columnaIzquierda];
          count++;
        }
        if(count == finalLen)break;
        columnaIzquierda++;
      }
      
    return finalArr;
  
  }
}
