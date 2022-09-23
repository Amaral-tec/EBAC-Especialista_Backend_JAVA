package br.com.amaral;

import java.util.List;
import java.util.Objects;

public class Estudante {

    private String nome;

    private String sexo;

    public Estudante() {

    }

    public Estudante(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Estudante(Estudante estudante) {
        this(estudante.getNome(), estudante.getSexo());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Estudante> estudante() {

        Estudante a = new Estudante("Gabriel Alves", "Masculino");
        Estudante b = new Estudante("Silvio Amarante", "Masculino");
        Estudante c = new Estudante("Fabio de Melo", "Masculino");
        Estudante d = new Estudante("Galba Fernandes", "Feminino");
        Estudante e = new Estudante("Thais Araujo", "Feminino");
        Estudante f = new Estudante("Cristiane Cardoso", "Feminino");
        return List.of(a,b,c,d,e,f);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return nome.equals(estudante.nome) && sexo.equals(estudante.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sexo);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "name='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
