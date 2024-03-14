//https://www.codewars.com/kata/514b92a657cdc65150000006
public class Solution {

  public int solution(int number) {

    int count = 0;
    int sum = 0;
    for(int i = 0; i <= number; i++){
      count++;
    }
    int[] numeros = new int[count];
    for(int i = 1; i < numeros.length; i++){
      numeros[i] = i;
    }
  
    for(int i = 0; i < numeros.length - 1; i++){
      if(numeros[i]%3 == 0||numeros[i]%5 == 0){
        sum += i;
      }
    }
    return sum;
  }
}
