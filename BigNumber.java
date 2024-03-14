//https://www.codewars.com/kata/5287e858c6b5a9678200083c
public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String number2 = Integer.toString(number);
        int end = number2.length();
        int sum = 0;
        int rest = 0;
        int number3 = number;
        for(int i = 0; i < end; i++){
          rest = number3%10;
          sum += Math.pow(rest,end);
          number3 /= 10;
        }
       return (sum == number);
    }

}
