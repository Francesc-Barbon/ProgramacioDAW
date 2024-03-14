//https://www.codewars.com/kata/525f50e3b73515a6db000b83
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String number = Arrays.toString(numbers);
    
    number = number.replaceAll("[\\[\\], ]","");
    System.out.println(number);
    
    
    
    // Your code here!
    return "("+number.substring(0,3)+") "+number.substring(3,6)+"-"+number.substring(6,10);
  }
}
