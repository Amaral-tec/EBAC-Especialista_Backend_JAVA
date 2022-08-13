package br.com.amaral;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> entradaTeclado = null;
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite os dados <nome - genero> separados por vírgula:");
        String entrada = s.nextLine();

        entradaTeclado = Arrays.asList(entrada.replaceAll("\\s+","").split(","));


        for (String nome : entradaTeclado) {
            if (nome.trim().toLowerCase(Locale.ROOT).contains("-m")) {
                masculino.add(nome);
            } else {
                feminino.add(nome);
            }
        }

        System.out.println("Classe Masculina:");
        for (String h: masculino) {
            System.out.println(h);
        }

        System.out.println();
        System.out.println("Classe Feminina:");
        for (String m: feminino) {
            System.out.println(m);
        }
        System.out.println("Relação dos grupos");
    }
}

