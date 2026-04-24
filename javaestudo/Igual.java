public class Igual{
  public static void main(String [] args){
   
  //uso do '=', '-=', '*=', '/=', '%='

    double bonus = 1800;
    bonus -= 1000;// 800 reais
   boolean isTrue  = bonus == 800;
 
    System.out.println("Istrue se despesas do salário: "+isTrue);
    
    bonus += 1000;
     boolean isBigger = bonus == 1800;
       System.out.println("Istrue se bonûs do salário: "+isBigger);

   bonus *= 2;
    boolean isMulti = bonus >= 2600 || bonus >= 3600;
     System.out.println("Ismulti se bonûs do salário for: "+isMulti); 

  bonus /= 2;
   int extra = 200;
   boolean isDivi = bonus == 1800 && extra == 120;
    System.out.println("Isdivi se: "+isDivi);
  
   bonus %= 2;
   boolean isSobra = bonus == 0;
    System.out.println("IsSobra se for igual a: "+isSobra);

 }
}
