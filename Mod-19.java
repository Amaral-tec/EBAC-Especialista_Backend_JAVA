package br.com.amaral;

import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentInformation {
    @Id
    private int rollno;
    private String name;


    public int getRollno() { return rollno; }

    public StudentInformation() {}

    public StudentInformation(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    public void setRollno(int rollno)
    {
        this.rollno = rollno;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
