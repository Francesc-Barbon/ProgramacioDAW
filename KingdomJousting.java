//https://www.codewars.com/kata/6138ee916cb50f00227648d9
class Kata {
  
    
    static String[] joust(String[] listField, int vKnightLeft, int vKnightRight) {
    
      
      int len = listField[0].length();
      char lanceL = '>';
      char lanceR = '<';
      int countL = 0;
      int countR = 0;
      
   
      
      
      while(listField[0].charAt(countL) != lanceL){
        countL++;
      }
      while(listField[1].charAt(countR) != lanceR){
        countR++;
      }
      
      //Refuse to battle and inmediate battle cases
      if(vKnightLeft == 0 && vKnightRight == 0){
        return listField;
        
      } else if(countL == countR){
        return listField;
      }
      
      
      //Equal and different velocity
      while(countL < countR){
        
         listField[0] = moveRight(listField[0], vKnightLeft);
         countL += vKnightLeft;
         listField[1] = moveLeft(listField[1], vKnightRight);
         countR -= vKnightRight;
      }
      
      return listField;
    
     }
      
  
    public static String moveLeft(String cadena, int cantidad) {
      
        if (cadena == null || cadena.isEmpty()) {
            return cadena; 
        }

        int desplazamiento = cantidad % cadena.length();

        String nuevaCadena = cadena.substring(desplazamiento) + cadena.substring(0, desplazamiento);

        return nuevaCadena;
    }
  
  public static String moveRight(String cadena, int cantidad) {
    
      if (cadena == null || cadena.isEmpty()) {
          return cadena;
     }

      int desplazamiento = cantidad % cadena.length();
    
      int startIndex = cadena.length() - desplazamiento;
  
      String nuevaCadena = cadena.substring(startIndex) + cadena.substring(0, startIndex);

      return nuevaCadena;
  }

}
