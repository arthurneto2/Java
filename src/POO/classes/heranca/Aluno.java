package POO.classes.heranca;

public class Aluno extends Pessoa {
    String matricula;
    String curso;

    public Aluno(String nome, String endereco, String cpf, String matricula, String curso) {
        super(nome, endereco, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String saudacao() {
        return "Olá, eu sou um aluno.";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
