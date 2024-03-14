//https://www.codewars.com/kata/54da5a58ea159efa38000836
public class FindOdd {
	public static int findIt(int[] a) {
    int num;
    int odd = 0;
    int odd1 = 0;
    if(a.length == 1){
      return a[0];
    } else {
      
    for(int i = 0; i  < a.length; i++){
      
      for(int j = 0; j < a.length; j++){
        num = a[i];
        if(num == a[j]){
          odd1++;
        }
      }
      
      if(odd1%2 != 0){
        odd = a[i];
        break;
      }
      
    }
  	
  }
    return odd;
 }
}
