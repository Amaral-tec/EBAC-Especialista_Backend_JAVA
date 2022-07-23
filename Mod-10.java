/* O objetivo desta tarefa é praticar os comandos: if, if else e else. */


package br.com.amaral;

public class PrimeiraClasse {

    public static void main(String args[]) {
        System.out.println("**** Resultado do Aluno ****");
        System.out.println("Aluno: Leandro Amaral");
        System.out.println("Diciplina: Especialista Back-End JAVA");
        System.out.println("Modulo: 10");

        int nota1 = 8;
        int nota2 = 7;
        int nota3 = 10;
        int nota4 = 6;

        int total = nota1 + nota2 + nota3 + nota4;

        int media = total / 4;
        System.out.println("Media:" + media);

        if(media<5) {
            System.out.println("Reprovado");
        }
        else if(media==5 && media>=6) {
            System.out.println("Recuperacao");
        }
        else {
            System.out.println("Aprovado");
        }

    }

}
