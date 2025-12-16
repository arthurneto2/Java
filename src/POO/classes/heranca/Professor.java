package POO.classes.heranca;

public class Professor extends Pessoa{
    String departamento;
    String titulacao;

    public Professor(String nome, String endereco, String cpf, String departamento, String titulacao) {
        super(nome, endereco, cpf);
        this.departamento = departamento;
        this.titulacao = titulacao;
    }

    public String saudacao() {
        return "Olá, eu sou um professor.";
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
