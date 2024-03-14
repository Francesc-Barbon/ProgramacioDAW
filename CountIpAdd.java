//https://www.codewars.com/kata/526989a41034285187000de4
public class CountIPAddresses {

  public static long toDecimal(String[] array){
    long sum = 0;
    int count = 3;
    long actual = 0;
    for(int i = 0; i < array.length; i++){
      actual = Long.parseLong(array[i]);

      sum += actual*(Math.pow(256,count));

      count--;
    }
    return sum;
  }
	public static long ipsBetween(String start, String end) {
    long total = 0;
    String[] firstIP = start.split("\\.");
    String[] secondIP = end.split("\\.");
    
    total = toDecimal(firstIP) - toDecimal(secondIP);
		if(total < 0){
      total = total*(-1);
    }
    return total;
	}
}
