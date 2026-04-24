public class Boole{
 public static void main(String[] args){
  // uso do &&, (AND), ||, (OR), !

 int idade = 18;
 int salario = 1200;
   
  boolean isMaior = idade >= 18 && salario == 1200;
  boolean isMenor = idade <= 18 && salario == 200;

   System.out.println("isMaior de idade se: "+isMaior);
   System.out.println("isMenor é se: "+isMenor);
    
    float contaCorrente = 200;
    float mesadaDo = 50;
    float xbox = 1500;
    boolean isXboxPay = contaCorrente > xbox || mesadaDo > xbox;
     System.out.println("Xbox pay'if': "+isXboxPay);
 }
}
