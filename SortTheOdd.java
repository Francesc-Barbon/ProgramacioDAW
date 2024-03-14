//https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
public class Kata {
  public static int[] sortArray(int[] array) {
    int count = 0;
    boolean found = false;
    //contamos cuantos impares hay
    for(int i = 0; i < array.length; i++){
      if(array[i]%2 != 0){
        count++;
      }
    }
    //creamos y llenamos el array solo con los impares
    int[] odds = new int[count];
    count = 0;
    for(int i = 0; i < array.length; i++){
      if(array[i]%2 != 0){
        odds[count] = array[i];
        System.out.println(odds[count]);
        count++;
      }
    }
    //Ordenamos el array de impares
    while(!found){
      found = true;
      for(int i = 0; i < odds.length - 1; i++){
        if(odds[i] > odds[i + 1]){
          found = false;
          int temp = odds[i];
          odds[i] = odds[i + 1];
          odds[i + 1] = temp;
        }
      }
    }
    //Rellenamos el array original reemplazando los impares por los ordenados
     count = 0;
     for(int i = 0; i < array.length; i++){
      if(array[i]%2 != 0){
        array[i] = odds[count];
        count++;
      }
    }
    return array;
  }
}
