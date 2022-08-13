package br.com.amaral;

import java.util.*;

public class App {

    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);

      System.out.println("Digite o nome da pessoa separado por vírgula: ");
      String listaNomes = s.nextLine();

      String[] listaNomesSeparada = listaNomes.split(",");
      List<String> listaNomesOrdenada = new ArrayList<>(Arrays.asList(listaNomesSeparada));
      Collections.sort(listaNomesOrdenada);

      for (String nome : listaNomesOrdenada) {
        System.out.println(nome.trim());

      }

    }
}
