/* O objetivo desta tarefa é pratica a função "Boxing, Unboxing e Casting" */

package br.com.amaral;

public class Tarefa {

  public static void main(String args[] {
    
    //Boxing - "A conversão é feita automaticamente" - Segue para ilustração as duas formas (Primitivos & Wrappers)
    
    int tamanho = 100;
    Integer tamanho1 = 100;
    
    System.out.println(tamanho);
    System.out.println(tamanho1);
    
    long quantidadeL = 10000;
    Long quantidade1L = 10000
      
    System.out.println(quantidadeL);
    System.out.println(quantidade1L);
      
 
    boolean situacao = true;
    Boolean situacao1 = true;
    
    System.out.println(situacao);
    System.out.println(situacao1);
    
    
    // Unboxing
    
    long meta = Long.valueOf(123456)
    System.out.println(meta);
      
    int codigo = Integer.valueOf(700)
    System.out.println(codigo);
   
    
    //Casting
      
    int num1 = 10;
    short num2 = (short) numl;
    
    System.out.println(num1);
    System.out.println(num2);
    
    
    long numL = 123456789;
    int numI = (int) numL;
    
    System.out.println(numL);
    System.out.println(numI);
    
    int quantidade = 38;
    long quantidadeL = 10000;
    
    System.out.println(quantidade);
    System.out.println(quantidade2);
    
    }

}
