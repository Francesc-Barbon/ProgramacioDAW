//https://www.codewars.com/kata/5862fb364f7ab46270000078
public class BasicEncrypt {

    public String encrypt(String text, int rule) {
        while(rule > 255){
          rule = rule - 256;
        }
       
        //return encrypted text;
        String result = "";
        for(int i = 0; i < text.length(); i++){
          char a;
          a = text.charAt(i);
          int b = a + rule;
          if(b > 255) b = b - 256;
          a = (char)b;
          result += a;
        }
      return result;
    }
}
