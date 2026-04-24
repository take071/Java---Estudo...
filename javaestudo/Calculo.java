import java.util.Scanner;
public class Calculo{
 
 static Scanner Leitor = new Scanner(System.in);

static float pedir(){
    return Float.parseFloat(Leitor.nextLine());
}

static char pe(){
    return Leitor.nextLine().trim().charAt(0);
}
    static void esperar(){try{Thread.sleep(6000);}
        catch(Exception e){}
    }

     static void limpar(){
         for(int i = 0; i < 35; i++){System.out.println();}}

    static float soma(float a, float b){
        float c;
         c = a + b;
         return c;
    }
    
    static float divi(float a, float b){
        float c;
         c = a / b;
       if( b == 0){ System.out.println("impossivel dividir por zero");}
          return c;
    }
     
      static float sub(float a, float b){
          float c;
           c = a - b;
            return c;
      }
     
      static float multi(float a, float b){
          float c;
          c = a * b;
           return c;
      }
   public static void main(String[] args){
       float a,b,c;
       limpar();
        System.out.println("Bem-vindo ao programa de calculadora em Java");
       esperar();
       limpar();
          System.out.println("o calculo sera feito com base no operador, sendo ele: +,-,* ou /");
           System.out.println("Escolha o operador: ");
          char d = pe();
       if (d == '+'){
           System.out.println("escolha um numero para somar: ");
                   a = pedir();
          System.out.println("escolha outro numero para ser somado: ");
              b = pedir();
          System.out.println("a soma é igual: " + soma(a, b));
       } else if( d == '-') {
              System.out.println("escolha um numero para subtrair: ");
                   a = pedir();
          System.out.println("escolha outro numero para subtrair: ");
              b = pedir();
             System.out.println("o valor da subtração é igual: "+ sub(a,b));
    } else if (d == '*') {
                      System.out.println("escolha um numero para multiplicação: ");
                   a = pedir();
          System.out.println("escolha outro numero para multiplicar: ");
              b = pedir();
             System.out.println("o valor da multiplicação é igual: "+ multi(a,b));
   } else if (d == '/') {
                    System.out.println("escolha um numero para dividir: ");
                   a = pedir();
          System.out.println("escolha outro numero para dividir: ");
              b = pedir();
             System.out.println("o valor da divisão é igual: "+ divi(a,b)); }
 }
}
