package br.com.amaral;

import java.util.List;
import java.util.Objects;

public class Estudante {

    private String name;

    private String sexo;

    public Estudante() {

    }

    public Estudante(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public Estudante(Estudante estudante) {
        this(estudante.getName(), estudante.getSexo());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Estudante> estudantes() {

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
        return name.equals(estudante.name) && sexo.equals(estudante.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sexo);
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "name='" + name + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
