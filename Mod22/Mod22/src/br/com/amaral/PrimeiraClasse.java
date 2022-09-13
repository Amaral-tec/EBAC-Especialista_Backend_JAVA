package br.com.amaral;


import java.util.List;
import java.util.stream.Stream;


public class PrimeiraClasse {

    public static void main(String[] args) {
        List<Estudante> lista1 = new Estudante().estudantes();

        Stream<Estudante> lista2 = lista1.stream()
                .filter(estudante -> estudante.getSexo().equals("Feminino"));

        lista2.forEach(System.out::println);
    }


/*
  private static void listaEstudantes() {


    }

       System.out.println("****Lista dos Estudantes****");

        List<Estudante> lista = new ArrayList<Estudante>();

        Estudante a = new Estudante("Gabriel Alves", "Masculino");
        Estudante b = new Estudante("Silvio Amarante", "Masculino");
        Estudante c = new Estudante("Fabio de Melo", "Masculino");
        Estudante d = new Estudante("Galba Fernandes", "Feminino");
        Estudante e = new Estudante("Thais Araujo", "Feminino");
        Estudante f = new Estudante("Cristiane Cardoso", "Feminino");

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);

        System.out.println(lista);

    }

    private static void listaMulheres() {

        System.out.println("****Lista dos grupos Feminino e Masculino****");

        List<Estudante> pessoas = new ArrayList<Estudante>();

        Estudante a = new Estudante("Gabriel Alves", "Masculino");
        Estudante b = new Estudante("Silvio Amarante", "Masculino");
        Estudante c = new Estudante("Fabio de Melo", "Masculino");
        Estudante d = new Estudante("Galba Fernandes", "Feminino");
        Estudante e = new Estudante("Thais Araujo", "Feminino");
        Estudante f = new Estudante("Cristiane Cardoso", "Feminino");

        pessoas.add(a);
        pessoas.add(b);
        pessoas.add(c);
        pessoas.add(d);
        pessoas.add(e);

        System.out.println(pessoas);

        List<Estudante> sexoFeminino = new ArrayList<Estudante>();
        List<Estudante> sexoMasculino = new ArrayList<Estudante>();

        for (int i = 0; i < pessoas.size(); i++) {
            Estudante element = pessoas.get(i);

            if ("Feminino".equals(element.getSexo())) {
                sexoFeminino.add(element);

            } else {

                sexoMasculino.add(element);

            }

        }

        System.out.println("SEXO MASCULINO " + sexoMasculino);
        System.out.println("SEXO FEMININO " + sexoFeminino);

    } */

}