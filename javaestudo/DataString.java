import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class DataString{
 public static void main(String [] args){
  String str = "30-12-2026 00:00:00";

  DateTimeFormatter  formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 

  LocalDateTime DataComHora = LocalDateTime.parse(str, formato);
   String DataTexto = DataComHora.format(formato);

     System.out.println(DataTexto);

   LocalDateTime agora = LocalDateTime.now();
    String formAgr = agora.format(formato);
     System.out.println(formAgr);

 Duration duracao =  Duration.between(agora, DataComHora);
 long segundos = duracao.toSeconds();
   System.out.println("faltam: "+segundos+" segundos");
  
   if (DataComHora.isAfter(agora)){
      System.out.println("olá  guys");}
 else{ 
 System.out.println("tá barril.");
  }   
 }
}
