//https://www.codewars.com/kata/52742f58faf5485cae000b9a
public class TimeFormatter {
    
    public static String formatDuration(int seconds) {
      
        int añosEnSegundos = 365 * 24 * 60 * 60;
        int diasEnSegundos = 24 * 60 * 60;
        int horasEnSegundos = 60 * 60;
        int minutosEnSegundos = 60;
        
        if(seconds == 0)return "now";
        
        int años = seconds / añosEnSegundos;
        seconds %= añosEnSegundos;

        int dias = seconds / diasEnSegundos;
        seconds %= diasEnSegundos;

        int horas = seconds / horasEnSegundos;
        seconds %= horasEnSegundos;

        int minutos = seconds / minutosEnSegundos;
        seconds %= minutosEnSegundos;
      
        //resultado dentro de un string builder
        StringBuilder resultado = new StringBuilder();
      
       
        //Casos posibles
        if (años != 0) {
            resultado.append(años);
            resultado.append(años == 1 ? " year" : " years");
        }

        if (dias != 0) {
            if (resultado.length() > 0) {
                resultado.append(", ");
            }
          
            resultado.append(dias);
            resultado.append(dias == 1 ? " day" : " days");
        }

        if (horas != 0) {
            if (resultado.length() > 0) {
                resultado.append(", ");
            }
          
            resultado.append(horas);
            resultado.append(horas == 1 ? " hour" : " hours");
        }

        if (minutos != 0) {
            if (resultado.length() > 0) {
                resultado.append(", ");
            }
          
            resultado.append(minutos);
            resultado.append(minutos == 1 ? " minute" : " minutes");
        }

        if (seconds != 0) {
            if (resultado.length() > 0) {
                resultado.append(", ");
            }
          
            resultado.append(seconds);
            resultado.append(seconds == 1 ? " second" : " seconds");
        }
        //Sustituye la ultima coma por 'and'
        for(int i = resultado.length() - 1; i >= 0; i--){

          if(resultado.charAt(i) == ','){
            resultado.replace(i, i + 1, " and");
            break;
            
          }
        }
        return resultado.toString();
    }
       
  }
