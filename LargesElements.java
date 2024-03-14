//https://www.codewars.com/kata/53d32bea2f2a21f666000256
public class Solution {
  
   public static int[] largest(int n, int[] arr) {
     
     int[] solutions = new int[n];
     boolean found = false;
     /*Bubble sort*/
     while(!found){
       found = true;
       for(int i = 0; i < arr.length - 1; i++){
         if(arr[i] > arr[i + 1]){
           int temp = arr[i];
           arr[i] = arr[i + 1];
           arr[i + 1] = temp;
           found = false;
         }
       }
     }
     /*Rellenar array*/
     for(int i = 0; i < solutions.length; i++){
       solutions[i] = arr[arr.length - n + i];
     }
     return solutions;
   }
}
