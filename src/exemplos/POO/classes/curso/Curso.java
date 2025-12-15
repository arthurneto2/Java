package exemplos.POO.classes.curso;

import java.time.LocalDateTime;

public class Curso {
    private String nome;
    private LocalDateTime dataInicio;
    private Professor professor;
    private Aluno[] alunos;

    public Curso(String nome, LocalDateTime dataInicio, Professor professor, Aluno[] alunos) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.professor = professor;
        this.alunos = alunos;
    }

    public double calcularMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }
        return soma / alunos.length;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
