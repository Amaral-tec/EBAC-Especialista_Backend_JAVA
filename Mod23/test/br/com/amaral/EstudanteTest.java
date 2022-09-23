package br.com.amaral;

import org.junit.Test;
import java.util.List;
import java.util.stream.Stream;

public class EstudanteTest {

    @Test
    public static void main(String[] args) {
        List<Estudante> lista = new Estudante().estudante();
        Stream<String> stream = lista.stream()
                .filter(estudante -> estudante.getSexo().equals("Feminino"))
                .map(Estudante::getNome);

        boolean result = lista.stream()
                    .allMatch(estudante -> estudante.getSexo().equals("Feminino"));
        System.out.println(result);

    }
}

