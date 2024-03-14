//https://www.codewars.com/kata/526571aae218b8ee490006f4
public class BitCounting {

	public static int countBits(int n){

    int count = 0;
    String binary = "";
    //Turn number to binary
    while(n > 0){
      binary += Integer.toString(n%2);
      n /= 2;
    }
    //count ones
    for(int i = 0; i < binary.length(); i++){
      if(binary.charAt(i) == '1'){
        count++;
        }
      
    }
    return count;
	}
	
}
