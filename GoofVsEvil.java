//https://www.codewars.com/kata/52761ee4cffbc69732000738
public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    
    String[] good = goodAmounts.split(" ");
    String[] evil = evilAmounts.split(" ");
    int[] newG = new int[good.length];
    int[] newE = new int[evil.length];
    int sumGood = 0;
    int sumEvil = 0;
    
    for(int i = 0; i < good.length; i++){
      newG[i] = Integer.parseInt(good[i]);
    }
    
    for(int i = 0; i < evil.length; i++){
      newE[i] = Integer.parseInt(evil[i]);
    }
    
    for(int i = 0; i < newG.length; i++){
     if(i == 0){
       sumGood += newG[i]*1;
     }else if(i == 1){
       sumGood += newG[i]*2;
     }else if(i == 2){
       sumGood += newG[i]*3;
     }else if(i == 3){
       sumGood += newG[i]*3;
     }else if(i == 4){
       sumGood += newG[i]*4;
     }else if(i == 5){
       sumGood += newG[i]*10;
     }
    }
    
    for(int i = 0; i < newE.length; i++){
     if(i == 0){
       sumEvil += newE[i]*1;
     }else if(i == 1){
       sumEvil += newE[i]*2;
     }else if(i == 2){
       sumEvil += newE[i]*2;
     }else if(i == 3){
       sumEvil += newE[i]*2;
     }else if(i == 4){
       sumEvil += newE[i]*3;
     }else if(i == 5){
       sumEvil += newE[i]*5;
     }else if(i == 6){
       sumEvil += newE[i]*10;
     }
    }
    
    System.out.println(sumGood);
    System.out.println(sumEvil);
    if(sumGood == sumEvil)return "Battle Result: No victor on this battle field";
    return sumGood > sumEvil? "Battle Result: Good triumphs over Evil":"Battle Result: Evil eradicates all trace of Good";
    //return "";
  }
}
