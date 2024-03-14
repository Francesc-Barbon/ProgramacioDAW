//https://www.codewars.com/kata/5a7f6b615084d75df6000032
public class Stats {
  public static double[][] getMinAvgMax(int discard, double[][] data) {
    double[][] solutions = new double[data.length + 1][3];
    double min = 0;
    double max = 0;
    double avg = 0;
    double maxAvg = 0;
    int count = 1;
    int count2 = 0;

    for(int i = 0; i < data.length; i++){
      for(int j = discard; j < data[i].length - discard; j++){
       if(j == discard){ //Primera iteracion inicializa los valores min, max y avg

         count = 0;
         min = data[i][j];
         max = data[i][j];
         avg = data[i][j];
         maxAvg = maxAvg + data[i][j];
         count++;
         count2++;
         
       
       }else{ //A partir de la segunda va sustituyendo en funcion de si son mayores o menores
         
         count++;
         count2++;
         min = min >= data[i][j]? data[i][j]:min;
         max = max <= data[i][j]? data[i][j]:max;
         avg += data[i][j];
         maxAvg += data[i][j];
       }
      }
      
      avg /= count;
      solutions[i][0] = min;
      solutions[i][1] = avg;
      solutions[i][2] = max;
    }
    
    double maxMin = solutions[0][0];
    double maxMax = solutions[0][2];


    for(int i = 0; i < solutions.length - 1; i++){
    
        maxMin = maxMin >= solutions[i][0]? solutions[i][0]:maxMin;
        maxMax = maxMax <= solutions[i][2]? solutions[i][2]:maxMax;
      
    }
    
    maxAvg = maxAvg/(count2);
    solutions[data.length][0] = maxMin;
    solutions[data.length][1] = maxAvg;
    solutions[data.length][2] = maxMax;

    return solutions;
  }
}
