//https://www.codewars.com/kata/55c04b4cc56a697bb0000048
import java.util.HashMap;
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) { 
      
      HashMap<Character, Integer> string1 = new HashMap<Character, Integer>();
      HashMap<Character, Integer> string2 = new HashMap<Character, Integer>();
      
      /*Crear el primer HashMap*/
      for(int i = 0; i < str1.length(); i++){
        if(!string1.containsKey(str1.charAt(i))){
          string1.put(str1.charAt(i),1);
        } else {
          string1.put(str1.charAt(i), string1.get(str1.charAt(i)) + 1);
        }
      }
      
       /*Crear el segundo HashMap*/
      for(int i = 0; i < str2.length(); i++){
        if(!string2.containsKey(str2.charAt(i))){
          string2.put(str2.charAt(i),1);
        } else {
          string2.put(str2.charAt(i), string2.get(str2.charAt(i)) + 1);
        }
      }
      int count = 0;
      /* Recorremos el HasMap del string largo y comprobamos si existe
         una clave (letra) igual en el string pequeño y si su frecuencia (valor) 
         es minimo igual que las veces que aparece en el string pequeño */
      for (Character key1 : string1.keySet()) {
            Integer value1 = string1.get(key1);
            for (Character key2: string2.keySet()){
              Integer value2 = string2.get(key2);
              if(key1 == key2 && value1 >= value2) count++;
            }
        }
      
      /*Si la condicion se cumplio para todo el HashMap pequeño retornamos true sino false*/
      if(count == string2.size())return true;
      return false;
      
      
    }
}
