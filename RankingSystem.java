//https://www.codewars.com/kata/51fda2d95d6efda45e00004e
class User {
  public int rank;
  public int progress;
  public int[] ranks = {-8,-7,-6,-5,-4,-3,-2,-1,1,2,3,4,5,6,7,8}; //Rangos posibles
  
  public User(){ //Constructor de la clase inicializa los valores
    this.rank = -8;
    this.progress = 0;
  }
  /*
  * Calcula la diferencia entre los rangos de la actividad y el usuario
  */
  public int calculateDiff(int uRank, int aRank){
    int indexU = 0;
    int indexA = 0;
    for(int i = 0; i < ranks.length; i++){
      if(ranks[i] == uRank){indexU = i;}
      if(ranks[i] == aRank){indexA = i;}
    }
    return (indexA - indexU);
  }
  /*
  * Calcula cuantos puntos ha ganado en base a la diferencia de rangos
  */
  public int pointsEarned(int uRank, int aRank){
    if(calculateDiff(uRank, aRank) == 0) return 3;
    if(calculateDiff(uRank, aRank) == -1) return 1;
    if(calculateDiff(uRank, aRank) < -1) return 0;
    return (10*calculateDiff(uRank, aRank)*calculateDiff(uRank, aRank));
  }
  
  /*
  * Calcula cuantos rangos ha subido por la actividad y el resto lo guarda en progress
  */
  public void plusRanks(int uRank, int aRank){
    progress = progress + pointsEarned(uRank, aRank);
    while(progress > 100){
      progress -= 100;
      rank++;
      if(rank == 0){
        rank = 1;
      }
      if(rank == 8){
        progress = 0;
      }
    } 
    if(rank == 8){
      progress = 0;
    }
  }
  /*
  * Metodo principal
  */
  public void incProgress(int rank){
    if(rank < -8||rank == 0||rank > 8) {
      throw new IllegalArgumentException("Error");
    }
    plusRanks(this.rank, rank); 
    
  }
}
