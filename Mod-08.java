package br.com.amaral;

public class Operadores {

    public static void main(String arg[]) {
        operacoesAritmeticas();
    }


public static void operacoesAritmeticas() {
        System.out.println("**** operacoesAritmeticas ****");
        int nota1 = 1015;
        int nota2 = 2000;
        int nota3 = 2050;
        int nota4 = 3080;
  
        int total = nota1 + nota2 + nota3 + nota4;
  
        int media = total / 4;

        System.out.println(total);
        System.out.println(media);
  
    }
}

