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
}
