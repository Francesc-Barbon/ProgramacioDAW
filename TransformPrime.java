//https://www.codewars.com/kata/5a946d9fba1bb5135100007c
public class Solution
{
  
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
  
    public static int minimumNumber(int[] numbers)
    {
      int j = 0;;
      int total = 0;
      int sum = 0;
      for(int i = 0; i < numbers.length; i++){
        sum += numbers[i];
      }
      
     j = sum;
     while(!esPrimo(j)){
       j++;
     }
      total = j - sum;

      return total; // Do your magic!
    }
}
