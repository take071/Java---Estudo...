import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataString{
 public static void main(String [] args){
  String str = "08-04-1978 12:30:00";
  DateTimeFormatter  formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  LocalDateTime DataComHora = LocalDateTime.parse(str, formato);
  String DataTexto = DataComHora.format(formato);
   System.out.println(DataTexto);
  
   LocalDateTime agora = LocalDateTime.now();
    String formAgr = agora.format(formato);
     System.out.println(formAgr);
 }
}
